package com.sofka.back.CrudBackend.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

/**
 * Clase principal que contiene los atributos de los objetos que se guardan en la base de datos
 */
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private boolean isCompleted;
    public Todo() {
    }

    public Todo(Long id, String name, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", isCompleted=" + isCompleted + ", name=" + name + "]";
    }

}
