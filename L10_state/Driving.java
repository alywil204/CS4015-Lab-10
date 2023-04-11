public class Driving extends TravelMode {
    public Driving(DirectionService ds) {
        super(ds);
    }

    public int getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }
}