import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author {Kireet Joshi}
 * Character Stream->concept to write to a file using FileWriter
 */
import java.io.*;
public class FileW 
{
	public static void main(String[] args)throws IOException
	{
		FileWriter fw= null;
		
			fw= new FileWriter("file.txt");
			fw.write("welcome");
			fw.write("\n");
		//	fw.write(System.lineSeparator());
			fw.write("java File handling");
		    fw.close();
		
	}}
