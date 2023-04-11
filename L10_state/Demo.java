public class Demo {
    public static void main(String[] args) {
        DirectionService ds = new DirectionService();
        System.out.println(ds.getEta());
        ds.drive();
        System.out.println(ds.getEta());
        ds.cycle();
        System.out.println(ds.getEta());
        ds.transit();
        System.out.println(ds.getEta());
        ds.walk();
        System.out.println(ds.getEta());
    }
}