import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WriteObject_Demo {

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		Scanner sc=new Scanner(System.in);
		int employeeId=sc.nextInt();
		String firstName=sc.nextLine();
		if(firstName.equals(""))
			firstName=sc.nextLine();
		String lastName=sc.nextLine();
		String dateStr=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date dateOfJoining= sdf.parse(dateStr);
		int salary=sc.nextInt();
		
		Employee employee=new Employee(employeeId, firstName, lastName, dateOfJoining, salary);
		
		//to store employee object into a file
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\jag\\MPhasis\\java\\abc\\pavithra.dat"));
		oos.writeObject(employee);
		oos.flush();
		oos.close();
		
		System.out.println("Done");
	}

}
