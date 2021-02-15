package com.gharshan.person.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gharshan.person.model.Person;

@Service
public class PersonRepository {
	
	private Map<String,Person> persons=new HashMap<>();
	
	public List<Person> findAll(){
		List<Person> personList=persons.values().stream().collect(Collectors.toList());
		return personList;
	}
	
	public Person findByFisrtName(String firstName){
		return persons.get(firstName);
	}
	
	public void save(Person person) {
		persons.put(person.getFirstName(),person);
	}
	
	public void update(Person person) {
		persons.put(person.getFirstName(),person);
	}
	
	public void delete(String firstName) {
		persons.remove(firstName);		
	}

}
