package edu.festu.ivankuznetsov.samples.java.characters;

public abstract class Character {
    String name;
    abstract Double getHealth();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
