public class Helicopter extends AirTransport {

    private Rotor MainRotor = new Rotor("Black");
    private  Rotor TailRotor = new Rotor("While");

    private class Rotor{
        private String color;
        private Rotor(String color){
            this.color = color;
        }
    }
}
