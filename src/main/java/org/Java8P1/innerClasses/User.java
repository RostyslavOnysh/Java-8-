package org.Java8P1.innerClasses;

import java.util.Objects;

public class User {
    private String Name;
    private int age;

    public User(String name, int age) {
        Name = name;
        this.age = age;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(Name, user.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
