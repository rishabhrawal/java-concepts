package com.techdialogue.java11.Strings;

import java.util.List;
import java.util.stream.Collectors;

public class StringDemo {

    public static void main(String[] args) {
        String s1 = "Spring Demo";
        String s2 = "    ";

        //blank check
        System.out.println("Check whether the string is blank :"+s1.isBlank());
        System.out.println("String with whitespaces :"+s2.isBlank());

        //stream of lines
        String value = "First line \n Second line \n Third Line";
        List<String> lines = value.lines().collect(Collectors.toList());
        System.out.println(lines);

        //unicode aware stripping <better than trim>
        s1.stripLeading();
        s1.stripTrailing();
        s1.strip();

        //repeat
        System.out.println(s1.repeat(5));
    }
}
