import javax.security.auth.callback.Callback;

class Client implements Callback {
    // Implement Callback's interface
    public void callback(int p){
        System.out.println("callback called with "+p);
    }
}
class TestIface {
    public static void main(String args[]) {
        Callback c = new Client();
        ((Client) c).callback(42);
    }
}

