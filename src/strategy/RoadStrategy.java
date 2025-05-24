package strategy;

public class RoadStrategy implements RouteStrategy {
    @Override
    public String buildRouteOrigin(String origin, String destination) {
        return "Roading from " + origin + " to " + destination;
    }
}
