import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Generator {
    
    static String generate_password(int size) {// function to generate password
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-/.,<>?;':\"[]{}\\|`~"; // collection of characters that can be used in password
        String password = "";
        Random rnd = new Random(); // creating object of Random class
        while (password.length() < size) { // loop to generate password
            int index = (int) (rnd.nextFloat() * chars.length()); // to get random number between 0 and length of chars
            password += chars.charAt(index);// add character at index to password
        }
        return password;
    }
    public static String getPasswordStrength(int length) {
		if(length < 8) {    // condition to check the strength
			return " Very weak";
		} else if(length < 10) {
			return "medium";
		} else {
			return "strong";
		}
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of password: ");
        int size = sc.nextInt();
        sc.close();
        String password = generate_password(size);// calling function to generate password
        System.out.println(password);// printing the password
        System.out.println("The length of the password is: " + password.length()); // printing the length of the password
        System.out.println("The strength of the password is: " + getPasswordStrength(size));// printing the strength of the password.
    }
}

