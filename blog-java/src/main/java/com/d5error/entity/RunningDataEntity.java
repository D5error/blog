package com.d5error.entity;

public class RunningDataEntity {
//    private DateEntity date;
    private int year;
    private int month;
    private int day;
    private double distance;
    private int minute;
    private int second;

    public RunningDataEntity(int year, int month, int day, double distance, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.distance = distance;
        this.minute = minute;
        this.second = second;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "RunningDataEntity{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", distance=" + distance +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
