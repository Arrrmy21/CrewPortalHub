package com.oleksii.arrmy.CrewPortal.model;

import java.util.Objects;

public class Worker {

    private String name;
    private String location;
    private int phoneNumber;

    private int age;
    private int yearIncome;
    private String maritalStatus;

    public Worker() {
    }

    public Worker(String name, String location, int phoneNumber, int age, int yearIncome, String maritalStatus) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.yearIncome = yearIncome;
        this.maritalStatus = maritalStatus;
    }

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(int yearIncome) {
        this.yearIncome = yearIncome;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
