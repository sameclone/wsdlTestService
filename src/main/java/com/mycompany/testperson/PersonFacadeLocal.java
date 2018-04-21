/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testperson;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Monk
 */
@Local
public interface PersonFacadeLocal {

    void create(Person person);

    void edit(Person person);

    void remove(Person person);

    Person find(Object id);

    List<Person> findAll();

    List<Person> findRange(int[] range);

    int count();

    boolean insertPerson(String name, String position, String age, String salary);

    Person findPersonById(int id);

  

    Person findPersonByNameAndPosition(String name, String position);

     
    
}
