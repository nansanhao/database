package com.example.database.service.impl;

import com.example.database.entity.CloseContact;
import com.example.database.entity.InfectResult;
import com.example.database.entity.Person;
import com.example.database.mapper.CloseContactMapper;
import com.example.database.service.CloseContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CloseContactServiceImpl implements CloseContactService {
    @Autowired
    private CloseContactMapper closeContactMapper;

    private List<InfectResult> getPersonInfected(List<Person> people) {
        List<InfectResult> infectResultList = new ArrayList<InfectResult>();
        for (Person person : people) {
            InfectResult infectResult = new InfectResult();
            infectResult.setPerson(person);
            List<Person> personList = closeContactMapper.queryPersonList(person.getId());
            infectResult.setInfectResultList(getPersonInfected(personList));
            infectResultList.add(infectResult);
        }
        return infectResultList;
    }

    @Override
    public List<InfectResult> getInfectChain() {
        List<Person> people = closeContactMapper.queryStartPersonList();
        return this.getPersonInfected(people);
    }
}
