import java.util.Scanner;
 
public class Q14_GPAClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA (0.0 - 10.0): ");
        double gpa = sc.nextDouble();
 
        if (gpa < 0.0 || gpa > 10.0) {
            System.out.println("Invalid GPA entered");
        } else {
            if (gpa >= 8.5) {
                System.out.println("Category: Distinction");
            } else if (gpa >= 6.5) {
                System.out.println("Category: First Class");
            } else if (gpa >= 5.0) {
                System.out.println("Category: Second Class");
            } else {
                System.out.println("Category: Fail");
            }
        }
    }
}
