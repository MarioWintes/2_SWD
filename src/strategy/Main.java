package strategy;

public class Main {

    public static void main(String[] args) {

        RouteStrategy walkingStrategy = new WalkingStrategy();

        Navigation n = new Navigation();

        n.setRouteStrategy(walkingStrategy);
        System.out.println(n.buildRouteOrigin("Graz", "FH"));

        n.setRouteStrategy(new PublicTransportStrategy());
        System.out.println(n.buildRouteOrigin("Graz", "FH2"));

        n.setRouteStrategy(new RoadStrategy());
        System.out.println(n.buildRouteOrigin("Wien", "FH2"));
    }
}
