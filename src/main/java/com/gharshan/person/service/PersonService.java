package com.gharshan.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gharshan.person.dao.PersonRepository;
import com.gharshan.person.errorhandler.BusinessException;
import com.gharshan.person.model.Person;
import com.gharshan.person.model.PersonList;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public PersonList getPersonList(){
		PersonList personList=new PersonList();
		personList.setPerson(personRepository.findAll());
		return personList;
	}
	
	public Person getPerson(String firstName){
		return personRepository.findByFisrtName(firstName);
	}
	
	public void save(Person person){
		if(personRepository.findByFisrtName(person.getFirstName())!=null) {
			throw new BusinessException("Person already available");
		}
		personRepository.save(person);
	}
	
	public void update(Person person){
		if(personRepository.findByFisrtName(person.getFirstName())==null) {
			throw new BusinessException("Person not available for update");
		}
		personRepository.update(person);
	}
	
	public void delete(String firstName){
		if(personRepository.findByFisrtName(firstName)==null) {
			throw new BusinessException("Person not available for deletion");
		}
		personRepository.delete(firstName);
	}
}
