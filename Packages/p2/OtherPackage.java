package p2;

public class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("other package constructor");
        // same class or package only
        // System.out.println("n = " + p.n);
        // same class only
        // System.out.println("n_pri = " + p.n_pri);
        // same class or derived subclass or package only
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
