import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main_Zip {

	public static void main(String[] args) throws IOException {
		ZipOutputStream zos=new ZipOutputStream(new FileOutputStream("D:\\jag\\MPhasis\\java\\abc\\something.zip"));
		zos.putNextEntry(new ZipEntry("balasa.jpg"));
		
		//-----------------------------------------------------------
		byte[] data = getBytesFromFile("D:\\jag\\MPhasis\\java\\abc\\balasa.jpg");
		//------------------------------------------------------------
		
		zos.write(data);
		
		zos.putNextEntry(new ZipEntry("pavithra.dat"));
		data=getBytesFromFile("D:\\jag\\MPhasis\\java\\abc\\pavithra.dat");
		zos.write(data);
		
		zos.putNextEntry(new ZipEntry("student.dat"));
		data=getBytesFromFile("D:\\jag\\MPhasis\\java\\abc\\student.dat");
		zos.write(data);
		
	
		zos.flush();
		zos.close();
		System.out.println("Check");
	}

	private static byte[] getBytesFromFile(String fileName) throws FileNotFoundException, IOException {
		File f=new File(fileName);
		FileInputStream fis=new FileInputStream(f);
		int len=(int) f.length();
		byte data[]=new byte[len];
		fis.read(data);
		return data;
	}

}
