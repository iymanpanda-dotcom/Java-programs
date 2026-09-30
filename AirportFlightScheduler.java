import java.util.Scanner;

public class AirportFlightScheduler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] flightNumber = new String[10];
        String[] destination = new String[10];
        String[] status = new String[10];

        int count = 0;
        int choice = 0;

        while (choice != 5) {

            System.out.println("\n===== AIRPORT FLIGHT BOARD & SCHEDULER =====");
            System.out.println("1. Add Flight Schedule");
            System.out.println("2. Update Flight Status");
            System.out.println("3. Search Flight");
            System.out.println("4. Show Flight Board");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (count < 10) {

                        System.out.print("Enter Flight Number: ");
                        flightNumber[count] = sc.nextLine();

                        System.out.print("Enter Destination: ");
                        destination[count] = sc.nextLine();

                        status[count] = "On Time";

                        count++;

                        System.out.println("Flight Added Successfully!");

                    } else {
                        System.out.println("Flight list is full!");
                    }

                    break;


                case 2:

                    System.out.print("Enter Flight Number: ");
                    String updateFlight = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (flightNumber[i].equalsIgnoreCase(updateFlight)) {

                            found = true;

                            System.out.println("1. On Time");
                            System.out.println("2. Delayed");
                            System.out.println("3. Cancelled");

                            System.out.print("Choose Status: ");
                            int statusChoice = sc.nextInt();
                            sc.nextLine();

                            switch (statusChoice) {

                                case 1:
                                    status[i] = "On Time";
                                    break;

                                case 2:
                                    status[i] = "Delayed";
                                    break;

                                case 3:
                                    status[i] = "Cancelled";
                                    break;

                                default:
                                    System.out.println("Invalid Choice!");
                            }

                            System.out.println("Status Updated Successfully!");
                        }
                    }

                    if (!found) {
                        System.out.println("Flight Not Found!");
                    }

                    break;


                case 3:

                    System.out.print("Enter Flight Number to Search: ");
                    String searchFlight = sc.nextLine();

                    boolean searchFound = false;

                    for (int i = 0; i < count; i++) {

                        if (flightNumber[i].equalsIgnoreCase(searchFlight)) {

                            System.out.println("\nFlight Number: " + flightNumber[i]);
                            System.out.println("Destination: " + destination[i]);
                            System.out.println("Status: " + status[i]);

                            searchFound = true;
                        }
                    }

                    if (!searchFound) {
                        System.out.println("Flight Not Found!");
                    }

                    break;


                case 4:

                   System.out.println("\n===== FLIGHT BOARD =====");

                    if (count == 0) {
                        System.out.println("No Flights Available!");
                    } else {

                        for (int i = 0; i < count; i++) {

                            System.out.println("\nFlight Number: " + flightNumber[i]);
                            System.out.println("Destination: " + destination[i]);
                            System.out.println("Status: " + status[i]);
                        }
                    }

                 break;


                case 5:

                    System.out.println("Thank You! Program Closed.");
                    break;


                default:

                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
