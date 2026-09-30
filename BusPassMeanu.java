import java.util.Scanner;
 
public class Q20_BusPassMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
 
        while (choice != 3) {
            System.out.println("1-Renew Pass\n2-Check Balance\n3-Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
 
            switch (choice) {
                case 1:
                    System.out.println("Bus Pass Renewed Successfully");
                    break;
                case 2:
                    System.out.println("Current Balance: Rs. 250");
                    break;
                case 3:
                    System.out.println("Exiting Transport Module...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
