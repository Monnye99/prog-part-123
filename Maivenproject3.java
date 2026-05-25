package part.pkg1;
import java.util.Scanner;


public class Maivenproject3 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        //Login user = new Login
        System.out.println("=== REGISTRATION ===");
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        System.out.print("Enter Cell Phone Number (e.g. +27831234567): ");
        String cellPhone = scanner.nextLine();
        
        Login user = new Login(firstName, lastName, username, password, cellPhone);
        
        String regResult = user.registerUser();
        System.out.println("\n" + regResult);
        
        if (user.checkUserName() && user.checkPasswordComplexity() 
                && user.checkCellPhoneNumber()) {
            
            System.out.println("\n=== LOGIN ===");
            System.out.print("Enter Username: ");
            String loginUsername = scanner.nextLine();
            
            System.out.print("Enter Password: ");
            String loginPassword = scanner.nextLine();
            
            System.out.println("\n" + user.returnLoginStatus(loginUsername, loginPassword));
        }
        
        scanner.close();
    }
}