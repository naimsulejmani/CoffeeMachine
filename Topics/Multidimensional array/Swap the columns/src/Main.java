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

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        swapColumns(matrix, i, j);
        for (int[] array : matrix) {
            for (int number : array) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }

    public static void swapColumns(int[][] matrix, int col1, int col2) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp;
        }
    }
}