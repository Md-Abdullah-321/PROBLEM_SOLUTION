import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // get n , k & q from user: 
            int n = input.nextInt();
            int k = input.nextInt();
            int q = input.nextInt();

            //Create an Array based on n:
            int[] array = new int[n];
            int[] quaries = new int[q];


            //get input for array:
            for(int l = 0; l < n; l++){
                array[l] = input.nextInt();
            }
            //Rotate array k times:
            for(int m = 0; m < k; m++){
                int lastIndex = array[array.length - 1];
                int arrayLength = array.length - 2;
                for(int i = arrayLength; i >= 0; i--){
                    array[i + 1] = array[i];
                }
                array[0] = lastIndex;
            }

            for(int a = 0; a < q; a++){
                quaries[a] = input.nextInt();

                System.out.println(array[quaries[a]]);
            }
            
        } 
    }
}