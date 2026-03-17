import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 
 * @author {Kireet Joshi}
 * using BufferedOutputStream
 */
import java.io.*;
public class BufferedOS {
	public static void main(String[] args) throws Exception{

		FileOutputStream fo= new FileOutputStream("abc.txt",true);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		String s= " programming";
		byte[] b= s.getBytes();
		bo.write(b);
		bo.close();
	}
}
