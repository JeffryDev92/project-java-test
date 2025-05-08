import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] srgs) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius;

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.1f°F is equal to %.1f°C\n", fahrenheit, celsius);
        scanner.close();
    }
}