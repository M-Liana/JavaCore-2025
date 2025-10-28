package chapters.chapter8;

public class DemoShipment {

    public static void main(String[] args) {
        Shipment shipment = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment1 = new Shipment(3, 2, 4, 0.76, 1.28);
        double vol;

        vol = shipment.volume();
        System.out.println(" sipment.volume == " + vol);
        vol = shipment1.volume();
        System.out.println("sipment1.volume==" + vol + " " + shipment1.cost);
    }
}
