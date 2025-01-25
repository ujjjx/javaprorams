public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3};
            System.out.println(numbers[4]); // This will throw an ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds: "+ e.getMessage());
        }catch (ArithmeticException e){
            // Handle ArithmeticException
            System.out.println("Arithmetic exception: "+e.getMessage());
        }catch (Exception e) {
            // Catch-all block for any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
