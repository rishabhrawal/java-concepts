package com.techdialogue.java8.streams.stream_comparisons;

/**
 * @author Rishabh Rawal 3/25/18
 */
public class Solution {

    private static int solution(int[] T) {
        // write your code in Java SE 8

        int length=1;
        int max=T[0];

        for(int i=1; i< T.length; i++){

            if(T[i]>max){
                max=T[i];
            }else{
                length=i;
            }
        }

        return length;
    }

    public static void main(String[] args){
        int[] arr = {5, -2, 3, 8, 6};
        System.out.println(solution(arr));
    }

}