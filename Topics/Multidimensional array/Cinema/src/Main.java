import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n > 20 || m > 20) {
            System.out.println(0);
            return;
        }
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        int consecutive = 0;

        int row = 0;
        for (int i = 0; i < matrix.length && consecutive < k; i++) {
            int rowConsecutive = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowConsecutive++;
                    if (consecutive < rowConsecutive) {
                        consecutive = rowConsecutive;
                        row = i;
                    }
                } else {
                    rowConsecutive = 0;
                }
            }
        }
        if (consecutive >= k)
            System.out.println(row + 1);
        else System.out.println(0);

    }
}