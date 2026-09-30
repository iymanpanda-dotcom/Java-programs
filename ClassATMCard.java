class ATMCard {
    private final String cardNo;  // read-only
    private int pin;              // write-only
    ATMCard(String cardNo, int pin) {
        this.cardNo = cardNo;
        this.pin = pin;
    }
    public String getCardNo() {   // getter only
        return cardNo;
    }
    public void setPin(int newPin) {  // setter only
        if (newPin >= 1000 && newPin <= 9999)
            pin = newPin;
    }
    public boolean verifyPin(int p) {
        return pin == p;
    }
}
public class ClassATMCard {
    public static void main(String[] a) {
        ATMCard c = new ATMCard("XX-4417", 1234);
        System.out.println(c.getCardNo());
        c.setPin(4321);
        System.out.println(c.verifyPin(4321));
    }
}
