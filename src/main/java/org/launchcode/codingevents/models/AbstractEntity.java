package org.launchcode.codingevents.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

public abstract class AbstractEntity {
    @Id
    @GeneratedValue
    int id;

    @Size(min=3, message ="Name must be at least 3 characters long")
    String name;

    public AbstractEntity (String name) {
        this.name = name;
    }

    public AbstractEntity() {}

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
