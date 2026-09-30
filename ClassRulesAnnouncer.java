class Classroom {

    void class_rules() {
        System.out.println("Maintain silence, Submit homework on time");
    }

    public static void main(String[] args) {

        Classroom obj1 = new Classroom();
        Classroom obj2 = new Classroom();
        Classroom obj3 = new Classroom();
        Classroom obj4 = new Classroom();

        obj1.class_rules();
        obj2.class_rules();
        obj3.class_rules();
        obj4.class_rules();

        int[] attendance = {40, 35, 40, 38, 40};

        for (int count : attendance) {
            if (count == 40) {
                System.out.println("Full Attendance");
            }
        }
    }
}