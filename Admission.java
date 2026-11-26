public class Admission{

    InvalidAgeException e = new InvalidAgeException();

    public Admission(int age){
        if(age < 3){
            System.out.println(e);
            e.getMess();
        }
        else{
            System.out.println("Admission Succuessfull.");
        }
    }
}