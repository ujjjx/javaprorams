package Mypack;

public class AccountBalance {
    public static void main(String args[]) {
        Mypack.Balance current[] = new Mypack.Balance[3];
        current[0] = new Mypack.Balance("K. J. Fielding", 123.23);
        current[1] = new Mypack.Balance("Will Tell", 157.02);
        current[2] = new Mypack.Balance("Tom Jackson", -12.33);
        for(int i=0; i<3; i++) current[i].show();
    }
}
