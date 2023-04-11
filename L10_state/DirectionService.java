public class DirectionService {
    private TravelMode travelMode = new Walking(this);

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public void walk() {
        this.travelMode.walk();
    }
    public void drive() {
        this.travelMode.drive();
    }
    public void transit() {
        this.travelMode.transit();
    }
    public void cycle() {
        this.travelMode.cycle();
    }

    public Object getEta() {
        return this.travelMode.getEta();
    }
}
   