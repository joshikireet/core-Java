/**
 * 
 * @author {Kireet Joshi}
 * character stream--> bufferedWriter ( write to a file)
 */
import java.io.*;
public class BuffWrite {
public static void main(String[] args)throws IOException {
	FileWriter fw= new FileWriter("file.txt",true);
	BufferedWriter bf= new BufferedWriter(fw);
	bf.newLine();
	bf.write("hello");
	bf.newLine(); // for newline
	bf.write("world");
	bf.close();
	
}
}
