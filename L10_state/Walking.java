public class Walking extends TravelMode {
    public Walking(DirectionService ds) {
        super(ds);
    }

    public int getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }
}