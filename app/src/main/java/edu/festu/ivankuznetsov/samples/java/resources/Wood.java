package edu.festu.ivankuznetsov.samples.java.resources;

public class Wood extends Resource implements Sellable{
    private String name;
    private String woodType;

    @Override
    public Double getTradeCost() {
        return switch (this.resourceType){
            case USUAL -> basicCost*0.5;
            case RARE -> basicCost*1.2;
            case MAGIC -> basicCost*4;
        };
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }
}
