package com.example.hibernate.Repository;

import com.example.hibernate.Model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {


    @Query("SELECT p FROM Person p ORDER BY p.id ")
    List<Person> findAllSortById();

    @Query(" select p from Person p where p.age=?1 ")
    List<Person> findByAge(Integer age);

    @Query("select p from Person p where p.name=?1 OR p.age=?2")
    List<Person> findByNameandAge(String name, Integer Age);

    }

