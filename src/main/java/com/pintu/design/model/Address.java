package com.pintu.design.model;

import java.util.Objects;

public class Address {

    private String doorNumber;

    private String Street;

    private String area;

    private String city;

    public Address(String doorNumber, String street, String area, String city) {
        this.doorNumber = doorNumber;
        Street = street;
        this.area = area;
        this.city = city;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNumber='" + doorNumber + '\'' +
                ", Street='" + Street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getDoorNumber(), address.getDoorNumber()) &&
                Objects.equals(getStreet(), address.getStreet()) &&
                Objects.equals(getArea(), address.getArea()) &&
                Objects.equals(getCity(), address.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDoorNumber(), getStreet(), getArea(), getCity());
    }
}
