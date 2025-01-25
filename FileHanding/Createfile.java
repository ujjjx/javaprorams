import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Createfile{
    public static void main(String[] args) {
        Createfile cf = new Createfile();
        cf.newFile();
    }
    public void newFile(){
        String strPath = " ",strName = "";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");
            // Reading the fileName
            strName = br.readLine();
            System.out.println("Enter the file path:");
 
            // Reading File Path
            strPath = br.readLine();
            // Reading File Path
            strPath = br.readLine();
 
            // Creating File Object
            File file1 = new File(strPath + "" + strName + ".txt");
            // Method createNewFile() method creates blank
            // file.
            file1.createNewFile();
        }// Try-Catch Block
        catch (Exception ex1) {
        }

    }
}