package decorator.Permissions;

import decorator.User.User;

// Datei: Permission.java
public interface Permission {
    boolean hasPermission(User user);
}
