public abstract class TravelMode {
    private DirectionService ds;
    public TravelMode(DirectionService ds) {
        this.ds = ds;
    }
    public void walk() {
        this.ds.setTravelMode(new Walking(ds));
    }
    public void drive() {
        this.ds.setTravelMode(new Driving(ds));
    }
    public void transit() {
        this.ds.setTravelMode(new Transit(ds));
    }
    public void cycle() {
        this.ds.setTravelMode(new Bicycling(ds));
    }
    public abstract int getEta();
}   