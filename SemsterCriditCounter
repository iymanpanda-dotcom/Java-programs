import java.util.Scanner;
 
public class Q6_SemesterCreditCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCredits = 0;
        int courseCount = 0;
        int credit;
 
        do {
            System.out.print("Enter credits for course " + (courseCount + 1) + ": ");
            credit = sc.nextInt();
            totalCredits += credit;
            courseCount++;
        } while (totalCredits < 20);
 
        System.out.println("Total credits reached: " + totalCredits);
        System.out.println("Number of courses needed: " + courseCount);
    }
}
