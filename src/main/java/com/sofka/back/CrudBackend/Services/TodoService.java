package com.sofka.back.CrudBackend.Services;

import java.util.List;
import java.util.Optional;

import com.sofka.back.CrudBackend.Models.Todo;
import com.sofka.back.CrudBackend.Repositories.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> list(){
        return (List<Todo>)repository.findAll();
    }

    public Todo save(Todo todo){
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Optional<Todo> get(Long id){
        return (Optional<Todo>) repository.findById(id);
    }
}
