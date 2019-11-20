package com.walton.reservations.hotel;

public class Hotel {


    private int id;
    private String name;
    private String location;
    private int Stars;

    public Hotel() {
    }

    public Hotel(Integer id, String name, String location, int stars) {
        this.name = name;
        this.location = location;
        Stars = stars;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getStars() {
        return Stars;
    }

    public void setStars(Integer stars) {
        Stars = stars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
