package com.brunel.climate.controller;

import com.brunel.climate.model.Fields;
import com.brunel.climate.repository.RegistrationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RegistrationResource {

    @Autowired
    RegistrationRepository fieldsRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/climate")
    public List<Fields> getAllUsers() {
        List<Fields> fields = new ArrayList<>();
        fieldsRepository.findAll().forEach(fields::add);
        return fields;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/climate")
    public Fields addUser(@RequestBody Fields fields) {
        fieldsRepository.save(fields);
        return fields;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(path = "/climate/{id}")
    public void deleteUser(@PathVariable long id) {
        fieldsRepository.deleteById(id);
    }


}