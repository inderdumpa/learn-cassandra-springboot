package com.learncassandra.dev.controller;

import com.learncassandra.dev.model.Person;
import com.learncassandra.dev.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/nosql")
public class PersonController {
    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person/{name}")
    public List<Person> getPerson(@PathVariable("name") String name){
        return personService.getPerson(name);
    }

    @GetMapping("/person/all")
    public List<Person> getAll(){
        return personService.getAll();
    }
}
