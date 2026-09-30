import java.util.Scanner;

public class Q5PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[8];
        int pass = 0, fail = 0;

        System.out.println("Enter marks of 8 students:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            if (marks[i] >= 40)
                pass++;
            else
                fail++;
        }

        System.out.println("Passed = " + pass);
        System.out.println("Failed = " + fail);
        sc.close();
    }
}

