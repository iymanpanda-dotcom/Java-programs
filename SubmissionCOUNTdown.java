import java.util.Scanner;
 
public class Q12_SubmissionCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days remaining: ");
        int days = sc.nextInt();
 
        for (int d = days; d >= 0; d--) {
            if (d == 0) {
                System.out.println("Deadline Day! Submit your assignment now.");
            } else {
                System.out.println(d + " day(s) remaining to submit the assignment.");
            }
        }
    }
}
