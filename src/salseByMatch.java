import java.util.Scanner;

public class salseByMatch {
    public static void main(String[] args) {
       try(Scanner input = new Scanner(System.in)){
         //get n as Input:    
        int n = input.nextInt();

        //Create an Array based on n:
        int[] shocks = new int[n];

        //get n input:
        for(int i = 0; i < n; i++){
            shocks[i] = input.nextInt();
        }

        //Call getMatch Method and Print the value:
        System.out.println(getMatch(shocks,n));
       }
    }

    public static int getMatch(int[] shocks, int n) {
        int totalMatch = 0; 
        int count = 1;

        for(int i = 0; i < n; i++){
            for(int j = (i + 1); j < n; j++){
                if(shocks[i] != 0){
                    if(shocks[i] == shocks[j]){
                        count++;
                        shocks[j] = 0;
                    }
                }
            }
            totalMatch += count / 2;
            count = 1;
        }
        return totalMatch;
    }
}
