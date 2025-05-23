package decorator.Decorator;


import decorator.Permissions.Permission;
import decorator.User.User;

public class SecretDecorator extends BaseDecorator {
    private final String requiredSecret;

    public SecretDecorator(Permission decorated, String requiredSecret) {
        super(decorated);
        this.requiredSecret = requiredSecret;
    }

    @Override
    public boolean hasPermission(User user) {
        // Zuerst vorausgegangene Decorators prüfen
        if (!decorated.hasPermission(user)) {
            return false;
        }
        // Dann Secret prüfen
        return requiredSecret.equals(user.getSecret());
    }
}
