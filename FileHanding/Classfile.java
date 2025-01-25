import java.io.*; 
public class Classfile
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            double d = 1.5; 
            float f = 14.56f; 
  
            // Creating a new RandomAccessFile - "GEEK" 
            RandomAccessFile geek = new RandomAccessFile("GEEK.txt", "rw"); 
  
            // Writing to file 
            geek.writeUTF("Hello Geeks For Geeks"); 
  
            // File Pointer at index position - 0 
            geek.seek(0); 
  
            // read() method : 
            System.out.println("Use of read() method : " + geek.read()); 
  
            geek.seek(0); 
  
            byte[] b = {1, 2, 3}; 
              
            // Use of .read(byte[] b) method : 
            System.out.println("Use of .read(byte[] b) : " + geek.read(b)); 
  
            // readBoolean() method : 
            System.out.println("Use of readBoolean() : " + geek.readBoolean()); 
  
            // readByte() method : 
            System.out.println("Use of readByte() : " + geek.readByte()); 
  
            geek.writeChar('c'); 
            geek.seek(0); 
  
            // readChar() : 
            System.out.println("Use of readChar() : " + geek.readChar()); 
  
            geek.seek(0); 
            geek.writeDouble(d); 
            geek.seek(0); 
  
            // read double 
            System.out.println("Use of readDouble() : " + geek.readDouble()); 
  
            geek.seek(0); 
            geek.writeFloat(f); 
            geek.seek(0); 
  
            // readFloat() : 
            System.out.println("Use of readFloat() : " + geek.readFloat()); 
  
            geek.seek(0); 
            // Create array upto geek.length 
            byte[] arr = new byte[(int) geek.length()]; 
            // readFully() : 
            geek.readFully(arr); 
              
            String str1 = new String(arr); 
            System.out.println("Use of readFully() : " + str1); 
  
            geek.seek(0); 
              
            // readFully(byte[] b, int off, int len) : 
            geek.readFully(arr, 0, 8); 
              
            String str2 = new String(arr); 
            System.out.println("Use of readFully(byte[] b, int off, int len) : " + str2); 
        } 
        catch (IOException ex) 
        { 
            System.out.println("Something went Wrong"); 
            ex.printStackTrace(); 
        } 
    } 
} 
class NewClass 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            // Creating a new RandomAccessFile - "GEEK" 
            RandomAccessFile geek = new RandomAccessFile("FILE.txt", "rw"); 
  
            // Writing to file 
            geek.writeUTF("Hello Geeks For Geeks"); 
  
            geek.seek(0); 
  
            // Use of readUTF() : 
            System.out.println("Use of readUTF() : " + geek.readUTF()); 
  
            //Use of seek() : 
            geek.seek(0); 
  
            // Use of readLine() : 
            System.out.println("1 readLine() : " + geek.readLine()); 
            geek.seek(0); 
  
            geek.writeUTF("Hello \nGeeks For Geeks"); 
            geek.seek(0); 
  
            System.out.println("2 readLine() : " + geek.readLine()); 
  
            geek.seek(3); 
            // Use of readUnsignedByte() : 
          System.out.println("Use of readUnsignedByte() :  " + geek.readUnsignedByte()); 
  
            geek.seek(4); 
            // Use of readUnsignedShort() : 
          System.out.println("Use of readUnsignedByte() :  " + geek.readUnsignedShort()); 
  
            // Use of setLength(): 
            geek.setLength(78); 
  
            // Use of length() : 
            System.out.println("Use of setLength() : " + geek.length()); 
  
            geek.seek(2); 
            // Use of skipBytes() : 
            System.out.println("Use of skipBytes() : " + geek.skipBytes(3)); 
  
  
            // Use of getFilePointer() : 
            System.out.println("Use of getFilePointer() : " + geek.getFilePointer()); 
  
            // Use of getChannel() : 
            System.out.println("Use of getChannel() : " + geek.getChannel()); 
  
            // Use of getFD() : 
            System.out.println("Use of getFD() : " + geek.getFD()); 
  
            // Use of close() method : 
            geek.close(); 
            System.out.println("Stream Closed."); 
  
        } 
        catch (IOException ex) 
        { 
            System.out.println("Something went Wrong"); 
            ex.printStackTrace(); 
        } 
    } 
} 
class NewClass1 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            long l = 458754545576l; 
            double d = 1.5; 
            float f = 14.56f; 
            int i = 1; 
            boolean bol = true; 
            short s = 15;  
   
            // Creating a new RandomAccessFile - "GEEK" 
            RandomAccessFile geek = new RandomAccessFile("GEEK.txt", "rw"); 
   
            // writeUTF() :  
            geek.writeUTF("Hello Geeks For Geeks"); 
              
            geek.seek(0); 
            System.out.println("writeUTF : " + geek.readUTF());  
            geek.seek(0); 
   
            byte[] b = {1, 2, 3, 6, 5, 4}; 
              
            // write(byte[] b) :  
            geek.write(b); 
              
            geek.seek(0); 
            System.out.println("Use of .read(byte[] b) : " + geek.read(b)); 
              
            // write(int i) :   
            geek.write(i); 
            
            geek.seek(0); 
            System.out.println("write(int i) : " + geek.read(b)); 
              
            // writeBoolean() :  
            geek.writeBoolean(bol);             
              
            geek.seek(0); 
            System.out.println("writeBoolean() : " + geek.readBoolean()); 
   
            geek.write(b, 2, 2); 
            geek.seek(0); 
      System.out.println("write(byte[] b, int offset, int len) : " + geek.readByte()); 
   
            // writeChar() :  
            geek.writeChar('c'); 
              
            geek.seek(0); 
            System.out.println("writeChar() : " + geek.readChar());  
            geek.seek(0); 
              
            // writeDouble() :  
            geek.writeDouble(d); 
              
            geek.seek(0);             
            System.out.println("writeDouble() : " + geek.readDouble());  
            geek.seek(0); 
              
            //writeFloat() :  
            geek.writeFloat(f); 
              
            geek.seek(0); 
            System.out.println("writeFloat() : " + geek.readFloat());  
              
            // writeLong() : 
            geek.writeLong(l); 
              
            geek.seek(0); 
            System.out.println("writeLong() : " + geek.readLong());  
              
            // writeShort() : 
            geek.writeShort(s); 
              
            geek.seek(0); 
            System.out.println("writeShort() : " + geek.readShort());   
                     
        } 
        catch (IOException ex) 
        { 
            System.out.println("Something went Wrong"); 
            ex.printStackTrace(); 
        } 
    } 
} 
