import java.util.Scanner;

public class ElectronicsShop {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            // get b, n and m from user: 
            int b = input.nextInt();
            int n = input.nextInt();
            int m = input.nextInt();

            //create keyboard and mouse array:
            int[] keyboard = new int[n];
            int[] mouse = new int[m];

            //get keyboard and mouses price:
            for(int i = 0; i < n; i++){
                keyboard[i] = input.nextInt();
            }

            for(int j = 0; j < m; j++){
                mouse[j] = input.nextInt();
            }

            //
            int result = getPrice(keyboard, mouse, n, m, b);
            System.out.println(result);
        }
    }

    public static int getPrice(int[] keyboard, int[] mouse, int n, int m, int b) {
        int highestPrice = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int calculateItem = keyboard[i] + mouse[j];

                if(calculateItem <= b){
                    if(highestPrice < calculateItem){
                        highestPrice = calculateItem;
                    }
                }
            }
        }

        if(highestPrice == 0){
            highestPrice = -1;
        }
        return highestPrice;
    }
}
