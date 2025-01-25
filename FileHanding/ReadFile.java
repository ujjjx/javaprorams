import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.nio.file.*;
public class ReadFile {
    // Buffered Class for Reading text file
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st=br.readLine())!=null){
            System.out.println(st);
        }
    }
}
class ReadFile1{
    //FileReader class for Reading text file
    public static void main(String[] args) throws Exception{
        FileReader fr  = new FileReader("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
    }
}
class ReadFromFileUsingScanner{
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
        Scanner sc = new Scanner(file);
 
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());

    }
}
class ReadEntireFileWithoutLoop{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
}
class ReadTextAsString{
    public static String readFileAsString(String fileName)
        throws Exception
    {
        String data = "";
        data = new String(
            Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static void main(String[] args) throws Exception{
        String data = readFileAsString("D:\\ujjwal work\\sem-6\\Java\\Java Concepts\\FileHanding\\file\\text.txt");
        System.out.println(data);
    }
}