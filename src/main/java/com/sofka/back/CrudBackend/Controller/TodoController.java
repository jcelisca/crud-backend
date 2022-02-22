package com.sofka.back.CrudBackend.Controller;

import java.util.List;
import java.util.Optional;

import com.sofka.back.CrudBackend.Models.Todo;
import com.sofka.back.CrudBackend.Services.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping
    public List<Todo> list(){
        return service.list();
    }

    @PostMapping
    public Todo save(@RequestBody Todo todo){
        return service.save(todo);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

    @GetMapping(path = "/{id}")
    public Optional<Todo> get(@PathVariable("id") Long id){
        return service.get(id);
    }

}