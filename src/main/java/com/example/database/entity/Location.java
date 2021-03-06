package com.example.database.entity;

public class Location {
    private Integer id;
    private String locationName;

    public Location() {
    }

    public Location(Integer id, String locationName) {
        this.id = id;
        this.locationName = locationName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
