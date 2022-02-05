import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();

        System.out.printf("%d", number);
        while (number != 1) {
            if (number % 2 == 1) {
                number = number * 3 + 1;
            } else {
                number /= 2;
            }
            System.out.printf(" %d", number);
        }

    }
}