import java.util.Scanner;

public class Between_Two_Sets {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //Get Length of two Arrays:
            int n = input.nextInt();
            int m = input.nextInt();
            
            int[] a = new int[n];
            int[] b = new int[m];

            //get input from user;
            for(int i = 0; i < a.length; i++){
                a[i] = input.nextInt();
            }
            for(int j = 0; j < b.length; j++){
                b[j] = input.nextInt();
            }

            int result = getResult(a,b);

            System.out.println(result);
        }
    }


    public static int getResult(int[] a, int[] b){
        int isdivideableByA = 0;
        int isDivideAble = 0;
        int result = 0;

        for(int i = 1; i <= b[0]; i++){
            for(int j = 0; j < a.length; j++){
                if(i % a[j] == 0){
                    isdivideableByA++;
                }
            }
            if(isdivideableByA == a.length){
                for(int k = 0; k < b.length; k++){
                    if(b[k] % i == 0){
                        isDivideAble++;
                    }
                }
            }
            if(isDivideAble == b.length){
                result++;
            }
            isDivideAble = 0;
            isdivideableByA = 0;
        }
        return result;
    }
}
