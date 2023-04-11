public class Bicycling extends TravelMode {
    public Bicycling(DirectionService ds) {
        super(ds);
    }

    public int getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }
}