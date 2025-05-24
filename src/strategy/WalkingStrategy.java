package strategy;

public class WalkingStrategy implements RouteStrategy {


    @Override
    public String buildRouteOrigin(String origin, String destination) {
        return "Walking from " + origin + " to " + destination;
    }
}
