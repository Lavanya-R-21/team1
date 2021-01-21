import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main_Task {

	public static void main(String[] args) throws IOException {
//		D:\Jag\amit
		ZipOutputStream zos=new ZipOutputStream(new FileOutputStream("D:\\Jag\\amit\\amit.zip"));
		File file=new File("D:\\Jag\\HCL\\TSS");
		zipFolder(zos, file);
		zos.flush();
		zos.close();
	}

	private static void zipFolder(ZipOutputStream zos, File file) throws IOException, FileNotFoundException {
		File[] files = file.listFiles();
		for(File f : files)
		{
			//check if f is a folder
			if(f.isDirectory())
			{
				if(f.list().length==0)
					return;
				zipFolder(zos, f);
			}
			if(f.getName().equals("amit.zip"))
				continue;
//			System.out.println(f.getName());
			if(f.isDirectory())
			{
				zos.putNextEntry(new ZipEntry(f.getName()+"/"));
				continue;
			}
			if(f.getParent().equals("TSS"))
				zos.putNextEntry(new ZipEntry(f.getParent()+"/"+ f.getName()));
			else
				zos.putNextEntry(new ZipEntry(f.getName()));
			int len=(int) f.length();
			byte data[]=new byte[len];
			FileInputStream fis=new FileInputStream(f);
			fis.read(data);
			
			zos.write(data);
		}
	}

}
