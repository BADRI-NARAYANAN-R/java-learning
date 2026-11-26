public class InvalidAgeException extends Exception{

String reason;
public InvalidAgeException(){
super("Invalid age.");
}

public void getMess(){
    System.out.println(super.getMessage());
}

}
