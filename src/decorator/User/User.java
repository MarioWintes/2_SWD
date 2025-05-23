package decorator.User;

public class User {
    private final boolean admin;
    private final int mandant;
    private final String secret;
    private final String cool;

    public User(boolean admin, int mandant, String secret , String cool) {
        this.admin = admin;
        this.mandant = mandant;
        this.secret = secret;
        this.cool = cool;
    }

    public boolean isAdmin() {
        return admin;
    }

    public int getMandant() {
        return mandant;
    }

    public String getSecret() {
        return secret;
    }

    public String getCool() {
        return cool;
    }
}
