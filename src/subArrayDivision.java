import java.util.Scanner;

public class subArrayDivision {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int n = input.nextInt();

            //Create an Array Based on n:
            int[] array = new int[n];

            //Get array's value from User:
            for(int i = 0 ; i < n; i++){
                array[i] = input.nextInt();
            }
            
            //Get birthDate and Month from User:
            int birthDate = input.nextInt();
            int birthMonth = input.nextInt();

            //Print Result:
            System.out.println(getResult(n, array, birthDate, birthMonth));
        }
    }

    public static int getResult(int n, int[] array, int d, int m){
        int totalPiece = 0;
        int sum = 0;

        //Calculate total Piece:
        for(int i = 0; i < n; i++){
            for(int j = i; j < (i + m); j++){
                if(j == (n)) break;
                sum += array[j];
            }
            if(sum == d){
                totalPiece++;
            }
            sum = 0;
        }

        return totalPiece;
    }
}
