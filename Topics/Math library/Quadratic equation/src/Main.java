import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double deter = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + deter) / (2 * a);
        double x2 = (-b - deter) / (2 * a);

        if (x1 < x2) {
            System.out.printf("%f %f", x1, x2);
        } else {
            System.out.printf("%f %f", x2, x1);
        }
    }
}