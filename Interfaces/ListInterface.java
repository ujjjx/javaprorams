import java.util.ArrayList;
import java.util.List;

public class ListInterface{
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("List elements");
        for(String name:names){
            System.out.println(name);
        }
        // Accessing elements by index
        String elementAtIndex1 = names.get(1);
        System.out.println("\nElements at index1: "+elementAtIndex1);
        // Getting the index of an element
        int index = names.indexOf("Charlie");
        System.out.println("\nIndex of Charlie: "+index);
        // Removing an element
        names.remove(0); // Removes the first element
        // Displaying the modified List
        System.out.println("\nModified List:");
        for (String name : names) {
            System.out.println(name);
        }
        // Checking if the List contains a specific element
        boolean containsElement = names.contains("Bob");
        System.out.println("\nList contains 'Bob': " + containsElement);

        // Getting the size of the List
        int size = names.size();
        System.out.println("\nSize of List: " + size);
    }
}