public class passingCurrentObject {
    public void doSomething(){
        // Pass the current object to another method
        somemethod(this);
    }

    private void somemethod(passingCurrentObject obj) {
        System.out.println("Object Recieved: "+obj);
        // Perform some operation with the recieved object
    }

    public static void main(String[] args) {
        passingCurrentObject myObj = new passingCurrentObject();
        myObj.doSomething();
    }


}

