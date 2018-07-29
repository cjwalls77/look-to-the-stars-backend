package com.cjwalls.looktothestars.models;

public class Planet {

    private final String name;
    private final int radius;
    private final int orbitRadius;
    private final String color;

    private String description;

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public int getOrbitRadius() {
        return orbitRadius;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Planet(String name, int radius, int orbitRadius, String color) {
        this.name = name;
        this.radius = radius;
        this.orbitRadius = orbitRadius;
        this.color = color;
    }

}
