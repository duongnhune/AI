/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huynh Nhu
 */
public class HillClimbing {

    private static final int LOOP_MAX = 100;

    private Route generateNeighborRoute(Route route) {
        int x1 = 0, x2 = 0;
        while (x1 == x2) {
            x1 = (int) (route.getCities().size() * Math.random());
            x2 = (int) (route.getCities().size() * Math.random());
        }

        City city1 = route.getCities().get(x1);
        City city2 = route.getCities().get(x2);
        route.getCities().set(x2, city1);
        route.getCities().set(x1, city2);

        return route;
    }

    public Route findShortestRoute(Route currentRoute) {
        Route adjacentRoute;
        int loopCounter = 0;
        String compareRoutes = null;

        while (loopCounter < LOOP_MAX) {
            adjacentRoute = generateNeighborRoute(new Route(currentRoute));
            if (adjacentRoute.getTotalDistance() <= currentRoute.getTotalDistance()) {
                compareRoutes = "<= (proceed)";
                loopCounter = 0;
                currentRoute = new Route(adjacentRoute);
            } else {
                compareRoutes = "> (stay) - loop #" + loopCounter++;
            }
            System.out.println(" | " + compareRoutes);
            System.out.print(currentRoute + " | " 
            + currentRoute.getStringTotalDistance());
        }

        if (loopCounter == 100) {
            System.out.println(" | potentil maximum");
        } else {
            System.out.println(" | " + compareRoutes);
        }

        return currentRoute;
    }
}
