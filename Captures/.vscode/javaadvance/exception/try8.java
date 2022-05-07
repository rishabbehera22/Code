
import java.io.*;
public class try8
{
	public static void main(String[] args)
	{
		try {
			System.out.println("inside try block");
			
			
			System.out.println(34 / 2);
		}
		catch (ArithmeticException e) {
			
			System.out.println("Arithmetic Exception");
			
		}
		
		finally {
			
			System.out.println("finally : i execute always.");
			
		}
	}
}
