public abstract class WaterTransport implements Vehicle {
    private int screw;
    public String tip_engine = "piston";
    public static void min_speed() { }
    public static void max_speed() { }
    public static void max_range() { }
    public static void fuel_consumption() { }
    public void setScrew(int screw) {
        this.screw = screw;
    }
    public static void main(String[] args) {
        max_speed();
        min_speed();
        max_range();
        fuel_consumption();

    }
}