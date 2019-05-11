package com.techdialogue;

import java.util.Date;
import java.util.List;

public class Utility {

    public static void printLine(){
        System.out.println("*************************************************************************");
    }

    public static void printSection(){
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
    }

    public static List<Orange> getOranges(){
        return List.of(new Orange(null, 100, Orange.SIZE.MEDIUM),
                new Orange(null, 80, Orange.SIZE.SMALL),
                new Orange(null,120, Orange.SIZE.BIG),
                new Orange(new Date(System.currentTimeMillis()+50000), 60, Orange.SIZE.SMALL),
                new Orange(null, 150, Orange.SIZE.BIG),
                new Orange(null, 60, Orange.SIZE.SMALL));
    }
}

