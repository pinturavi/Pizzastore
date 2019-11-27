package com.pintu.design.model;

import java.util.Objects;

public class Customer {
    private int id;

    private String name;

    private Address address;

    private CreditCard card;

    private String emailId;

    public Customer(int id, String name, Address address, CreditCard card, String emailId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.card = card;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", card=" + card +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId() &&
                Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getAddress(), customer.getAddress()) &&
                Objects.equals(getCard(), customer.getCard()) &&
                Objects.equals(getEmailId(), customer.getEmailId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), getCard(), getEmailId());
    }
}
