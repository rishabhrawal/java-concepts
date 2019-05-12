package com.techdialogue.java10.gc;

/**
 * Java 9 made G1 as the default, and in Java 10,
 * parallel full Garbage Collection support for G1 will improve the worst-case latencies.
 * It parallelized the mark-sweep-compact algorithm.
 * The number of threads in parallel can be controlled by the XX:ParallelGCThreads option.
 */
public class GcDemo {
}
