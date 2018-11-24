import java.io.InputStream;
import java.util.Scanner;
public class Sample1 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int x= Integer.parseInt(scanner.nextLine());
		
		if(x%2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
	

}
