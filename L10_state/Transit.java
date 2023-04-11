public class Transit extends TravelMode {
    public Transit(DirectionService ds) {
        super(ds);
    }

    public int getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }
}