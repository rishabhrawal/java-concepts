package com.techdialogue.java.lang;

public class SystemDemo {

    public static void main(String [] args){

        //lang time, accurate ??
        System.out.println("System time in milliseconds:" + System.currentTimeMillis());

        //lang environment map
        System.out.println("Environment :"+ System.getenv());

        //lang properties
        System.out.println("Properties :"+System.getProperties());

    }
}
