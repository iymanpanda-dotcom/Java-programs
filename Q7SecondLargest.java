import java.util.Scanner;
public class Q7SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[6];

        System.out.println("Enter 6 scores:");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : score) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x < largest) {
                second = x;
            }
        }

        if (second == Integer.MIN_VALUE)
            System.out.println("No second-largest distinct score.");
        else
            System.out.println("Second-largest score = " + second);

        sc.close();
    }
}

