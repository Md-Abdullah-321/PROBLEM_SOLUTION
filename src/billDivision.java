import java.util.Scanner;

public class billDivision{
    public static void main(String[] args) {
       try(Scanner input = new Scanner(System.in)){
         //get n & k from user:
         int n = input.nextInt();
         int k = input.nextInt();

         //Create an Bill array based on n:
         double[] bill = new double[n];

         //Get n input from user:
         for(int i = 0; i < n; i++){
            bill[i] = input.nextInt();
         }

         //get Anna's charged:
         double chargedToAnna = input.nextInt();

         //Call getBill Method and Print Result:
         double result = getBill(bill, n, k, chargedToAnna);

         if(result <= 0){
            System.out.println("Bon Appetit");
         }else{
            System.out.printf("%.0f\n", result);
         }
       }
    }
    public static double getBill(double[] bill, int n, int k, double chargedToAnna) {
        double sum = 0;

        for(int i = 0; i < n; i++){
            if(i != k){
                sum += bill[i];
            }
        }
        double result =chargedToAnna - (sum / 2.00);

        return result;
    }
}