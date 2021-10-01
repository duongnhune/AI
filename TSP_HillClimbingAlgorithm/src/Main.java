
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huynh Nhu
 */
public class Main {

    public static void main(String[] args) {
        Route route = new Route(initCitiesFromFile("TestCase2.txt")); 
       printHeading(route);
        System.out.println(route + " | " + route.getStringTotalDistance());
        new HillClimbing().findShortestRoute(route);
    }

    public static ArrayList<City> initCitiesFromFile(String fileName) {
        ArrayList<City> cities = new ArrayList<City>();

        try {
            FileInputStream fis = new FileInputStream("src\\testcase\\" + fileName);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String str = null;
            do {
                str = br.readLine();
                if (str == null) {
                    break;
                }

                String[] tmp = str.split(",");

                City city = new City(tmp[0], Double.parseDouble(tmp[1]), Double.parseDouble(tmp[2]));
                cities.add(city);

            } while (str != null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cities;
    }

    public static void printHeading(Route route) {
        String column1 = "Tuyến đường";
        String remainingHeadingCoumn = "Khoảng cách (km)   | So sánh trạng thái mới với trạng thái hiện tại";

        int cityNameLength = 0;
        for (int i = 0; i < route.getCities().size(); i++) {
            cityNameLength += route.getCities().get(i).getName().length();
        }

        int arrayLength = cityNameLength + route.getCities().size() * 2;
        int partialLength = (arrayLength - column1.length()) / 2;
        for (int i = 0; i < partialLength; i++) {
            System.out.print(" ");
        }
        System.out.print(column1);

        for (int i = 0; i < partialLength; i++) {
            System.out.print(" ");
        }
        if ((arrayLength % 2) == 0) {
            System.out.print(" ");
        }
        System.out.println(" | " + remainingHeadingCoumn);

        cityNameLength += remainingHeadingCoumn.length() + 3;
        for (int i = 0; i < cityNameLength + route.getCities().size() * 2; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}
