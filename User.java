package entities;

public class User {
    String login;
    String password;

    public User(String login,String password){
        this.login=login;
        this.password=password;
    }
    public void setLogin(String login1){
        login=login1;
    }
    public void setPassword(String password1){
        password=password1;
    }

    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
}
