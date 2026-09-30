import java.util.Scanner;
 
public class Q9_ExamProctorScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second = 1;
        boolean flagged = false;
 
        while (second <= 60) {
            System.out.print("Activity at second " + second + " suspicious? (yes/no): ");
            String activity = sc.nextLine();
 
            if (activity.equalsIgnoreCase("yes")) {
                flagged = true;
                System.out.println("Suspicious activity detected at second " + second + ". Exam flagged!");
                break;
            }
            second++;
        }
 
        if (!flagged) {
            System.out.println("No suspicious activity detected during the exam.");
        }
    }
}
