package edu.festu.ivankuznetsov.samples.java.transport;

import java.util.List;

public abstract class Ship<T> {
    private String name;
    private Float speed;
    private List<T> transportingObject;
    void load(List<T> transportingObject){
        //здесь должны быть методы для вызова анимаций!
        setTransportingObject(transportingObject);
    }
    private void setTransportingObject(List<T> transportingObject){
        this.transportingObject = transportingObject;
    }

    public List<T> unload(){
     //здесь должны быть анимации!
     return getTransportingObject();
    }
    public List<T> getTransportingObject() {
        return transportingObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

}
