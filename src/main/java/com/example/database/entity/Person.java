package com.example.database.entity;

public class Person {
    private Integer id;
    private String fullname;
    private String telephone;


    public Person() {
    }

    public Person(Integer id, String fullname, String telephone) {
        this.id = id;
        this.fullname = fullname;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
