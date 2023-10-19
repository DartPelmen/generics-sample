package edu.festu.ivankuznetsov.samples.java.resources;

public interface Sellable {
    Double getTradeCost();
    default void sell(){
        System.out.println("resource sold");
    }
}
