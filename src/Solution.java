import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
           //Get Position and Jump for Kangaroo 1:
           int x1 = input.nextInt();
           int v1 = input.nextInt();

           //Get Position and Jump for kangaroo 2:
           int x2 = input.nextInt();
           int v2 = input.nextInt();

           //Print Result calling a Method:
           System.out.println(getResult(x1,v1,x2, v2));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static String getResult(int x1, int v1, int x2, int v2) {
        if(x1 > x2){
            String result = hasReached(x1, x2, v1, v2);
            return result;
        }else{
            String result = hasReached(x2, x1, v2, v1);
            return result;
        }
    }

    public static String hasReached(int x1, int x2, int v1, int v2) {
        String hasReached = "NO";
        while (x1 > x2) {
            if(x1 < x2) return hasReached;

            x1 = x1 + v1;
            x2 = x2 + v2;

            if(x1 == x2){
                hasReached = "YES";
            }
        }

        return hasReached;
    }
}