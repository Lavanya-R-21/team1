import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_Streams1 {

	public static void main(String[] args) throws FileNotFoundException {
//		File f1=new File("D:\\jag\\MPhasis\\java\\dhruva.txt");
		FileInputStream fis=new FileInputStream("D:\\jag\\MPhasis\\java\\dhruva.txt");
		Scanner sc=new Scanner(fis);
		int i=sc.nextInt();
		float f=sc.nextFloat();
		System.out.println(i);
		System.out.println(f);
	}

}
