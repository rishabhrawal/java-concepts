package com.techdialogue.java.datatype;

public class NumbersDemo {

    public static void main(String[] args){

        //convert number to binary/hex/octal String
        int i = 99;
        String binaryString  = Integer.toBinaryString(i);
        System.out.println("binary String :"+binaryString);
        System.out.println("Hex String :"+ Integer.toHexString(i));
        System.out.println("Octal String :"+ Integer.toOctalString(i));
        System.out.println("-----------------------------");

        //count number of 1s
        Integer.bitCount(i);
        System.out.println("Bit count in binary :"+Integer.bitCount(i));
        System.out.println("-----------------------------");

        System.out.println("Reversed :"+Integer.reverse(i));
        System.out.println("Highest one bit :"+Integer.highestOneBit(i));
        System.out.println("Lowest one bit :"+Integer.lowestOneBit(i));
    }
}
