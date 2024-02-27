package com.example.cw1601_java;

public class DriverData {
    private String name;
    private int age;
    private String team;
    private String car;
    private int currentPoints;

    private int position;

    public DriverData(String name, int age, String team, String car, int currentPoints){
        this.name = name;
        this.age = age;
        this.team = team;
        this.car = car;
        this.currentPoints = currentPoints;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        this.currentPoints = currentPoints;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}








