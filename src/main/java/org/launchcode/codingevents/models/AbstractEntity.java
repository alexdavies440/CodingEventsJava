package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Size;

import java.util.Objects;

//This annotation instead of Entity so that values get stored in Event and EventCategory tables instead of AbstractEntity
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue
    int id;

    @Size(min=3, message ="Name must be at least 3 characters long")
    String name;

    public AbstractEntity (String name) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity entity = (AbstractEntity) o;
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
