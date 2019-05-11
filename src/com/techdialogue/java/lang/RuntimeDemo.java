package com.techdialogue.java.lang;

public class RuntimeDemo {

    public static void main (String [] args){

        System.out.println("---------------------------");

        //number of processors
        System.out.println("Number of CPUs :"+ Runtime.getRuntime().availableProcessors());
        System.out.println("---------------------------");

        //Memory in bytes
        System.out.println("Total Ram :"+ Runtime.getRuntime().totalMemory());
        System.out.println("---------------------------");

        //free memory in bytes
        System.out.println("Free Ram :"+ Runtime.getRuntime().freeMemory());
        System.out.println("---------------------------");

    }
}
