import java.lang.reflect.Array;
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
        System.out.println("Welcome to Google.com");
        System.out.println("Login (1)\nSign up (2)\nEnter: ");
        String answer = scan.next();
        if (answer.equals("1")){
            login();
        }else if (answer.equals("2")){
            signUp();
        }
    }

    private void signUp(){
        boolean boo = true;

        while (boo){
            boo = false;
            System.out.println("Enter a Username: ");
            String user = scan.next();
            for (int i = 0; i < Users.size(); i++){
                if (Users.get(i).getUser().equals(user)){
                    System.out.println("Please enter a unique username.");
                    boo = true;
                }
            }
        }
        boo = true;
        while (boo){
            boo = false;
            System.out.println("Your password must contain the following:\nAt least one number [0-9]\nAt least one special character\n\nEnter a Password: ");
            String pw = scan.next();
            String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            String[] sc = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "[", "]", "{", "}", "-", "_", "+", "=", ";", ":", ",", ".", "<", ">", "?", "/", "\\", "~", "`", "|", "\""};

        }

        System.out.println("Reenter Password: ");
        String pw2 = scan.next();
        System.out.println("Sorry, we couldn't process your request.\nPlease enter an appropriate option.");
        welcome();
    }

    private void login(){

    }
}
