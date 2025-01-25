public class ReturningObjects {
    private String name;
    public ReturningObjects(String name) {
        this.name = name;
    }
    // Method can also return the current object to support method chaining

    public String getName() {
        return name;
    }
}
class Person{
    public static ReturningObjects createPerson(String name){
        return new ReturningObjects(name); // Returning Object
    }
    // If a method needs to indicate that it cannot return a valid object, it can return 'null'
    public static String findName(String[] names, String target){
        for(String name:names){
            if(name.equals(target)){
                return name;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        // Creating an object of ReturningObjects class using function of another clas Person
        ReturningObjects person = createPerson("John");
        System.out.println("Name: " + person.getName());

        // Returning null
        String[] names = {"John", "Alice", "Bob"};
        String result = findName(names, "Alicex");
        if (result != null) {
            System.out.println("Name found: " + result);
        } else {
            System.out.println("Name not found");
        }
    }
}