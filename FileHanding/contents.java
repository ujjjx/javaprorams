// Java Program to display all the contents of a directory
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
public class contents{
    // If an IOException occurs within the main method, it will not be caught and handled by the main method itself;
    // Instead the exception will be propogated to the cal-stack to the Java runtime environment, which will then 
    // handle it according to its default behavior.
    public static void main(String[] args) throws IOException{  
        // Buffer is a memory area that is used to temporarily store data while it is 
        // being moved from one place to another.
        // When you are reading data from a slow source like a file or a network socket,
        // it is inefficient to read ome character at a time.
        // Each read operation could invoke a system call, which is an expensive in terms 
        // of time and resources.
        // To make this process more efficient, BufferedReader reads a larger block(buffer)
        //of data at once into memory and then serves subsequent read requests from the buffer.
        // When the buffer is exhausted, it reads another block of data. This is much faster becuase it reduces
        // the number of system calls.
        // The InputStreamReader is a bridge from a byte stream to a character streams in Java.
        // It reads bytes and decodes them into characters using a specified charset.

        // In Java, a byte stream is a sequence of bytes. Byte stream are used for reading from amd writing to
        // binary files or any other type of file where the basic unit of information is a byte.

        // java has a two types of byte stream classes.
        // 1. InputStream: It is an abstract class that is the superclass of all classes representing an input stream of bytes.
        // 2. OutputStream: It is an abstract class that is the superclass of all classes representing an output stream of bytes.
        // Reader and Writer are the character stream classes in Java. They are the superclass of all classes representing an input stream of characters.

        // The input Stream and OutputStream classes are the base classes for reading from and writing to byte streams, respectively.

        // BufferedReader can be used in combination with InputStreamReader to read text from a byte stream with efficient buffering.
        // InputStreamReader converts the byte stream into a character stream and BufferedReader buffers the input from
        // this character stream for efficient reading.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // This line of code is used to read the input from the standard input stream(usually the keyboard).
        // System.in: This is the standard input stream in Java. By default it is connected to the keyboard input.

        // new InputStreamReader(System.in): This creates an InputStreamReader instance that reads bytrs from 
        // System.in and converts them into characters using the default character encoding of the platform.

        // new BufferedReader(new InputStreamReader(System.in)):This creates a BufferedReader instance that
        // wraps the InputStreamReader instance. The BufferedReader provides efficient reading of characters,
        // arrays and lines. buffering the input from the InputStreamReader so that it's possible to read larger amounts at a time 
        // from the underlying stream (in this case, System.in)./
        System.out.println("Enter the directory path: ");
        String path = br.readLine();
        System.out.println("Enter the directory name: ");
        String dname = br.readLine();
        // create File object with dirpath and dname
        // The File 
        File f = new File(path, dname);
        // if directory exists,then
        if (f.exists()) {
            // get the contents into arr[]
            // now arr[i] represent either a File or
            // Directory
            String arr[] = f.list();
 
            // find no. of entries in the directory
            int n = arr.length;
            // displaying the entries
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
                // create File object with the entry and
                // test if it is a file or directory
                File f1 = new File(f,arr[i]);
                if (f1.isFile())
                    System.out.println(": is a file");
                if (f1.isDirectory())
                    System.out.println(": is a directory");
            }
            System.out.println(
                "No of entries in this directory " + n);    
        }
        else
            System.out.println("Directory not found");
    }
}
