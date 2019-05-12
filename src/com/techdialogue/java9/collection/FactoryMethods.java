package com.techdialogue.java9.collection;

import java.util.List;
import java.util.Map;

public class FactoryMethods {

    public static void main(String[] args){

        List<Integer> list = List.of(1,2,3);
        Map<Integer, String> map = Map.of(1,"One", 2, "Two", 3,"Three");
    }
}
