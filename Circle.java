import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        final double pi = 3.14159;

        double circumference = 2 * pi * radius;
        System.out.println("Circumference: " + circumference);
        sc.close();
    }
}
