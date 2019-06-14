package com.javatech.boot.orm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.boot.orm.api.dao.PersonDao;
import com.javatech.boot.orm.api.model.Person;

@RestController
public class PersonController {

	@Autowired
	PersonDao personDao;
	
	@PostMapping("/save")
	public String save(@RequestBody Person person) {
		personDao.savePerson(person);
		return "Success";
	}
}
