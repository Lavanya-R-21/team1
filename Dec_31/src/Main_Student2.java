import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main_Student2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\jag\\MPhasis\\java\\abc\\student.dat"));
		Student student=(Student) ois.readObject();
		System.out.println(student);
		
	}

}
