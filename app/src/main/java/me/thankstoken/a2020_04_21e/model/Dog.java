package me.thankstoken.a2020_04_21e.model;

public class Dog {

    private String name;
    private int myPhoto;

    public Dog(String n, int imageNumber) {
        name = n;
        myPhoto = imageNumber;
    }

    public String getName() { return name; }
    public int getImage() { return myPhoto; }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int imageNumber) {
        this.myPhoto = imageNumber;
    }
}

