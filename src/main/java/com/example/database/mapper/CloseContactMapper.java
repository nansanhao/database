package com.example.database.mapper;

import com.example.database.entity.CloseContact;
import com.example.database.entity.IsolationRecord;
import com.example.database.entity.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CloseContactMapper {
    List<Person> queryPersonList(Integer caseId);

    List<Person> queryStartPersonList();
}
