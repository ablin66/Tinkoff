public abstract class AirTransport implements Vehicle {
    private String lifting_element;
    public String tip_engine = "jet";
    public static void min_speed(){ }
    public static void max_speed(){ }
    public static void max_range(){ }
    public static void fuel_consumption(){ }
    public void setLifting_element(String lifting_element) {
        this.lifting_element = lifting_element;
    }
    public static void main (String[] args){
        max_speed();
        min_speed();
        fuel_consumption();
        max_range();
    }
}
