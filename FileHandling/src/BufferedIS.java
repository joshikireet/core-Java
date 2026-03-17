import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 
 * @author {Kireet Joshi}
 * BufferedInputStream
 */
public class BufferedIS {

	public static void main(String[] args)throws Exception {
		FileInputStream fi= new FileInputStream("abc.txt");
		BufferedInputStream bi= new BufferedInputStream(fi);
		int i= bi.read();
		while(i!=-1)
		{
			
			System.out.print((char)i);
			i=bi.read();
		}
		bi.close();
		
			
	}
}
