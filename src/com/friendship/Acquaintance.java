package com.friendship;

public class Acquaintance {
    String name;

    public Acquaintance(String name) {
        this.name = name;
    }
    public void getStatus(){
        System.out.printf("%s is just an acquaintance. \n", this.name);
    }


}
