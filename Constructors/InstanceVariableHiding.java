public class InstanceVariableHiding{
    private int x = 10;

    public void display(int x) {
        System.out.println("Local variable x: " + x); // References the local variable
        System.out.println("Instance variable x: " + this.x); // References the instance variable using "this"
    }

    public static void main(String[] args) {
        InstanceVariableHiding obj = new InstanceVariableHiding();
        obj.display(25);
    }
}