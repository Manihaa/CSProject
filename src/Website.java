import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Website {
    private Scanner scan;
    private ArrayList<User> Users;
    private int numUsers;

    public void start(){
        scan = new Scanner(System.in);
        Users = new ArrayList<>();
        numUsers = 0;
        welcome();
    }

    private void welcome(){
        System.out.println("Welcome to Google.com");
        System.out.print("Login (1), Sign up (2)\nEnter: ");
        String answer = scan.nextLine();
        if (answer.equals("1")){
            login();
        }else if (answer.equals("2")){
            signUp();
        }else{
            System.out.println("Sorry, we couldn't process your request.\nPlease enter an appropriate option.\n");
            welcome();
        }
    }

    private void signUp(){
        boolean boo = true;
        String user = "";
        String pw = "";
        String pw2 = "";

        while (boo){
            boo = false;
            System.out.print("\nEnter a Username: ");
            user = scan.next();
            for (int i = 0; i < Users.size(); i++){
                if (Users.get(i).getUser().equals(user)){
                    System.out.print("Please enter a unique username.");
                    boo = true;
                }
            }
        }
        boo = true;
        while (boo){
            System.out.print("Your password must contain the following:\nAt least one number [0-9]\nAt least one special character\nAt least 5 characters long\n\nEnter a Password: ");
            pw = scan.next();
            String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            String[] sc = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "[", "]", "{", "}", "-", "_", "+", "=", ";", ":", ",", ".", "<", ">", "?", "/", "\\", "~", "`", "|", "\""};
            for (int i = 0; i < nums.length; i++){
                if (pw.contains(nums[i])){
                    boo = false;
                }
            }
            if (!boo){
                boo = true;
                for (int i = 0; i < sc.length; i++){
                    if (pw.contains(sc[i])){
                        boo = false;
                    }
                }
            }
            if (!boo){
                boo = true;
                if (pw.length() >= 5){
                    boo = false;
                }
            }

            if (boo){
                System.out.println("Please enter a valid password.\n");
            }
        }

        boo = true;
        while (boo){
            System.out.print("Reenter Password: ");
            pw2 = scan.next();
            if (pw.equals(pw2)){
                boo = false;
                numUsers++;
                Users.add(new User(user, pw));
            }else{
                System.out.println("Passwords do not match.\n");
            }
        }
        System.out.println("Welcome, " + user + "\nTo access your account, please log in.\n");
        scan.nextLine();
        welcome();
    }

    private void login(){

    }
}
