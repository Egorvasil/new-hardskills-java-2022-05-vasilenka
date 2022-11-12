package by.vasilenka.datajpa.exceptions;

public class PlayerNotFoundException extends RuntimeException{

    private String massage = "Player with id %s is not present";

    public PlayerNotFoundException(long id){
        super();
    }
}
