package com.techdialogue.interview.hackerrank.amex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Receive two arguments, An array of coin denominations, and a monetary value
 * return an array containing the minimum number of coins to cover the monetary value exactly
 * This array should be sorted from highest to lowest denomination
 * return [0] if denomination provided cannot create the monetary value
 *
 * Eg. Input [20,10,5,1], 53
 * Eg. Output [20,20,10,1,1,1]
 */
public class AmexCoinCounting {

    public static int[] countCoins(int[] denominaions, int amount){

        ArrayList<Integer> coins = new ArrayList();
        int currentAmount = 0;
        Arrays.sort(denominaions);
        for(int i=denominaions.length-1; i>=0;  i--) {
            int currentDenomination = denominaions[i];
            while (currentDenomination <= amount - currentAmount && currentAmount <= amount) {
                coins.add(currentDenomination);
                currentAmount += currentDenomination;
            }
            if(currentAmount==amount) break;
        }
        if(currentAmount==amount){
            return coins.stream().mapToInt(i->i).toArray();
        }else{
            return new int[]{0};
        }
    }

    public static void main(String[] args){
        int[] resut = AmexCoinCounting.countCoins(new int[]{20,10,5,1}, 53);
        System.out.println("Result :");
        Arrays.stream(resut).forEach(System.out::println);
    }
}
