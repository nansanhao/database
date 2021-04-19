package com.example.database.entity;

import java.util.List;

public class InfectResult {
    private Person person;
    private List<InfectResult> infectResultList;


    public Person getPerson() {
        return person;
    }

    public List<InfectResult> getInfectResultList() {
        return infectResultList;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setInfectResultList(List<InfectResult> infectResultList) {
        this.infectResultList = infectResultList;
    }

    public void addInfectResult(InfectResult infectResult) {
        this.infectResultList.add(infectResult);
    }

}
