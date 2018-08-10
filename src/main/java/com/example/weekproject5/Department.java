package com.example.weekproject5;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Department{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=4)
    private String name;

    @OneToMany(mappedBy="department",
            fetch=FetchType.EAGER,
            orphanRemoval = true)
    public Set<Course> coures;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCoures() {
        return coures;
    }

    public void setCoures(Set<Course> coures) {
        this.coures = coures;
    }
}