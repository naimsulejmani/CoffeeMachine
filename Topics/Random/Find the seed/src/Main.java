import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] array = new int[b - a + 1][n];
        int[] maxims = new int[b - a + 1];
        int[] sums = new int[b - a + 1];


        for (int i = 0; i < array.length; i++) {
            Random random = new Random(i + a);
            for (int j = 0; j < array[i].length; j++) {
                int rndNumber = random.nextInt(k);
                array[i][j] = rndNumber;
                sums[i] += rndNumber;
                if (j == 0) {
                    maxims[i] = rndNumber;
                } else {
                    if (maxims[i] < rndNumber)
                        maxims[i] = rndNumber;
                }
            }
        }
        int minSeedIndex = 0;
        int minSeedValue = maxims[minSeedIndex];
        for (int i = 1; i < maxims.length; i++) {
            if (minSeedValue > maxims[i]) {
                minSeedIndex = i;
                minSeedValue = maxims[i];
            } else if (minSeedValue == maxims[i]) {
                if (sums[minSeedIndex] > sums[i]) {
                    minSeedIndex = i;
                    minSeedValue = maxims[i];
                }

            }
        }

        System.out.println(minSeedIndex+a);
        System.out.println(minSeedValue);

    }

}