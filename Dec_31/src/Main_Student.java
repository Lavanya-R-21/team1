import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_Student {

	public static void main(String[] args) throws ParseException, IOException {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.nextLine();
		if(name.equals(""))
			name=sc.nextLine();
		String datestr=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Date dateOfBirth=sdf.parse(datestr);
		Student student=new Student(id, name, dateOfBirth);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\work\\java\\notes\\lava.dat"));
		oos.writeObject(student);
		oos.flush();
		oos.close();
	}

}
