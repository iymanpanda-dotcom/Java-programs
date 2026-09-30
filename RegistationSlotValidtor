import java.util.Scanner;
 
public class Q4_RegistrationSlotValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day (1=Mon ... 7=Sun): ");
        int day = sc.nextInt();
        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();
 
        if (day >= 1 && day <= 5) {
            if (hour >= 9 && hour < 17) {
                System.out.println("Registration Allowed");
            } else {
                System.out.println("Registration Closed - Outside Hours");
            }
        } else {
            System.out.println("Registration Closed - Weekend");
        }
    }
}
