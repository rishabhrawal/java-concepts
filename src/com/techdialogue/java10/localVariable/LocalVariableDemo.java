package com.techdialogue.java10.localVariable;

/**
 * var can be used to define local variables
 * Local variable Type inference happens at compile time
 * Hence there is no dynamic typing
 */
public class LocalVariableDemo {

    public static void main (String[] args){

        //Following are not allowed
        //var i;
        //var i, j= 0;
        //var i = mull

        var i = 1; //type inference at compile time, no dynamic typing
        System.out.println("i :"+i);
    }
}
