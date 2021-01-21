import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main_FileReaderWriter {

	public static void main(String[] args) throws IOException {
		// write character data into a file
		FileWriter fw=new FileWriter("D:\\jag\\MPhasis\\java\\dhruva.txt", false);
		
		fw.write("ABCDEFGH");
		fw.flush();
		fw.close();
	}

}
