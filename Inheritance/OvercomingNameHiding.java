public class OvercomingNameHiding {
    int i;
}
class B extends OvercomingNameHiding{
    int i; // this i hides i in OvercomingNameHiding class
    B(int a,int b){
        super.i = a; // i in Super class
        i = b; // i in B
    }
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}