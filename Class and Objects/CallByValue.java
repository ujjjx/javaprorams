public class CallByValue {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before method call: " + number);

        // Call the method with the value of 'number'
        modifyNumber(number);

        System.out.println("After method call: " + number);
    }

    // Method to modify the value of the parameter
    public static void modifyNumber(int n) {
        n = n * 2;
        System.out.println("Inside method: " + n);
    }
}