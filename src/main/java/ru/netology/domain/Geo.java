package ru.netology.domain;

public class Geo {
    private String type;
    private String coordinates;
    private Place place;

    public String getType() {
        return type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public Place getPlace() {
        return place;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
