package course.designpatterns.observer;

import java.time.LocalDateTime;

public class Earthquake {
    private double latitude;
    private double longitude;
    private double magnitude;
    private LocalDateTime dateTime;


    public Earthquake(double latitude, double longitude, double magnitude, LocalDateTime dateTime) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.magnitude = magnitude;
        this.dateTime = dateTime;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
