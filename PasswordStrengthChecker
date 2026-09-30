import java.util.Scanner;
 
public class Q11_PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password length: ");
        int length = sc.nextInt();
        System.out.print("Contains digit? (1-yes, 0-no): ");
        int hasDigit = sc.nextInt();
        System.out.print("Contains special character? (1-yes, 0-no): ");
        int hasSpecial = sc.nextInt();
 
        if (length >= 8) {
            if (hasDigit == 1 && hasSpecial == 1) {
                System.out.println("Password Strength: Strong");
            } else {
                System.out.println("Password Strength: Weak - Missing digit or special character");
            }
        } else {
            System.out.println("Password Strength: Weak - Too Short");
        }
    }
}
