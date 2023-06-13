import java.util.Scanner;

public class DesignerPDFViewer {
    public static void main(String[] args) {
       try(Scanner input = new Scanner(System.in)){
            //create a char array & store a - z:
            char[] letter = {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

            //create a int array of 24:
            int[] userLetter = new int[26];

            //get user input fro userLetter:
            for(int i = 0; i < 26; i++){
                userLetter[i] = input.nextInt();
            }
            String word = input.next();

            //call getResult() & store value to result:
            int result = getResult(letter, userLetter, word);

            //print result:
            System.out.println(result);
       }
    }

    public static int getResult(char[] letter, int[] userLetter, String word) {
        int wordLength = word.length();
        int[] wordArray = new int[wordLength];

        for(int i = 0; i < wordLength; i++){
            char slicedChar = word.charAt(i);

            for(int j = 0; j < 26; j++){
                if(letter[j] == slicedChar){
                    wordArray[i] = userLetter[j];
                }
            }
        }

        //get highest number in wordArray:
        int highestWord = wordArray[0];
        for(int k = 1; k < wordLength; k++){
            if(highestWord < wordArray[k]){
                highestWord = wordArray[k];
            }
        }
        int selectionArea = (highestWord * word.length());
        return selectionArea;
    }
}
