package com.techdialogue.interview.crossover;


import java.util.*;

/**
 * @author Rishabh Rawal
 * @date 1/30/18
 *
 * problem : sort and return a new array with elements arranged according to the number of 1s in binary,
 * if equal according to decimal values
 */
public class BinaryComparsion {

    public static void main(String[] args) {

       /*int[] elements = {1, 2, 3, 4, 6, 78, 9};

        Comparator<Integer> comp = Comparator.comparing((Integer e) -> Integer.toBinaryString(e).replaceAll("0", "").length())
               //.thenComparing(Integer.bitCount());
        .thenComparing(e->e);


        //Comparator<Person> comp2 = Comparator.comparing(p-> p.getAge()).thenComparing(p->p.getName());

        Arrays.stream(elements)
                .mapToObj(Integer::new)
                //.peek(e->System.out.println(Integer.bitCount(e)))
                .sorted(comp)
                //.peek(System.out::println)
                .mapToInt(Integer::intValue)
                .toArray();
                .forEach(System.out::println);
                2
cdab
dcba
2
abcd
abcd
                */


    String[] a = {"abc", "abcd", "abcdpdd", null, null};
    String[] b = {"ab" , "cdab", "cdabpdd", null, "fdfd"};

    boolean[] arr = twins2(a,b);
    for(int i=0; i<arr.length; i++) {
        System.out.println(arr[i]);
    }

    }

    static boolean[] twins2(String[] a, String[] b){
        boolean[] results = new boolean[a.length];

        for(int i=0; i<a.length; i++){
            String stringA = a[i];
            String stringB = b[i];
            if(stringA==null && stringB==null){
                results[i]=true;
                continue;
            }
            if(stringA==null ^ stringB==null){
                results[i] =false;
                continue;
            }
            if (stringA.length()!=stringB.length()){
                results[i] = false;
                continue;
            }

            boolean result = true;

            for(int j=0; j<stringA.length(); j++){
                if(stringA.charAt(j)== stringB.charAt(j)) {
                    continue;
                }else{
                    int tempIndex = j+2;
                    while(tempIndex<stringB.length() && stringB.charAt(tempIndex)!=stringA.charAt(j)){
                        tempIndex +=2;
                    }

                    if(tempIndex < stringB.length()){
                        char tempChar = stringB.charAt(tempIndex);
                        StringBuilder builder = new StringBuilder(stringB);
                        builder.setCharAt(tempIndex, stringB.charAt(j));
                        builder.setCharAt(j,tempChar);
                        stringB = builder.toString();
                        continue;
                    }else{
                        result=false;
                        break;
                    }
                }
            }

            results[i] = result;
        }
        return  results;
    }

    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[a.length];
        boolean twins;
        for(int i=0; i< result.length; i++){
            twins = true;

            if(a[i]!=null && b[i]!=null) {
                LOOP:
                for (int j = 0; j < a[i].length(); j++) {
                    if (a[i].charAt(j) != b[i].charAt(j)) {
                        twins = false;
                        int index = j + 2;
                        char temp = '0';

                        //try swapping first and check
                        while (index < a[i].length()) {
                            StringBuilder s = new StringBuilder(a[i]);
                            temp = s.charAt(index - 2);
                            s.setCharAt(index - 2, s.charAt(index));
                            s.setCharAt(index, temp);
                            if (b[i].charAt(j) == s.charAt(j)) {
                                twins = true;
                                a[i] = new String(s);
                                continue LOOP;
                            }
                            index += 2;

                            int index2 = j+2;
                            while(index2<b[i].length()){
                                StringBuilder s2 = new StringBuilder(b[i]);
                                temp = s2.charAt(index2-2);
                                s2.setCharAt(index2-2, s2.charAt(index2));
                                s2.setCharAt(index2, temp);
                                if(a[i].charAt(j) == s2.charAt(j)) {
                                    twins = true;
                                    b[i] = new String(s2);
                                    continue LOOP;
                                }
                                index2 +=2;
                            }
                        }

                    //index=j+2;

                    //try swapping second and check
                    /*while(index<b[i].length()){
                        StringBuilder s = new StringBuilder(b[i]);
                        temp = s.charAt(index-2);
                        s.setCharAt(index-2, s.charAt(index));
                        s.setCharAt(index, temp);
                        if(a[i].charAt(j) == s.charAt(j)) {
                            twins = true;
                            b[i] = new String(s);
                            continue LOOP;
                        }
                        index +=2;
                    }*/

                        if (!twins) break;
                    }
                }
            }else if(a[i]!=null ^ b[i]!=null){
                twins=false;
            }
            result[i] = twins;
        }
        return result;
    }

    static int[] rearrange(int[] elements) {
        Comparator<Integer> comp = Comparator.comparing(Integer::bitCount).thenComparing(Integer::intValue);
        return Arrays.stream(elements)
                .mapToObj(Integer::new)
                .sorted(comp)
                .mapToInt(Integer::intValue)
                .toArray();
    }


}
