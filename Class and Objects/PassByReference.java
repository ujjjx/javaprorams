class Test{
    int a,b;
    Test(int i,int j){
        a = i;
        b = j;
    }
    // pass an object
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
public class PassByReference {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        System.out.println("Before Call: "+ob.a+" "+ob.b);
        ob.meth(ob);
        System.out.println("After Call:"+ob.a+" "+ob.b);
    }
}
