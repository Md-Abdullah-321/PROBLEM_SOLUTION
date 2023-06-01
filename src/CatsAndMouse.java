import java.util.Scanner;

public class CatsAndMouse {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //get n from user:
            int n = input.nextInt();

            //Run a loop based on n:
            for(int i = 0; i < n; i++){
                int catA = input.nextInt();
                int catB = input.nextInt();
                int mouse = input.nextInt();

                String result = getResult(catA, catB, mouse);

                System.out.println(result);
            }
        }
    }

    public static String getResult(int catA, int catB, int mouse) {
        if((Math.abs(mouse - catA)) < (Math.abs(mouse - catB))){
            return "Cat A";
        }else if((Math.abs(mouse - catB)) < (Math.abs(mouse - catA))){
            return "Cat B";
        }else{
            return "Mouse C";
        }
    }
}
