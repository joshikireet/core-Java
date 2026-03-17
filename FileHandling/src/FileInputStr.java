/**
 * 
 * @author {Kireet Joshi}
 * Bytestream--> FileInputStream(reading from a file)
 */
import java.io.*;
public class FileInputStr 
{
public static void main(String[] args)throws IOException {
	FileInputStream fi= new FileInputStream("abc.txt");
	int i= fi.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=fi.read();
	}
	fi.close();
	}
}
