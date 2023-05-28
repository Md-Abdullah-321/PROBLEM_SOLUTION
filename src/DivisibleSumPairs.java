import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //Get n and k from user:
            int n = input.nextInt();
            int k = input.nextInt();

            //Create an Array Based on n:
            int[] array = new int[n];

            //Get n values:
            for(int i = 0; i < n; i++){
                array[i] = input.nextInt();
            }

            //Print Result calling a Method:
            System.out.println(getCount(array, n, k));
        }
    }

    public static int getCount(int[] array, int n, int k) {
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i < j){
                    if((array[i] + array[j]) % k == 0){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
