package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.Department;

import java.io.Serializable;

public class DepartmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    // Construtor padrão
    public DepartmentDTO() {
    }

    // Construtor com parâmetros
    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Construtor que aceita uma entidade Department
    public DepartmentDTO(Department entity) {
        // Use os métodos getter para acessar as propriedades da entidade
        this.id = entity.getId();
        this.name = entity.getName();
    }

    // Getters e Setters
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
}
