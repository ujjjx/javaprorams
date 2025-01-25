public class A {
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}
// B implements the nested interfaces
class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x<0?false:true;
    }
}
class NestedIFDemo{
    public static void main(String[] args) {
        // use a nested interface reference
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if(nif.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}
