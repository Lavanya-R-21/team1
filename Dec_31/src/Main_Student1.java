import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_Student1 {

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		//store student object in a file
		//D:\jag\MPhasis\java\abc\student.dat
		
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.nextLine();
		if(name.equals(""))
			name=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		String dateStr=sc.nextLine();
		Date dateOfBirth=sdf.parse(dateStr);
		Student student=new Student(id, name, dateOfBirth);
		
		//to write object into a file
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\jag\\MPhasis\\java\\abc\\student.dat"));
		oos.writeObject(student);
		oos.flush();
		oos.close();
	}

}
