class WaterSaver {

    void tips() {
        System.out.println("Turn off tap while brushing, Reuse water");
    }

    public static void main(String[] args) {

        WaterSaver obj1 = new WaterSaver();
        WaterSaver obj2 = new WaterSaver();
        WaterSaver obj3 = new WaterSaver();
        WaterSaver obj4 = new WaterSaver();
        WaterSaver obj5 = new WaterSaver();

        obj1.tips();
        obj2.tips();
        obj3.tips();
        obj4.tips();
        obj5.tips();

        int waterLevel = 5;

        while (waterLevel > 0) {
            waterLevel = waterLevel - 1;
        }

        System.out.println("Bucket Empty");
    }
}