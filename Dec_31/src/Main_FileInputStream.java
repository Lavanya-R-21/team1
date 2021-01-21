import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main_FileInputStream {

	public static void main(String[] args) throws IOException {
		//read the bytes from the file
		//which class allows reading bytes from a File
		File f=new File("C:\\Users\\rjaga\\Pictures\\pixar-cars.jpg");		//loaded in memory as an object
		System.out.println(f.length());
		int len=(int) f.length();
		FileInputStream fis=new FileInputStream("C:\\Users\\rjaga\\Pictures\\pixar-cars.jpg");
		byte []b=new byte[len];
		fis.read(b);			//reads all bytes from the file and store in the array		
		fis.close();
		
		//write these bytes into a new file. New file will be created automatically by the FileOutputStream
		FileOutputStream fos=new FileOutputStream("D:\\jag\\MPhasis\\java\\abhijeet.jpg");
//		"divide by zero exception means"
		int x=5/0;
		
		fos.write(b);
		fos.flush();
		fos.close();			//object representation of file is released from memory
	}

}
