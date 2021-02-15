package com.gharshan.person.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gharshan.person.model.Person;
import com.gharshan.person.model.PersonList;

@SpringBootTest
public class PersonServiceTest {
	
	@Autowired
	PersonService personService;
	
	@Test
	public void getPersonListTest(){
		PersonList personList=personService.getPersonList();
		Assert.assertEquals(personList.getPerson(), null);
	}
	
	@Test
	public void getPersonTest(){
		Person person=personService.getPerson("Gharshan");
		Assert.assertEquals(person, null);
	}
}
