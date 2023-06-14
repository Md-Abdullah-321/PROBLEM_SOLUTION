import java.util.Scanner;

public class UthopianTree {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //get n from user:
            int n = input.nextInt();

            //create an array based on n:
            int[] AgeOfTree = new int[n];

            //Run a loop to get values of ageoftree:
            for(int i = 0; i < n; i++){
                AgeOfTree[i] = input.nextInt();
            }

            int highestNumber = getHighestNumber(AgeOfTree);
            // System.out.println(highestNumber);
            int tree = 1;
            for(int a = 0; a < n; a++){
                for(int j = 0; j <= highestNumber; j++){
                // Condition - 1:
                if(j == 0){
                    tree += 0;
                }else if(j % 2 == 0){
                    tree += 1;
                }else{
                    tree *= 2;
                }

                 // Condition - 2:
                 if(j == AgeOfTree[a]){
                    System.out.println(tree);
                 }
            }
            tree = 1;
            }
        }
    }
    public static int getHighestNumber(int[] tree) {
        int highestNumber = tree[0];

        for(int k = 0; k < tree.length; k++){
            if(highestNumber < tree[k]){
                highestNumber = tree[k];
            }
        }

        return highestNumber;
    }
}
