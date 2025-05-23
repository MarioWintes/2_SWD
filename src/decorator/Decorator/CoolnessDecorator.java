package decorator.Decorator;


import decorator.Permissions.Permission;
import decorator.User.User;

public class CoolnessDecorator extends BaseDecorator {
    private final String coolString;

    public CoolnessDecorator(Permission decorated, String coolString) {
        super(decorated);
        this.coolString = coolString;
    }

    @Override
    public boolean hasPermission(User user) {
        // Zuerst vorausgegangene Decorators prüfen
        if (!decorated.hasPermission(user)) {
            return false;
        }
        // Dann Secret prüfen
        return coolString.equals(user.getCool());
    }
}
