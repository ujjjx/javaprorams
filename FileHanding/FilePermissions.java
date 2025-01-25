

import java.io.File;

public class FilePermissions {
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating a file by
        // creating object of File class
        File file= new File("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
        // Checking if the file exists
        // using exists() method of File class
        boolean exists = file.exists();
        if (exists == true) {
 
            // Printing the permissions associated
            // with the file
            System.out.println("Executable: "
                               + file.canExecute());
            System.out.println("Readable: "
                               + file.canRead());
            System.out.println("Writable: "
                               + file.canWrite());
        }
 
        // If we enter else it means
        // file does not exists
        else {
            System.out.println("File not found.");
        }
    }

}
