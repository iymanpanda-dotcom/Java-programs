public class PecelWeight {
    Scanner sc = new Scanner(System.in);
    try {
        System.out.print(
            "Enter parcel weight:"
        );
        double weight=
        Double.parseDouble(
            sc.nextline()
        );
        System.out.println(
            "Weight accepted:"
            +weight+"kg"
        );
    }
    
}
