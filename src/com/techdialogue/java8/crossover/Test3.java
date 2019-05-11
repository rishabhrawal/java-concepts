package com.techdialogue.java8.crossover;

import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TransferQueue;

/**
 * @author Rishabh Rawal 3/10/18
 */
public class Test3 {
    public static void add(int a){
        loop:
        for(int  i=1; i<3; i++){
            for(int j=1; j<3; j++){
                if(a==5){
                    break loop;
                }
                System.out.println(i*j);
            }
        }
    }

    public static void main(String[] args){
       try{
           badMethod();
           System.out.println("A");
       }catch (Exception e){
           System.out.println("B");
       }finally {
           System.out.println("C");
       }
    }

    static  void badMethod(){

    }

}
