public class CargoCar extends GroundTransport {
    public int кол_осей = 5;
    public String tepy_trailer;
    public String carrying_capacity = "20000 кг.";

    public static void main (String[] args){
        max_speed();
        min_speed();
        max_range();
        fuel_consumption();
    }
}
