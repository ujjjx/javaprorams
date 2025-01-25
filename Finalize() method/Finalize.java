public class Finalize {
    // Class representing an object that need to perform cleanup before being
    // garbage collected
    static class MyClass{
        // Constructor
        MyClass(){
            System.out.println("Object Created");
        }
        // Step-6: Finalization: The JVM runs the finalization process,
        // which involves invoking the finalize() method of each object
        // in the finalization queue. This allows the object to perform
        // any necessary cleanup operations before it is reclaimed.
        // Finalize method
        protected void finalize(){
            System.out.println("Finalize method called");
            // Perform cleanup actions here
            // For demonstration purpose, let's print the message
            System.out.println("Cleanup actions performed.");
        }
        //Step-7:Object Reclaimed: After the finalize() method is executed (if present),
        // the object is reclaimed by the garbage collector, and the memory it
        // occupies is made available for future allocations.

        //Step-8:Finalization Queue Cleanup: Objects that have been finalized are
        // removed from the finalization queue.

        // Reclamation of Unreachable Objects: Objects that do not have a finalize()
        // method or whose finalize() method has already been executed are
        // reclaimed directly without being placed in the finalization queue.

    }

    public static void main(String[] args) {
        // Step-1: Creating an Object of MyClass
        MyClass obj = new MyClass();
        // Step-2: Object is used depending on its purpose

        // Step-3: When there are no longer any references to the object
        // (i.e., the object is not reachable from live thread), it becomes
        // eligible for garbage collection.
        // This can happen when all the references to the object are set
        // to null or when references go out of scope.
        // Making object eligible for garbage collection
        obj = null;

        // Step-4: When JVM(Java Virtual Machine) determines that memory
        // needs to be reclaimed, it initiates the garbage collection process.
        // This may occur based on factors such as memory pressure, allocation failure
        // or an explicit call to "System.gc()"
        System.gc();
        // Step-5: Before reclaiming memory from the object, the JVM checks if the object
        // has a finalize method() overridden. If it does the object is placed in a special
        // queue called the finalization queue.


    }
}
