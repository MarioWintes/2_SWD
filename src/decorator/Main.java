package decorator;

import decorator.Decorator.CoolnessDecorator;
import decorator.Decorator.MandantDecorator;
import decorator.Decorator.SecretDecorator;
import decorator.Permissions.BasePermission;
import decorator.User.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(true, 1, "geheim", "uncool");

        // Basis-Check: nur Admin?
        boolean stufe1 = new BasePermission().hasPermission(user);
        System.out.println("base: " + stufe1);

        // Basis + Mandant == 1
        boolean stufe2 = new MandantDecorator(
                new BasePermission(),
                1
        ).hasPermission(user);
        System.out.println("base + mandant: " + stufe2);

        // Basis + Mandant == 1 + Secret == "geheim"
        boolean stufe3 = new SecretDecorator(
                new MandantDecorator(
                        new BasePermission(),
                        1
                ),
                "geheim"
        ).hasPermission(user);
        System.out.println("base + mandant + secret: " + stufe3);

        boolean stufe4 = new CoolnessDecorator(
                new SecretDecorator(
                        new MandantDecorator(
                                new BasePermission(), 1
                        ), "geheim"
                ), "cool"
        ).hasPermission(user);
        System.out.println("base + mandat + secret + coolness: " + stufe4);
    }
}