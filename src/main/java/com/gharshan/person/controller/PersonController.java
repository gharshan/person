package com.gharshan.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gharshan.person.model.Person;
import com.gharshan.person.model.PersonList;
import com.gharshan.person.service.PersonService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@ApiOperation(value = "Get All Persons")
	@RequestMapping(value="/persons", method= RequestMethod.GET)
	public PersonList getPersons() {
		return personService.getPersonList();
	}
	
	@ApiOperation(value = "Get a Person by First Name")
	@RequestMapping(value="/persons/{firstName}", method= RequestMethod.GET)
	public Person getPerson(@PathVariable("firstName") String firstName) {
		return personService.getPerson(firstName);
	}
	
	@ApiOperation(value = "Save a new Person")
	@RequestMapping(value="/persons", method= RequestMethod.POST)
	public void savePerson(@RequestBody Person person) {
		personService.save(person);
	}
	
	@ApiOperation(value = "Update an existing Person")
	@RequestMapping(value="/persons", method= RequestMethod.PUT)
	public void updatePerson(@RequestBody Person person) {
		personService.update(person);
	}
	
	@ApiOperation(value = "Delete a Person")
	@RequestMapping(value="/persons/{firstName}", method= RequestMethod.DELETE)
	public void deletePerson(@PathVariable("firstName") String firstName) {
		personService.delete(firstName);
	}

}
