import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_input {

	public static void main(String[] args) throws IOException {
		//before jdk 1.5 there was no Scanner class
//		BufferedReader
//		BufferedInputStream
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str);
		
		BufferedInputStream bis=new BufferedInputStream(System.in);
//		bis.read(b)
		int i=bis.read();
		System.out.println(i);
	}

}
