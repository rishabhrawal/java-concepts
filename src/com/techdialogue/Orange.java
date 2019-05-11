package com.techdialogue;

import java.util.Date;

public class Orange {
    Date picked;
    int weight;
    SIZE size;

    public Date getPicked() {
        return picked;
    }

    public void setPicked(Date picked) {
        this.picked = picked;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    public enum SIZE{
        BIG(3), SMALL(2), MEDIUM(1);
        int size;
        SIZE(int size){
            this.size = size;
        }
    }

    @Override
    public String toString() {
        return "Orange{" +
                "picked=" + picked +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }

    public Orange(Date picked, int weight, SIZE size){
        if(picked == null){
            this.picked = new Date();
        }else{
            this.picked = picked;
        }
        this.weight = weight;
        this.size = size;
    }
}
