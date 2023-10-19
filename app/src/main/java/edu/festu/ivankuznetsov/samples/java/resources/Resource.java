package edu.festu.ivankuznetsov.samples.java.resources;

public class Resource {
    protected String name;
    protected Double basicCost;
    protected ResourceType resourceType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBasicCost() {
        return basicCost;
    }

    public void setBasicCost(Double basicCost) {
        this.basicCost = basicCost;
    }
}
