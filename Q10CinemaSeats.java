import java.util.Scanner;

public class Q10CinemaSeats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] seats = new int[3][4];
        int available = 0;

        System.out.println("Enter 3 rows of seat status (1=available, 0=occupied):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                seats[i][j] = sc.nextInt();
                if (seats[i][j] == 1) available++;
            }
        }

        System.out.println("Available seats = " + available);
        sc.close();
    }
}
