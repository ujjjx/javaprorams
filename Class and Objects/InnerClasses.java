public class InnerClasses {
    static class StaticNestedClass {
        void display() {
            System.out.println("Static nested class method");
        }
    }

    class InnerClass {
        void display() {
            System.out.println("Inner class method");
        }
    }

    void outerMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("Local inner class method");
            }
        }

        LocalInnerClass inner = new LocalInnerClass();
        inner.display();
    }
    void OuterMethod() {
        for (int i = 0; i < 3; i++) {
            int finalI = i;
            // Define a local inner class within the for loop
            class LocalInnerClass {
                void display() {
                    System.out.println("Local inner class method, i = " + finalI);
                }
            }

            // Instantiate the local inner class and call its method
            LocalInnerClass inner = new LocalInnerClass();
            inner.display();
        }
    }

    void anonymousMethod() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class method");
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        // Instantiate and use static nested class
        InnerClasses.StaticNestedClass staticNestedObj = new InnerClasses.StaticNestedClass();
        staticNestedObj.display();

        // Instantiate and use non-static inner class
        InnerClasses outerObj = new InnerClasses();
        InnerClasses.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();

        // Invoke outer method containing local inner class
        outerObj.outerMethod();
        outerObj.OuterMethod();

        // Invoke anonymous method containing anonymous inner class
        outerObj.anonymousMethod();
    }
}
