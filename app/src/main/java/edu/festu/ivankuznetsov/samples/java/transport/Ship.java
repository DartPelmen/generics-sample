package edu.festu.ivankuznetsov.samples.java.transport;

import java.util.List;


public class Ship<T>{
    protected String name;
    protected Float speed;

    protected List<T> transportingObjects;

    public void load(List<T> transportingObjects){
        //здесь должна быть анимация
        setTransportingObjects(transportingObjects);
    }
    public List<T> unload(){
        //здесь должна быть анимация
        var transportingObjects = getTransportingObjects();
        this.transportingObjects.clear();
        return transportingObjects;
    }
    public List<T> getTransportingObjects() {
        return transportingObjects;
    }

    public void setTransportingObjects(List<T> transportingObjects) {
        this.transportingObjects = transportingObjects;
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