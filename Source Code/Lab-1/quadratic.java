import java.util.Scanner;

public class QuadraticEquations{
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

	System.out.println("aaryan");

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Real Roots");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } 
	else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal");
            System.out.println("Root: " + root);
        } 
	else {
            System.out.println("Roots are complex");
        }

        scanner.close();
    }
}
