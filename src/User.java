public class User {
    private String user;
    private String password;

    public User(String u, String pw){
        user = u;
        password = pw;
    }

    public String getUser(){
        return user;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String str){
        password = str;
    }

    public boolean authenticate(String str){
        if (password.equals(str)){
            return true;
        }
        return false;
    }
}
