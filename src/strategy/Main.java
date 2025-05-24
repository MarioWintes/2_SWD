package strategy;

public class Main {

    public static void main(String[] args) {


        Navigation n = new Navigation();

        RouteStrategy walkingStrategy = new WalkingStrategy();
        n.setRouteStrategy(walkingStrategy);
        System.out.println(n.buildRouteOrigin("Graz", "FH"));

        n.setRouteStrategy(new PublicTransportStrategy());
        System.out.println(n.buildRouteOrigin("Graz", "FH2"));

        n.setRouteStrategy(new RoadStrategy());
        System.out.println(n.buildRouteOrigin("Wien", "FH2"));
    }
}
