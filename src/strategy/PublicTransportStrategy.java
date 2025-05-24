package strategy;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public String buildRouteOrigin(String origin, String destination) {
        return "Public transporting from " + origin + " to " + destination;
    }
}
