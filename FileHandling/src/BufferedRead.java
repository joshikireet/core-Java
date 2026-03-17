import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author {Kireet Joshi}
 * Character Stream-> BufferedReader(Reading from a file)
 */
import java.io.*;
public class BufferedRead {
	public static void main(String[] args)throws IOException {
		FileReader fr= new FileReader("file.txt");
		BufferedReader br= new BufferedReader(fr); 
		String s=br.readLine();
		while(s!=null)
		{
 		System.out.println(s);
  	    s=br.readLine();
		 }
		br.close();
	}

}
