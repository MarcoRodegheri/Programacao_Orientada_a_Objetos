package edu.rodegheri;

public class Geo {

    private double latitude;
    private double longitude;

    public Geo(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }

    public String toString(){
        return "Latitude: "+this.latitude+" Longitude: "+this.longitude;
    }
    
}
