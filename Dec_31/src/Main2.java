import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main2 {

	public static void main(String[] args) throws IOException {
		ZipOutputStream zos=new ZipOutputStream(new FileOutputStream("D:\\jag\\MPhasis\\java\\abc\\abc.zip"));
		zos.putNextEntry(new ZipEntry("balasa.jpg"));
		File f=new File("C:\\Users\\rjaga\\Pictures\\pixar-cars.jpg");		//loaded in memory as an object
		System.out.println(f.length());
		int len=(int) f.length();
		FileInputStream fis=new FileInputStream("C:\\Users\\rjaga\\Pictures\\pixar-cars.jpg");
		byte []b=new byte[len];
		fis.read(b);			//reads all bytes from the file and store in the array		
		//fis.close();
		//zos.close();
		zos.write(b);
		zos.putNextEntry(new ZipEntry("balasa1.jpg"));
		zos.write(b);
		
		zos.flush();
		zos.close();
	}

}
