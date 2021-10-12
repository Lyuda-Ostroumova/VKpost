package ru.netology.domain;

public class Place {
    private int id;
    private String title;
    private int latitude;
    private int longitude;
    private int created;
    private String icon;
    private int checkins;
    private int updated;
    private int type;
    private int country;
    private int city;
    private String address;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getCreated() {
        return created;
    }

    public String getIcon() {
        return icon;
    }

    public int getCheckins() {
        return checkins;
    }

    public int getUpdated() {
        return updated;
    }

    public int getType() {
        return type;
    }

    public int getCountry() {
        return country;
    }

    public int getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setCheckins(int checkins) {
        this.checkins = checkins;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
