import java.util.Scanner;
 
public class Q8_LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days late: ");
        int daysLate = sc.nextInt();
        int fine = 0;
 
        for (int day = 1; day <= daysLate; day++) {
            fine += 5;
            if (fine >= 100) {
                fine = 100;
                System.out.println("Fine cap reached at day " + day);
                break;
            }
        }
 
        System.out.println("Total Fine: Rs. " + fine);
    }
}
