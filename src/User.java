import java.time.LocalDateTime;
import java.util.ArrayList;

public class User {
    private String user;
    private String password;
    private ArrayList<String> log;

    public User(String u, String pw){
        user = u;
        password = pw;
        log = new ArrayList<String>();
    }

    public String getUser(){
        return user;
    }

    /*
    public String getPassword(){
        return password;
    }
    */

    public void setPassword(String str){
        password = str;
    }

    public boolean authenticate(String str){
        if (password.equals(str)){
            return true;
        }
        return false;
    }

    public void logData(){
        String time = "" + LocalDateTime.now();
        log.add(time);
        time = time.substring(0, time.indexOf("T")) + " " + time.substring(time.indexOf("T") + 1, time.indexOf("T") + 9);
        System.out.println("User " + user + " logged in at " + time);
    }
}
