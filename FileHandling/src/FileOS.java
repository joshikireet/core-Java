/**
 * 
 * @author {Kireet Joshi}
 * Bytestream--> FileOutputStream(writing to a file)
 */
import java.io.*;
public class FileOS {
public static void main(String[] args)throws IOException {
	FileOutputStream fo= new FileOutputStream("abc.txt");
    String s= "hello java";  
	byte b[]=s.getBytes();
	fo.write(b);
	fo.close();
	System.out.println("data written to a file");
	
}
}
