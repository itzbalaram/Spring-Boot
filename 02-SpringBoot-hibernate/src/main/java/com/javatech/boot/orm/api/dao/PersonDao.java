package com.javatech.boot.orm.api.dao;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javatech.boot.orm.api.model.Person;

@Repository
@Transactional
public class PersonDao {

	@Autowired
	private SessionFactory factory;
	
	public void savePerson(Person person){
		getSession().save(person);
	}
	
	/*
	 * @SuppressWarnings("unchecked") public List<Person> getPerson{
	 * 
	 * return getSession().createCriteria(Person.class).list(); }
	 */
	private Session getSession() {
		Session session = factory.getCurrentSession();
		if(session == null) {
			session = factory.openSession();
		}
		return session;
	}
}
