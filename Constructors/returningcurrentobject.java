public class returningcurrentobject {
    private int value;
    public returningcurrentobject setValue(int value){
        this.value = value;
        return this;
    }
    public int getValue(){
        return value;
    }

    public static void main(String[] args) {
        returningcurrentobject obj = new returningcurrentobject();
        int result = obj.setValue(42).getValue();
        System.out.println("Value: " + result);
    }
}
