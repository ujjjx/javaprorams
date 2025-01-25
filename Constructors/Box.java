public class Box {
    double width;
    double height;
    double depth;
    Box(){
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(double w, double h, double d) { // Parameterized Constructor
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}
class BoxDemo6 {
    public static void main(String args[]) {
    // declare, allocate, and initialize Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        Box mybox3 = new Box(10,20,15);
        Box mybox4 = new Box(3,6,9);
        double vol;
    // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
    // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
        // get volume of third box
        vol = mybox3.volume();
        System.out.println("Volume is " + vol);
        // get volume of fourth box
        vol = mybox4.volume();
        System.out.println("Volume is " + vol);
    }
}
