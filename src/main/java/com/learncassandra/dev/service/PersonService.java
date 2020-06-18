package com.learncassandra.dev.service;


import com.learncassandra.dev.model.Person;

import java.util.List;

public interface PersonService {
    public String savePerson(Person person);
    public List<Person> getPerson(String name);
    public List<Person> getAll();
}
