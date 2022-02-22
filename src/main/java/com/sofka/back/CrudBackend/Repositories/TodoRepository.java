package com.sofka.back.CrudBackend.Repositories;

import com.sofka.back.CrudBackend.Models.Todo;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>{

}
