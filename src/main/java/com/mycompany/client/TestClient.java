/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Monk
 */
public class TestClient {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter name");
            String name = br.readLine();
            if (name.equals("exit")) {
                exit = true;
                break;
            }
            System.out.println("Enter position");
            String position = br.readLine();
            if (position.equals("exit")) {
                exit = true;
                break;
            }

            System.out.println("Enter type request (age / salary)");
            String typeRequest = br.readLine();
            if (typeRequest.equals("exit")) {
                exit = true;
                break;
            }

            if (typeRequest.equalsIgnoreCase("age") || typeRequest.equalsIgnoreCase("salary")) {
                if (typeRequest.equalsIgnoreCase("age")) {
                    System.out.println(getAge(name, position));
                }
                if (typeRequest.equalsIgnoreCase("salary")) {
                    System.out.println(getSalary(name, position));
                }
            } else {
                System.out.println("not supported: " + typeRequest + ". Lets start again.");
            }
        }

    }

    public static String getAge(String name, String position) {
        com.mycompany.client.PersonService_Service service = new PersonService_Service();
        com.mycompany.client.PersonService port = service.getPersonServicePort();
        PersonRequest personRequest = new PersonRequest();
        personRequest.setName(name);
        personRequest.setPosition(position);
        return port.getPersonInfo(personRequest, TypeRequest.R_AGE);
    }

    public static String getSalary(String name, String position) {
        com.mycompany.client.PersonService_Service service = new PersonService_Service();
        com.mycompany.client.PersonService port = service.getPersonServicePort();
        PersonRequest personRequest = new PersonRequest();
        personRequest.setName(name);
        personRequest.setPosition(position);
        return port.getPersonInfo(personRequest, TypeRequest.R_SALARY);
    }

}
