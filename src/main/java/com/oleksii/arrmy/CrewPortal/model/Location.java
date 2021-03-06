package com.oleksii.arrmy.CrewPortal.model;

import javax.persistence.*;

@Entity
@Cacheable
public class Location {

    private String country;
    private String city;
    private int receptionPhone;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int locationID;

    public Location() {
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getReceptionPhone() {
        return receptionPhone;
    }

    public void setReceptionPhone(int receptionPhone) {
        this.receptionPhone = receptionPhone;
    }
}
