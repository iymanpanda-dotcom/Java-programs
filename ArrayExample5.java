public class Example5 {
    public static void main(String[] args) {
        String[] names = new String[5];

        // Insert data
        names[0] = "Anil";
        names[1] = "Bina";
        names[2] = "Charan";
        names[3] = "Divya";
        names[4] = "Esha";

        // Retrieve data
        System.out.println("Student names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}