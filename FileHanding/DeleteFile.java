import java.io.File;
import java.nio.file.*;
import java.io.IOException;
public class DeleteFile {
    public static void main(String[] args)
    {
        File file
            = new File("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
 
        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }

}
class Test {
    public static void main(String[] args)
    {
        try {
            Path filePath = Paths.get("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
            Files.deleteIfExists(filePath);
            System.out.println("File deleted successfully");
        } 
        catch (NoSuchFileException e) {
         System.out.println("No such file/directory exists");
        }
        catch (IOException e) {
            System.out.println("Invalid permissions.");
        }
        System.out.println("Deletion successful.");
    }
}

