package edu.festu.ivankuznetsov.samples.java.characters;

public class Civil extends Character{

    private Double health;
    @Override
    Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }
}
