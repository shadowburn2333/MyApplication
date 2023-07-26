package com.example.myapplication;

public class LocationData {
    private double latitude;
    private double longitude;

    public LocationData() {
        // Firestore需要一个空的构造函数
    }

    public LocationData(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
