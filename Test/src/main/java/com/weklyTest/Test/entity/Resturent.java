package com.weklyTest.Test.entity;

public class Resturent {
    private Integer resturentId;
    private  String resturentName;
    private String resturentAddress;
    private  Integer numberOfStaff;
    private Integer  numberOfDeses;

    public Resturent(Integer resturentId, String resturentName, String resturentAddress, Integer numberOfStaff, Integer numberOfDeses) {
        this.resturentId = resturentId;
        this.resturentName = resturentName;
        this.resturentAddress = resturentAddress;
        this.numberOfStaff = numberOfStaff;
        this.numberOfDeses = numberOfDeses;
    }

    public Integer getResturentId() {
        return resturentId;
    }

    public void setResturentId(Integer resturentId) {
        this.resturentId = resturentId;
    }

    public String getResturentName() {
        return resturentName;
    }

    public void setResturentName(String resturentName) {
        this.resturentName = resturentName;
    }

    public String getResturentAddress() {
        return resturentAddress;
    }

    public void setResturentAddress(String resturentAddress) {
        this.resturentAddress = resturentAddress;
    }

    public Integer getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(Integer numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public Integer getNumberOfDeses() {
        return numberOfDeses;
    }

    public void setNumberOfDeses(Integer numberOfDeses) {
        this.numberOfDeses = numberOfDeses;
    }
}
