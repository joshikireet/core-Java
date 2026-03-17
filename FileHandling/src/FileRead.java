/**
 * 
 * @author {Kireet Joshi}
 *  Character Stream->Reading a file using FileReader
 */
import java.io.*;
public class FileRead {
public static void main(String[] args)throws IOException
{
FileReader fr= new FileReader("file.txt");
//BufferedReader br= new BufferedReader(fr); 
//String s=br.readLine();
//while(s!=null)
//{
//	System.out.println(s);
//    s=br.readLine();
// }
//br.close();
int i=fr.read();
while(i!=-1)
{
	System.out.print((char)i);
	i=fr.read();
}
}
}
