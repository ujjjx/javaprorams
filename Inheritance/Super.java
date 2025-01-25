public class Super {
    int num = 10;
    void display(){
        System.out.println("Superclass method");
    }
    Super(int num){
        this.num = num;
    }
}
class SubClass extends Super{
    int num = 20;

    @Override
    void display() {
        // Accessing superclass field
        System.out.println("Superclass num: "+super.num);
        // Invoking superclass method
        super.display();
    }
    SubClass(int num1,int num2){
        super(num1); // Invoking superclass constructor
        this.num = num2;
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(5, 15);

        // Calling overridden display method
        obj.display();
    }
}
