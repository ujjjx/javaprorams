import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
public class writeFile  {
    public static void main(String[] args)throws IOException{
        // Assigning the content of the file
        String text
            = "Welcome to geekforgeeks\nHappy Learning!";
 
        // Defining the file name of the file
        Path fileName = Path.of("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
        // Writing into the file
        Files.writeString(fileName, text);
        // Reading the content of the file
        String file_content = Files.readString(fileName);
 
        // Printing the content inside the file
        System.out.println(file_content);        
    }
}
class usingFileWriterClass{
    
    public static void main(String[] args) {
        try{
            String text = "Computer Science Portal GeeksforGeeks";
            FileWriter fw = new FileWriter("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
            // Writing into file
                // Note: The content taken above inside the
                // string
                fw.write(text);
     
                // Printing the contents of a file
                System.out.println(text);
     
                // Closing the file writing connection
                fw.close();
     
                // Display message for successful execution of
                // program on the console
                System.out.println("File is created successfully with the content.");
            }// Catch block to handle if exception occurs
        catch (IOException e) {
 
            // Print the exception
            System.out.print(e.getMessage());
        }

    }
    
}
class MyBufferedWriter{
    public static void main(String[] args) {
        String text = "Computer Science Portal GeeksforGeeks";
        try{
            // Step-1 Create an object of BufferedWriter
            BufferedWriter f_writer = new BufferedWriter(new FileWriter("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt"));
            // Step 2: Write text(content) to file
            f_writer.write(text);
 
            // Step 3: Printing the content inside the file
            // on the terminal/CMD
            System.out.print(text);
 
            // Step 4: Display message showcasing
            // successful execution of the program
            System.out.print(
                "File is created successfully with the content.");
            // Step 5: Close the BufferedWriter object
            f_writer.close();

        }// Catch block to handle if exceptions occurs
        catch (IOException e) {
 
            // Print the exception on console
            // using getMessage() method
            System.out.print(e.getMessage());
        }

    }
}
class MyFileOutputStream{
    public static void main(String[] args) {
        String fileContent = "Welcome to geeksforgeeks";
        FileOutputStream outputStream = null;
        // Try block to check if exception occurs
        try {
 
            // Step 1:  Create an object of FileOutputStream
            outputStream = new FileOutputStream("text.txt");
            // Step 2: Store byte content from string
            byte[] strToBytes = fileContent.getBytes();
 
            // Step 3: Write into the file
            outputStream.write(strToBytes);
 
            // Print the success message (Optional)
            System.out.print(
                "File is created successfully with the content.");
        }// Catch block to handle the exception
        catch (IOException e) {
 
            // Display the exception/s
            System.out.print(e.getMessage());
        }
        // finally keyword is used with in try catch block
        // and this code will always execute whether
        // exception occurred or not
        finally {
 
            // Step 4: Close the object
            if (outputStream != null) {
 
                // Note: Second try catch block ensures that
                // the file is closed even if an error
                // occurs
                try {
 
                    // Closing the file connections
                    // if no exception has occurred
                    outputStream.close();
                }
 
                catch (IOException e) {
 
                    // Display exceptions if occurred
                    System.out.print(e.getMessage());
                }
            }
        }
    }
}