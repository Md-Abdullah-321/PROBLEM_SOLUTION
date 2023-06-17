import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //get test case from user:
            int t = input.nextInt();

            //Run a loop based on test Case:
            for(int i = 0; i < t; i++){
                //get total student & minimum present student from user:
                int n = input.nextInt();
                int minimumPresent = input.nextInt();

                //create an student array based on n:
                int[] students = new int[n];

                //get student present time:
                for(int j = 0; j < n; j++){
                    students[j] = input.nextInt();
                }



                //call getDescide();
                String result = getDescide(students, minimumPresent);

                //print result:
                System.out.println(result);
            }
        }
    }

    public static String getDescide(int[] students, int minimumPresent) {
        int present = 0;

        for(int k = 0; k < students.length; k++){
            if(students[k] <= 0){
                present++;
            }
        }

        //return conditionally:
        if(present >= minimumPresent){
            return "NO";
        }else{
            return "YES";
        }
    }
}