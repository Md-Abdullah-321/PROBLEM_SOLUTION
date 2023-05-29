import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Get Birds Count:
            int n = input.nextInt();

            // Create a HashMap to store bird counts
            Map<Integer, Integer> birdCounts = new HashMap<>();

            // Get input from the user and update bird counts
            for (int i = 0; i < n; i++) {
                int birdType = input.nextInt();
                birdCounts.put(birdType, birdCounts.getOrDefault(birdType, 0) + 1);
            }

            // Find the bird with the highest count
            int highestId = 0;
            int highestCount = 0;
            for (Map.Entry<Integer, Integer> entry : birdCounts.entrySet()) {
                int birdType = entry.getKey();
                int count = entry.getValue();
                if (count > highestCount || (count == highestCount && birdType < highestId)) {
                    highestId = birdType;
                    highestCount = count;
                }
            }

            // Print the result
            System.out.println(highestId);
        }
    }
}
