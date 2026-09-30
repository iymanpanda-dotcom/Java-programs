import java.util.Scanner;
 
public class Q16_ValidMarksEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
 
        do {
            System.out.print("Enter marks (0-100): ");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Please try again.");
            }
        } while (marks < 0 || marks > 100);
 
        System.out.println("Marks accepted: " + marks);
    }
}
