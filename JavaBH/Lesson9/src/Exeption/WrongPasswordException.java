package Exeption;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message){
        super(message);
    }

    public WrongPasswordException(){
        super("WrongPasswordException");
    }
}
