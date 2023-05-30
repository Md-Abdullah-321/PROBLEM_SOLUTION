import java.util.Scanner;

public class drawingBook {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //get total page and page to open:
            int book = input.nextInt();
            int page = input.nextInt();

            double half = book / 2;

            //Condition:
            int result;
            if(half < page){
                result =  startFromEnd(book, page);
            }else{
                result = startFromBeginning(book, page);
            }

            System.out.println(result);
        }
    }

    public static int startFromBeginning(int book, int page) {

        //Conditon if there is no flip:
        if(page == 1 || page == book){
            return 0;
        }
        if(book % 2 != 0){
            if((book - page) == 0){
                return 0;
            }
        }
        if(book % 2 == 0){
            if((book - page) == 1){
                return 1;
            }
        }

        int sum = 0;
        int totalPage = 0;

        for(int i = 0; i < page; i++){
            sum++;
        }
        totalPage += sum / 2;
        return totalPage;
    }

    public static int startFromEnd(int book, int page) {
        //Conditon if there is no flip:
        if(page == 1 || page == book){
            return 0;
        }
        if(book % 2 != 0){
            if((book - page) == 0){
                return 0;
            }
        }
        if(book % 2 == 0){
            if((book - page) == 1){
                return 1;
            }
        }
        
        int sum = 0;
        int totalPage = 0;

        for(int i = book ; i > page; i--){
            sum++;
        }
        totalPage += sum / 2;
        return totalPage;
    }
}
