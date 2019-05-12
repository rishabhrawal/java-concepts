package com.techdialogue.java10.collecction;

import java.util.List;

/**
 * Unmodifiable collection
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        List<Integer> unmodifiable = List.copyOf(list);
        unmodifiable.add(4);

    }
}
