public class NewThread3 implements Runnable{
    String name;
    Thread t;
    NewThread3(String threadname){
        name = threadname;
        t = new Thread(this,name);
        System.out.println("New Thread: "+t);
        t.start();
    }
    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name+"Interrupted");
        }
        System.out.println(name+" exiting.");
    }
}
class MultiThreadDemo {
    public static void main(String args[]) {
        new NewThread3("One"); // start threads
        new NewThread3("Two");
        new NewThread3("Three");
        try {
        // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
