/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Huynh Nhu
 */
public class City {

    private static final double EARTH_RADIUS = 6378.1370; //Bán kính Trái đất
    private static final double DEGREE_TO_RADIAN = Math.PI / 180; //Chuyển đổi từ Độ sang Radian(Lượng giác)

    private double longitude;//kinh độ
    private double latitude;//vĩ độ
    private String name;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City(String name, double longitude, double latitude) {
        this.longitude = longitude * DEGREE_TO_RADIAN;
        this.latitude = latitude * DEGREE_TO_RADIAN;
        this.name = name;
    }

    public double calcDistance(City city) {
        double deltaLongitude = city.getLongitude() - this.getLongitude();
        double deltaLatitude = city.getLatitude() - this.getLatitude();

        double a = Math.pow(Math.sin(deltaLatitude / 2), 2) + Math.cos(this.getLatitude()) * Math.cos(city.getLatitude()) * Math.pow(Math.sin(deltaLongitude / 2), 2);

        return 2 * EARTH_RADIUS * Math.asin(Math.sqrt(a));
    }

    @Override
    public String toString() {
        return this.name;
    }
}
