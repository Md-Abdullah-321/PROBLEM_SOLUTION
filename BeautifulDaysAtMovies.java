import java.util.Scanner;

public class BeautifulDaysAtMovies {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //get i, j, k from user:
            int n = input.nextInt();
            int j = input.nextInt();
            int k = input.nextInt();

            
            //Run a loop from i to j:
            int beautifulDays = 0;
            for(int i = n ; i <= j ; i++){

                // Reverse the number : 
                int num = i,  reverse = 0, reminder = 0;
                while (num != 0) {
                    reminder = num % 10;
                    reverse = reverse * 10 + reminder;
                    num = num / 10;
                }

                // Calculate the result : 
                double number = i, reversedouble = reverse, devider = k;
                double result = Math.abs((number - reversedouble) / devider);
                

                if(result % 1 == 0){
                    beautifulDays++;
                }
                reminder = 0;
            }

            System.out.println(beautifulDays);
        }
    }
}
