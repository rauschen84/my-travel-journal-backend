package com.alex.traveljournal.backend;

import jakarta.persistence.*;

@Entity
@Table(name = "entries")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private String country;
    private String arrivalDate;
    private String departureDate;

    @Column(length = 1000)
    private String description;

    private String imageUrl1;
    private String imageUrl2;
    private String imageUrl3;

    // Constructors
    public Entry() {
    }

    public Entry(String location, String country, String arrivalDate, String departureDate,
                 String description, String imageUrl1, String imageUrl2, String imageUrl3) {
        this.location = location;
        this.country = country;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.description = description;
        this.imageUrl1 = imageUrl1;
        this.imageUrl2 = imageUrl2;
        this.imageUrl3 = imageUrl3;
    }

    public Entry(Long id, String location, String country, String arrivalDate, String departureDate,
                 String description, String imageUrl1, String imageUrl2, String imageUrl3) {
        this.id = id;
        this.location = location;
        this.country = country;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.description = description;
        this.imageUrl1 = imageUrl1;
        this.imageUrl2 = imageUrl2;
        this.imageUrl3 = imageUrl3;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl1() {
        return imageUrl1;
    }

    public void setImageUrl1(String imageUrl1) {
        this.imageUrl1 = imageUrl1;
    }

    public String getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

    public String getImageUrl3() {
        return imageUrl3;
    }

    public void setImageUrl3(String imageUrl3) {
        this.imageUrl3 = imageUrl3;
    }
}
