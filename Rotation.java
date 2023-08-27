import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] rotatedArray = rotateLeft(arr, d);

        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int[] rotateLeft(int[] arr, int d) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - d) % n;
            rotatedArray[newIndex] = arr[i];
        }

        return rotatedArray;
    }
}
