import java.util.Scanner;

public class SaveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) {
        int remainingCandies = (m - 1) % n;
        int lastCandyPosition = (s - 1) + remainingCandies;

        if (lastCandyPosition >= n) {
            return lastCandyPosition % n + 1;
        } else {
            return lastCandyPosition + 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        for (int i = 0; i < testCases; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            int s = input.nextInt();

            int prisonerToWarn = saveThePrisoner(n, m, s);
            System.out.println(prisonerToWarn);
        }

        input.close();
    }
}
