package com.rv.jenkinsTest;

import lombok.Getter;

@Getter
public class Employee {
    private int id;
    private String name;

    public Employee(int i, String ravi) {
        this.id = i;
        this.name = ravi;
    }
}
