package com.techdialogue.java8.crossover;

class ObjectConstruction {
    int i=1;
    {
        i=2;
    }
    ObjectConstruction(){
        i=3;
    }
    ObjectConstruction(int in){
        i=in;
    }
    {
        i=4;
    }
    public static void main(String[] args) {
        System.out.println(new ObjectConstruction().i);
        System.out.println(new ObjectConstruction(5).i);
        //System.out.println();
        //System.out.println();
        //System.out.println();
    }

}

