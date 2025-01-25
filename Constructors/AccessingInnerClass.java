public class AccessingInnerClass {
    private int outerField = 10;
    public void outerMethod() {
        System.out.println("Inside outerMethod of Outer class");
    }
    public class Inner {
        private int innerField = 20;

        public void innerMethod() {
            System.out.println("Inside innerMethod of Inner class");
            System.out.println("Outer field from inner class: " + AccessingInnerClass.this.outerField);
            outerMethod(); // Invoking outer class method
        }
    }
    public static void main(String[] args) {
        AccessingInnerClass outerObj = new AccessingInnerClass();
        AccessingInnerClass.Inner innerObj = outerObj.new Inner();

        innerObj.innerMethod();
    }
}
