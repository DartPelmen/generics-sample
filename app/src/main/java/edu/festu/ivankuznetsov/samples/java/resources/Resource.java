package edu.festu.ivankuznetsov.samples.java.resources;

public class Resource {
    protected String name;
    protected Double basicCost;

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

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
