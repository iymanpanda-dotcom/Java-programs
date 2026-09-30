import java.util.Scanner;
 
public class Q17_TimetableClashScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String previousSubject = "";
        boolean clashFound = false;
 
        for (int period = 1; period <= 8; period++) {
            System.out.print("Enter subject code for period " + period + ": ");
            String subject = sc.next();
 
            if (period > 1 && subject.equals(previousSubject)) {
                System.out.println("Clash detected! Periods " + (period - 1) + " and " + period + " both have " + subject);
                clashFound = true;
                break;
            }
            previousSubject = subject;
        }
 
        if (!clashFound) {
            System.out.println("No timetable clash found.");
        }
    }
}
