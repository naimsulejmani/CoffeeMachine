import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < col; j++) {
            for (int i = row - 1; i >= 0; i--) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}