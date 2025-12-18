import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Website {
    private Scanner scan;
    private ArrayList<User> Users;

    public void start(){
        scan = new Scanner(System.in);
        Users = new ArrayList<>();
    }

    private void welcome(){
        boolean boo = true;

        System.out.println("Welcome to Google.com");
        System.out.println("Login (1)\nSign up (2)");
        String answer = scan.next();
        if (answer.equals("1")){

        }else if (answer.equals("2")){
            while (boo){
                System.out.println("Enter a Username: ");
                String user = scan.next();
                if ()
            }
            System.out.println("Enter a Password: ");
            String pw = scan.next();
            System.out.println("Reenter Password: ");
            String pw2 = scan.next();
        }else{
            System.out.println("Sorry, we couldn't process your request.\nPlease enter an appropriate option.");
            welcome();
        }
    }

    private void signUp(String user, String pw){

    }

    private void login(String user, String pw){

    }
}
