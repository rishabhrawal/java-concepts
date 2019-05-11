package com.techdialogue.java8.streams.stream_basics;

import java.util.List;

/**
 * @author Rishabh Rawal
 * @date 1/23/18
 */
public class StreamMapping {

    public static void mapStream(List<String> list){
        list.stream()
                .map(String::length);
    }
}
