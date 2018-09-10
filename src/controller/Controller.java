package controller;

import java.util.Scanner;
//^Imports rules to use the scanner, folders are separated by dots

public class Controller
{

	public void start()
	{
		System.out.println("Ay Yo,");
		
		//questions();
		
		moreInput();
	}
	
	private void questions()
	{
		System.out.println("What is the meaning of existance?");
		Scanner inputScanner = new Scanner(System.in);
		//^^Scanner constructor, constructor is the same name as class 
		//^^System.in is the keyboard 
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("What is your name?");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		//inputScanner.close();
		//Closed because I am still using the InputStream and don't want errors
	}
	
	//after you use .next, .nextInt, you have to eat the enter press textScanner.nextLine(); 
	
	//visibility, return type, method name, arguments, definition.
	private void moreInput()
	{
		Scanner textScanner;//declaration: declaring a variable ; class/type variable name
		textScanner = new Scanner(System.in);//initialization: assigning the variable as an object.
		
		System.out.println("How old is you?");
		int userNumber = textScanner.nextInt();
		System.out.println("Your favorite number is: " + userNumber);
		
		
		System.out.println("Type in a decimal number");
		double userDouble = textScanner.nextDouble();
		System.out.println(userDouble + " " + "+" + " " + userNumber + " = " + userDouble + userNumber);

		System.out.println("Just kidding, what's your social security number?");
		String userColor = textScanner.next();
		System.out.println(userColor);
		
		textScanner.nextLine();
		
		
		textScanner.close();
	}
	
	public boolean validInt(String sample)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(sample);
			isValid = true;
		}
		catch(NumberFormatException error)
	
		{
			System.out.println("YOu need to type in a number!);
		}
		
		
		return isValid;
	}
}
