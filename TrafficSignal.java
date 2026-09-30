class TrafficSignal {

    void signal_rules() {
        System.out.println("Red: Stop, Yellow: Ready, Green: Go");
    }

    public static void main(String[] args) {

        TrafficSignal obj1 = new TrafficSignal();
        TrafficSignal obj2 = new TrafficSignal();
        TrafficSignal obj3 = new TrafficSignal();

        obj1.signal_rules();
        obj2.signal_rules();
        obj3.signal_rules();

        String signal = "Red";

        if (signal.equals("Red")) {
            System.out.println("Stop");
        } else if (signal.equals("Yellow")) {
            System.out.println("Ready");
        } else if (signal.equals("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid Signal");
        }
    }
}