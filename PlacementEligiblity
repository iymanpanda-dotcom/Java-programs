import java.util.Scanner;
 
public class Q19_PlacementEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.print("Enter number of backlogs: ");
        int backlogs = sc.nextInt();
        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();
 
        if (cgpa >= 6.0) {
            if (backlogs == 0) {
                if (attendance >= 75) {
                    System.out.println("Eligible for Campus Placement");
                } else {
                    System.out.println("Not Eligible - Insufficient Attendance");
                }
            } else {
                System.out.println("Not Eligible - Pending Backlogs");
            }
        } else {
            System.out.println("Not Eligible - Low CGPA");
        }
    }
}
