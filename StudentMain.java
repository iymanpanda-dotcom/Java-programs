class Student {
    private String name;
    private int marks;
    Student(String n, int m) { name = n; marks = m; }
    public String getName() { return name; }
    public int getMarks() { return marks; }
    public void setMarks(int m) {
        if (m >= 0 && m <= 100) marks = m;
        else System.out.println("Invalid marks!");
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("Asha", 82);
        System.out.println(s.getName() + ": " + s.getMarks());
        s.setMarks(150);   // rejected
    }
}

