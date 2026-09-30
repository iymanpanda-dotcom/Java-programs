class Calculator {

    void show_units() {
        System.out.println("Units: cm, kg, litre");
    }

    public static void main(String[] args) {

        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();

        obj1.show_units();
        obj2.show_units();

        int number = 8;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}