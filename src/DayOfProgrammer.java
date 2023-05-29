import java.util.Scanner;

public class DayOfProgrammer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        String date = dayOfProgrammer(year);
        System.out.println(date);
    }

    public static String dayOfProgrammer(int year) {
        if (year <= 1917) {
            if (year % 4 == 0) {
                return String.format("12.09.%04d", year);
            } else {
                return String.format("13.09.%04d", year);
            }
        } else if (year == 1918) {
            return "26.09.1918";
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return String.format("12.09.%04d", year);
            } else {
                return String.format("13.09.%04d", year);
            }
        }
    }
}
