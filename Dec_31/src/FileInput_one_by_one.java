import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput_one_by_one {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("C:\\Users\\rjaga\\Pictures\\pixar-cars.jpg");
		FileInputStream fis=new FileInputStream(f);
		int d=-1;
		FileOutputStream fos=new FileOutputStream("D:\\jag\\MPhasis\\java\\abc\\balasa.jpg");
		//while((d=fis.read())!=-1)
		d=fis.read();
		while(d!=-1)
		{
			//write this byte (d) into a file
			fos.write(d);
			d=fis.read();
//			Thread.sleep(500);
		};
		fos.flush();
	}

}
