package com.cjwalls.looktothestars.models.hibernate.dao;

import javax.persistence.*;

@Entity
@Table(name = "PLANET")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RADIUS")
    private int radius;

    @Column(name = "ORBIT_RADIUS")
    private int orbitRadius;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "DESCRIPTION")
    private String description;

    public Planet() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getOrbitRadius() {
        return orbitRadius;
    }

    public void setOrbitRadius(int orbitRadius) {
        this.orbitRadius = orbitRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                ", orbitRadius=" + orbitRadius +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
