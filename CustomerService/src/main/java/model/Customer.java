package model;

public class Customer {
    private String finCode;
    private String name;
    private String surName;
    private String phoneNumber;

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Fincode: '" + finCode + '\'' +
                ", Name: '" + name + '\'' +
                ", Surname: '" + surName + '\'' +
                ", Phone number: '" + phoneNumber + '\'' +
                '}';
    }
}
