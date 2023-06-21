import java.util.Scanner;

public class HourglassSum {

    public static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;  // Initialize maxSum to the minimum integer value

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate sum of hourglass values
                int hourglassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                // Update maxSum if necessary
                maxSum = Math.max(maxSum, hourglassSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxHourglassSum = hourglassSum(arr);
        System.out.println(maxHourglassSum);
    }
}
