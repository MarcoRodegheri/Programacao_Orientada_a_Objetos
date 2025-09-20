package edu.rodegheri;

public class Geo{

    public static final double r = 6371;

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

    public static double distancia(Geo loc1, Geo loc2){
        double lat1 = Math.toRadians(loc1.getLatitude());
        double lat2 = Math.toRadians(loc2.getLatitude());

        double lon1 = Math.toRadians(loc1.getLongitude());
        double lon2 = Math.toRadians(loc2.getLongitude());

        double phi = (lat1 - lat2)/2;
        double lambda = (lon1 - lon2)/2;

        double p1 = Math.pow(math.sin(phi), 2);
        double p2 = Math.pow(math.sin(lambda), 2) * Math.cos(lat1) * Math.cos(lat2);

        double p3 = p1 + p2;

        double raiz = Math.sqrt(p3);

        return 2 * r * Math.asin(raiz);
    }

    public double distancia(Geo loc){
        double lat1 = Math.toRadians(this.latitude);
        double lat2 = Math.toRadians(loc.getLatitude());

        double lon1 = Math.toRadians(this.latitude);
        double lon2 = Math.toRadians(loc.getLongitude());

        double phi = (lat1 - lat2)/2;
        double lambda = (lon1 - lon2)/2;

        double p1 = Math.pow(math.sin(phi), 2);
        double p2 = Math.pow(math.sin(lambda), 2) * Math.cos(lat1) * Math.cos(lat2);

        double p3 = p1 + p2;

        double raiz = Math.sqrt(p3);

        return 2 * r * Math.asin(raiz);
    }

    public String toString(){
        return "\nLatitude "+this.latitude+"\nLongitude: "+this.longitude;
    }
}