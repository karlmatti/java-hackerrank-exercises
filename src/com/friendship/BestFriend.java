package com.friendship;

public class BestFriend extends Friend{
    String favoriteSong;
    public BestFriend(String name, String homeTown, String favoriteSong) {
        super(name, homeTown);
        this.favoriteSong = favoriteSong;
    }
    public void getStatus() {
        System.out.printf("%s is my best friend. He is from %s and his favorite song is %s. \n",
                this.name, this.homeTown, this.favoriteSong);
    }
}
