package edu.festu.ivankuznetsov.samples.java.characters;

public class Warrior extends Character{
    private Double health;

    public Double getArmor() {
        return armor;
    }

    public void setArmor(Double armor) {
        this.armor = armor;
    }

    private Double armor;
    @Override
    Double getHealth() {
        return health+armor;
    }

    public void setHealth(Double health) {
        this.health = health;
    }
}
