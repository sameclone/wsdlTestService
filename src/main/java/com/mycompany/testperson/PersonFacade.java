/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testperson;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Monk
 */
@Stateless
public class PersonFacade extends AbstractFacade<Person> implements PersonFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_testperson_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonFacade() {
        super(Person.class);
    }

    @Override
    public boolean insertPerson(String name, String position, String age, String salary) {
        try {
            Person person = new Person();
            person.setName(name);
            person.setPosition(position);
            person.setAge(age);
            person.setSalary(salary);
            em.persist(person);
            return true;
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }

    public Person findPersonById(int id) {
        try {

            TypedQuery<Person> query
                    = em.createNamedQuery("Person.findById", Person.class);
            query.setParameter("id", id);
            List<Person> results = query.getResultList();
            if (results.size() > 0) {
                return results.get(0);
            }

        } catch (Exception e) {
            System.err.println(e);
        }

        return null;
    }

    
    public Person findPersonByNameAndPosition(String name, String position) {
       try {

            TypedQuery<Person> query
                    = em.createNamedQuery("Person.findByNameAndPosition", Person.class);
            query.setParameter("name", name);
            query.setParameter("position", position);
            List<Person> results = query.getResultList();
            if (results.size() > 0) {
                return results.get(0);
            }

        } catch (Exception e) {
            System.err.println(e);
        }

        return null;
    }

    
}
