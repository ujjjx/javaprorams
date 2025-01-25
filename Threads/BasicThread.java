class Multi extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        Multi func1=new Multi();
        func1.start();
        Multi func2=new Multi();
        func2.start();
    }
}