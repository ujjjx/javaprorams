public class Box {
    private double width;
    private double height;
    private double depth;
    Box(Box obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }
    Box(double w,double h,double d){
        width = w;
        height= h;
        depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = depth = height = len;
    }
    double volume(){
        return  depth*width*height;
    }
}
class Boxweight extends Box{
    double weight;
    Boxweight(double w, double h, double d, double m){
//        width = w;
//        height = h;
//        depth = d;
        super(w,h,d);
        weight = m;
    }
    Boxweight(Boxweight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }
    Boxweight() {
        super();
        weight = -1;
    }
    // constructor used when cube is created
    Boxweight(double len, double m) {
        super(len);
        weight = m;
    }
}
// Add Shipping costs
class Shipment extends Boxweight{
    double cost;
    Shipment(Shipment ob){ // pass object to constructor
        super(ob);
        cost = ob.cost;
    }
    // constructor when all parameters are specified
    Shipment(double w, double h, double d,
             double m, double c) {
        super(w, h, d, m); // call superclass constructor
        cost = c;
    }
    // default constructor
    Shipment() {
        super();
        cost = -1;
    }
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
class DemoBoxWeigth{
    public static void main(String[] args) {
        Boxweight mybox1 = new Boxweight(10,20,15,34.3);
        Boxweight mybox2 = new Boxweight(2,3,4,0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of my box is "+vol);
        System.out.println("Weight of my box is "+mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of my box is "+vol);
        System.out.println("Weight of my box is "+mybox2.weight);
        System.out.println();
    }
}
class RefDemo{
    public static void main(String[] args) {
        // Create a BoxWeight object
        Boxweight weightbox = new Boxweight(3, 5, 7, 8.37);
        // Create a Box object
        Box plainbox = new Box();
        double vol;

        // Use methods defined in BoxWeight.
        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();
        // Assign BoxWeight reference to Box reference.
        plainbox = weightbox; // This is valid since BoxWeight is a subclass of Box.
        // Use methods defined in Box.
        vol = plainbox.volume(); // OK, volume() defined in Box
        System.out.println("Volume of plainbox is " + vol);
        // The following statement is invalid because plainbox
        // does not define a weight member.
        // System.out.println("Weight of plainbox is " + plainbox.weight);
    }
}
class DemoSuper {
    public static void main(String args[]) {
        Boxweight mybox1 = new Boxweight(10, 20, 15, 34.3);
        Boxweight mybox2 = new Boxweight(2, 3, 4, 0.076);
        Boxweight mybox3 = new Boxweight(); // default
        Boxweight mycube = new Boxweight(3, 2);
        Boxweight myclone = new Boxweight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();
    }
}
class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is "
                + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is "
                + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}
