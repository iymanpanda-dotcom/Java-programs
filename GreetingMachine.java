class Greeting {

    void say_hello() {
        System.out.println("Hello, welcome!");
    }

    public static void main(String[] args) {

        Greeting obj1 = new Greeting();
        Greeting obj2 = new Greeting();
        Greeting obj3 = new Greeting();

        obj1.say_hello();
        obj2.say_hello();
        obj3.say_hello();

        int visitors = 7;

        if (visitors > 5) {
            System.out.println("Busy Day");
        } else {
            System.out.println("Normal Day");
        }
    }
}