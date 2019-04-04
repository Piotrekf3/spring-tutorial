package com.piotrek.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try {

            ObjectMapper mapper = new ObjectMapper();

            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            System.out.println("First name = " + theStudent.getFirstName());
            System.out.println("Last name = " + theStudent.getLastName());

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
