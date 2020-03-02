public abstract class GroundTransport implements Vehicle {
    private int namber_wheels;
    public String tip_engine = "rotary";
    public static void min_speed(){ }
    public static void max_speed(){ }
    public static void max_range(){ }
    public static void fuel_consumption(){ }
    public void setNamber_wheels(int x){
        this.namber_wheels = namber_wheels;
    }
    public static void main (String[] args){
        max_speed();
        min_speed();
        max_range();
        fuel_consumption();
    }
}


