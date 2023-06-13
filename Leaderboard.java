import java.util.Arrays;
import java.util.Scanner;

public class Leaderboard {
    public static int[] climbingLeaderboard(int[] ranked, int[] player) {
        int[] ranks = new int[player.length];
        int[] uniqueRanked = Arrays.stream(ranked).distinct().toArray();
        int index = uniqueRanked.length - 1;
        
        for (int i = 0; i < player.length; i++) {
            while (index >= 0) {
                if (player[i] >= uniqueRanked[index]) {
                    index--;
                } else {
                    ranks[i] = index + 2;
                    break;
                }
            }
            
            if (index < 0) {
                ranks[i] = 1;
            }
        }
        
        return ranks;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int n = scanner.nextInt();
        int[] ranked = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            ranked[i] = scanner.nextInt();
        }
        
        
        int m = scanner.nextInt();
        int[] player = new int[m];
        
       
        for (int i = 0; i < m; i++) {
            player[i] = scanner.nextInt();
        }
        
        int[] ranks = climbingLeaderboard(ranked, player);
        
       
        for (int rank : ranks) {
            System.out.println(rank);
        }
        
        scanner.close();
    }
}
