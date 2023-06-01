import java.util.Scanner;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int altitude = 0; // current altitude
        int valleys = 0;  // number of valleys traversed

        for (char step : path.toCharArray()) {
            if (step == 'U') {
                altitude++;
            } else if (step == 'D') {
                altitude--;
            }

            if (altitude == 0 && step == 'U') {
                valleys++;
            }
        }

        return valleys;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = scanner.nextInt();
        scanner.nextLine();

        String path = scanner.nextLine();

        int result = countingValleys(steps, path);
        System.out.println(result);

        scanner.close();
    }
}
