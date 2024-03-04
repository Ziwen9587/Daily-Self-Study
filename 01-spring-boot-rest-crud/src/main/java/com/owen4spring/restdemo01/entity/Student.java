package com.owen4spring.restdemo01.entity;

public class Student {
    private int id;
    private String lastName;
    private String firstname;

    public Student(){

    }


    public Student(int id, String lastName, String firstname) {
        this.id = id;
        this.lastName = lastName;
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
