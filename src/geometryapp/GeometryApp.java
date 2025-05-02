package geometryapp;
import java.util.Scanner;

public class GeometryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Rechteck
        System.out.println("Rechteck: Breite eingeben:");
        double width = sc.nextDouble();
        System.out.println("Rechteck: Höhe eingeben:");
        double height = sc.nextDouble();
        double areaRect = width * height;
        double perimeterRect = 2 * (width + height);
        System.out.println("Fläche Rechteck: " + areaRect);
        System.out.println("Umfang Rechteck: " + perimeterRect);

        // Kreis
        System.out.println("Kreis: Radius eingeben:");
        double radius = sc.nextDouble();
        double areaCircle = Math.PI * radius * radius;
        double circumferenceCircle = 2 * Math.PI * radius;
        System.out.println("Fläche Kreis: " + areaCircle);
        System.out.println("Umfang Kreis: " + circumferenceCircle);

        // Dreieck (gleichseitig)
        System.out.println("Dreieck: Seitenlänge eingeben:");
        double side = sc.nextDouble();
        double areaTriangle = Math.sqrt(3) / 4 * side * side;
        double perimeterTriangle = 3 * side;
        System.out.println("Fläche Dreieck: " + areaTriangle);
        System.out.println("Umfang Dreieck: " + perimeterTriangle);

        sc.close();
    }
}