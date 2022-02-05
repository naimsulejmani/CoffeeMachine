import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double v1mv2 = a1 * a2 + b1 * b2;
        double mv1 = Math.sqrt(a1 * a1 + b1 * b1);
        double mv2 = Math.sqrt(a2 * a2 + b2 * b2);

        double angle = v1mv2 / (mv1 * mv2);
        System.out.println(Math.toDegrees(Math.acos(angle)));

    }
}