package com.example.database.mapper;

import com.example.database.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface PersonMapper {
    List<Person> queryAll();

    List<Person> getPerson(@Param(value = "id") Integer id);

    void deletePerson(Integer id);
}
