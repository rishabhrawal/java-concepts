package com.techdialogue.java8.streams.stream_basics;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * @author Rishabh Rawal
 * @date 1/22/18
 */
public class StreamCreation {

    List<String> list = Arrays.asList("some","values","to","be","reversed");


    /**
     * *******************************************  String **********************
     * returns IntStream
     */
    public static IntStream fromString(String str){
        return str.chars();
    }

    /************************************************ Array **********************

    /**
     *        int[],     long[],     double[]
     * return IntStream, LongStream, DoubleStream
     * other primitives not supported
     */
    public static IntStream fromPrimitiveArray(int[] arr){
        return Arrays.stream(arr);
    }

    /**
     *   Object[]
     *   returns Stream
     */
    public static Stream fromObjectArray(String[] arr){
        return Arrays.stream(arr);
    }

    /******************************************* Stream of random numbers (ThreadLocalRandom) *****************************/
    public static void random(){
        IntStream stream = ThreadLocalRandom.current().ints();
    }


    /**
     * ******************************************* Collection ****************
     * returns Stream<T>
     */
    public static Stream fromCollection(Collection collection){
        return collection.stream();
    }

    /**
     * ********************************************** Map **********************
     * returns Stream<Map.Entry>
     */
    public static Stream fromMap(Map<String,String> map){
        return map.entrySet()
                .stream();

    }

    /*****************************************************************************************
     * *************************************** Stream Interface  ****************************/

    /************ empty stream ***************/
    public Stream emptyStream(){
        return Stream.empty();
    }

    /***********  fixed objects  *************/
    public static Stream ofFixedValues(){
        return Stream.of(1,2,3,4);
    }

    /**************  builder  *******************/
    public static Stream  usingBuilder(){
        return Stream.builder()
                .add(1)
                .add(2)
                .add(3)
                .build();
    }

    /************* range, Int stream ****************/
    public void loop(int n){
        IntStream.range(0,n)
                .forEach(System.out::println);
    }

    /**************  iterate *****************/
    public static Stream usingIterate(int n){
        return Stream.iterate(1,i->i+1) //UnaryOperator
                .limit(n);
    }

    /**************  generate  *****************/
    public static Stream usingGenerate(int n){

        return Stream.generate(Math::random) //Supplier
                .limit(n);
    }


    /*************** join two streams ********/
    public static Stream concatenatedStream(){

        Stream s1 = Stream.empty();
        Stream s2 = Stream.of(1,2,3);

        return Stream.concat(s1,s2);
    }

    public static void main(String[] args){

        String s = "some random value";
        //return IntStream
        s.chars().forEach(i->System.out.println((char)i));
    }

}
