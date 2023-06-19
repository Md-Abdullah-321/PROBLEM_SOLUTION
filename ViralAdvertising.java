import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int n = input.nextInt();

            int shared = 0, liked = 2, comulative = 2;
            if(n == 1){
                System.out.println(comulative);
            }else
            {
                for(int i = 1; i < n; i++){
                shared = liked * 3;
                liked = shared / 2;
                comulative += liked;
                }
                System.out.println(comulative);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
