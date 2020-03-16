package com.friendship;

public class Friend extends Acquaintance{
    String homeTown;
    public Friend(String name, String homeTown) {
        super(name);
        this.homeTown = homeTown;
    }
    public void getStatus() {
        System.out.printf("%s is a friend and he is from %s. \n", this.name, this.homeTown);
    }
}
