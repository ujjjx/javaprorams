// In this Java program, we accept a file or a directory name
// from command line arguments. Then the program will check if that
// file or directory exists or not. If it exists, then it will print
// the properties of that file or directory.

import java.io.File;

public class FileProperty {
    public static void main(String[] args) {
        // accepts file name or directory name through
        // command line arguments.
        String fileName = args[0];
        // pass the file or directory name to File object.
        File f = new File(fileName);
        // apply File class methods on File object
        System.out.println("File name : " + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Exists : " + f.exists());
        if(f.exists()){
            System.out.println("Is writeable: " + f.canWrite());
            System.out.println("Is readable: " + f.canRead());
            System.out.println("Is a directory: " + f.isDirectory());
            System.out.println("File Size in bytes: " + f.length());
        }
    }
}