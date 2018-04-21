/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testperson;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Monk
 */
@WebService(serviceName = "PersonService")
@Stateless()
public class PersonService {

    @EJB
    private PersonFacadeLocal personFacadeLocal;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Операция веб-службы
     */
    @WebMethod(operationName = "getPersonById")
    public Person getPersonById(@WebParam(name = "id") int id) {
        return personFacadeLocal.findPersonById(id);
    }

    /**
     * Операция веб-службы
     */
    @WebMethod(operationName = "getPersonInfo")
    public String getPersonInfo(@WebParam(name = "requestParams") PersonRequest requestParams, @WebParam(name = "requestType") com.mycompany.testperson.TypeRequest requestType) {
        Person person = personFacadeLocal.findPersonByNameAndPosition(requestParams.getName(), requestParams.getPosition());

        if (requestType == TypeRequest.RAge) {
            return person.getAge();
        }
        if (requestType == TypeRequest.RSalary) {
            return person.getSalary();
        }

        return null;
    }
}
