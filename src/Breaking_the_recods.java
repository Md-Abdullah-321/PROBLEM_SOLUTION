import java.util.Scanner;

public class Breaking_the_recods {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int n = input.nextInt();

            //Get Score from Player:
            int[] score = new int[n];
            for(int i = 0; i < n; i++){
                score[i] = input.nextInt();
            }


            int[] Reslut = getResult(score, n);
            System.out.println(Reslut[0] +" "+ Reslut[1]);

        }
    }


    //User Defined Method:

    public static int[] getResult(int[] score, int n) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        int highestNumber = score[0];
        int lowestNumber = score[0];

        for(int i = 0; i < n; i++){
            if(highestNumber < score[i]){
                highestNumber = score[i];
                result[0]++;
            }

            if(lowestNumber > score[i]){
                lowestNumber = score[i];
                result[1]++;
            }
        }


        return result;
    }
}
