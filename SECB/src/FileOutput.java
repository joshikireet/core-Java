// CharacterStream--> BufferedReader(Read)
import java.io.*;
public class FileOutput {
	public static void main(String[] args) throws IOException
	{
FileWriter fw = new FileWriter("xyz.txt",true);
BufferedWriter br = new BufferedWriter(fw);
br.write("######");
br.newLine();
fw.write(System.lineSeparator());
br.write("abchghgfhdgf");
br.flush();
br.close();
}
  
}

