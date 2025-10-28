package chapters.chapter8;

public class Shipment extends  BoxWeight1{
    double cost;
    Shipment (Shipment ob){
        cost= ob.cost;
    }
    Shipment(double w,double h,double d,double m ,double c){
        super(w,h,d,m);
        cost = c;
    }



}
