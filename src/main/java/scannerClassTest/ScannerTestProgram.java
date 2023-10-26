package scannerClassTest;

import java.util.Scanner;

public class ScannerTestProgram 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=scanner.nextLine();
		System.out.println("Name "+name);

		System.out.println("Enter your age ");
		int age=scanner.nextInt();
		System.out.println("Age "+age);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter designation ");
		String designation=sc.nextLine();
		System.out.println("Designation "+designation);

	}

}
