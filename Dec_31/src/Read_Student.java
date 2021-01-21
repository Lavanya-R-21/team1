import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read_Student {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\work\\java\\notes\\lava.dat"));
		Student student=(Student) ois.readObject();
		System.out.println(student);
		File f = null;
		
		
	}

}
