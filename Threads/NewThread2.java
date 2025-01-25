public class NewThread2 extends Thread{
    NewThread2(){
        super("Demo thread");
        System.out.println("Child Thread: "+this);
        start(); //  start the thread
    }
    public  void run(){
        try {
            for(int i = 5; i>0;i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted.");
        }System.out.println("Exiting child thread");
    }
}
class ExtendThread {
    public static void main(String args[]) {
        new NewThread2(); // create a new thread
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
