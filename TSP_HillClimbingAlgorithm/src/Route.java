
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huynh Nhu
 */
public class Route {

    private ArrayList<City> cities = new ArrayList<City>();

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public Route(Route route) {
        route.cities.stream().forEach(item -> cities.add(item));
    }

    public Route(ArrayList<City> cities) {
        this.cities.addAll(cities);
        Collections.shuffle(this.cities);
    }

    public double getTotalDistance() {
        int size = this.cities.size();

        return this.cities.stream().mapToDouble(item -> {
            int index = this.cities.indexOf(item);
            double res = 0;
            if (index < size - 1) {
                res = item.calcDistance(this.cities.get(index + 1));
            }
            return res;
        }).sum() + this.cities.get(size - 1).calcDistance(this.cities.get(0));
    }

    public String getStringTotalDistance() {
        String res = String.format("%.2f", this.getTotalDistance());
        return res;
    }

    @Override
    public String toString() {
        return Arrays.toString(getCities().toArray());
    }
}
