import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double c = scanner.nextDouble();
        double f = c * 1.8 + 32;
        System.out.println(f);
    }
}