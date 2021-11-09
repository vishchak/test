package com.company;

import java.util.Objects;

public class New {
    private Long age;
    private String name;
    public New(Long age, String name) {
        this.age = age;
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "New{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        New aNew = (New) o;
        return Objects.equals(age, aNew.age) && Objects.equals(name, aNew.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
