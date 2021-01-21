import java.io.File;
import java.util.Date;

public class Main_File {

	public static void main(String[] args) {
		File f=new File("D:\\jag\\MPhasis\\java\\dhruva.txt");
//		String[] arr = f.list();
//		for(String x:arr)
//			System.out.println(x);
		
//		File[] farr = f.listFiles();
//		for(File x:farr)
//		{
//			if(x.isDirectory())
//				System.out.println(x.getName());
//		}
		
//		System.out.println(f.exists());
//		if(f.exists())
//		{
//			System.out.println("This folder exists");
//		}else
//		{
//			System.out.println("THis folder is being created now...");
//			f.mkdir();
//		}
		
		long l=f.lastModified();
		Date dt=new Date();
		dt.setTime(l);
		System.out.println(dt);
		
	}

}
