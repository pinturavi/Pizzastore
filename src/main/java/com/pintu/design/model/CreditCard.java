package com.pintu.design.model;

import java.util.Objects;

public class CreditCard {

    private String provider;

    private String creditCardNumber;

    private String cvv;

    public CreditCard(String provider, String creditCardNumber, String cvv) {
        this.provider = provider;
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "provider='" + provider + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditCard)) return false;
        CreditCard that = (CreditCard) o;
        return Objects.equals(getProvider(), that.getProvider()) &&
                Objects.equals(getCreditCardNumber(), that.getCreditCardNumber()) &&
                Objects.equals(getCvv(), that.getCvv());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProvider(), getCreditCardNumber(), getCvv());
    }
}
