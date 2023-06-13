import java.util.Scanner;

public class TheHardleRace {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //get n & k from user:
            int n = input.nextInt();
            int k = input.nextInt();

            //create a loop based on n:
            int[] hardle = new int[n];

            //get all hardle value from user:
            for(int i = 0; i < n; i++){
                hardle[i] = input.nextInt();
            }

            //call getHighestValue() & store it to result:
            int result = getHighestValue(hardle, n);

            //Conditionally print the result:
            if(result <= k){
                System.out.println(0);
            }else{
                System.out.println(result - k);
            }
        }
    }

    public static int getHighestValue(int[] hardle, int n) {
        int highestValue = hardle[0];

        for(int i = 1; i < n;  i++){
            if(highestValue < hardle[i]){
                highestValue = hardle[i];
            }
        }

        return highestValue;
    }
}
