import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            input.nextLine(); // Consume the newline character

            // Create String array based on n:
            String[] stringsArray = new String[n];

            // Get n items and push them into the String Array:
            for (int i = 0; i < n; i++) {
                stringsArray[i] = input.nextLine();
            }

            // Get the size of queries:
            int q = input.nextInt();
            input.nextLine(); // Consume the newline character

            // Create queries array to store queries:
            String[] queries = new String[q];

            // Get q items and push them into the queries Array:
            for (int j = 0; j < q; j++) {
                queries[j] = input.nextLine();
            }

            // Compare queries and print the count:
            for (int k = 0; k < q; k++) {
                int count = 0;

                for (int l = 0; l < n; l++) {
                    if (queries[k].equals(stringsArray[l])) {
                        count++;
                    }
                }

                System.out.println(count);
            }
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
        }
    }
}
