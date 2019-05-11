package com.techdialogue.java.basics;

import com.techdialogue.Person;

/**
 * @author Rishabh Rawal 4/27/18
 *
 * java is always pass by value
 * we can never change the orifginal pointer
 */
public class PassByValue {

    public static void main(String[] args){
        Person p = new Person("Saurabh",28);
        changeName(p);
        System.out.println(p);
    }

    private static void changeName(Person p){
        p.setName("Tony");

        //this will not change the reference in the calling method
        p = new Person("PassByValue",1);
    }
}
