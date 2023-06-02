package Dependency_Injection;

public class EmailService {
    public void sendEmail(String message, String receiver){
        System.out.println("Email sent to " + receiver + " with hMessage=" + message);
    }
}
