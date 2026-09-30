class Phone {
    void call() {
        System.out.println("Calling...");
    }
}
class SmartPhone extends Phone {
    void browse() {
        System.out.println("Browsing internet...");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();     // inherited from Phone
        sp.browse();   // own method
    }
}
    
