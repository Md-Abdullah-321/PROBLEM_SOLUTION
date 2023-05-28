import java.util.Scanner;

public class reverseInteger {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int n = input.nextInt();

            //Create an Array Based on n:
            int[] array = new int[n];

            //Get n input from user:
            for(int k = 0; k < n; k++){
                array[k] = input.nextInt();
            }

            //Call a Method to Get reverse Array:
            int[] Reverse = Reverse(array, n);

            //Print reverse Array:
            for(int i = 0; i < n; i++){
                System.out.printf("%d ", Reverse[i]);
            }
        }
    }

    public static int[] Reverse(int[] array, int n) {
        int[] reverse = new int[n];
        int reverseIndex = n - 1;

        for(int i = 0; i < n; i++){
            reverse[i] = array[reverseIndex];
            reverseIndex--;
        }
        return reverse;
    }
}
