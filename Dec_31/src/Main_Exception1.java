import java.io.IOException;

class InvalidAmountException extends Exception
{
	public InvalidAmountException()
	{
		
	}
	public InvalidAmountException(String message)
	{
		super(message);
	}
}

class Bank
{
	public void withdraw(int amount) throws IOException, InvalidAmountException 
	{
		if(amount<=30000)
		{
			System.out.println("Remember to collect the cash");
		}else
		{
//			throw new ArithmeticException("Amount is > 30k");
			//ArithmeticException is an unchecked exception
//			IOException ioe = new IOException("check amount");
//			throw ioe;
			throw new InvalidAmountException("Check the amount it is above 30k");
		}
	}
}

public class Main_Exception1 {

	public static void main(String[] args)  {
		double result=5;
		double d=result/0;
		
		
		System.out.println(Double.isInfinite(d));
		Bank sbi=new Bank();
		try {
			sbi.withdraw(35000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		
		
		try
		{
			System.out.println("This is try block");
		}
		finally
		{
			System.out.println("This is finally");
		}
	}

}
