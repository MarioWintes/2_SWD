package strategy;

public class Navigation {

    private RouteStrategy strategy;

    public Navigation() {
    }

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public String buildRouteOrigin(String origin, String destination) {
        if (strategy != null) {
            return strategy.buildRouteOrigin(origin, destination);
        }
        return "no Strategy set";
    }
}
