package controller;

import java.util.Scanner;

public class SecondController 
{

	public void start()
	{
		System.out.println("Hi my name is Jake Runyan");
		System.out.println("I am part of a family");
		System.out.println("What am I doing here?");
		
		questions();
		
		moreInput();
	}
	
	
	private void questions()
	{
		System.out.println("What is your favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		System.out.println(answer+ " is a terrible color!");
		
		System.out.println("Try again!");
		answer = inputScanner.nextLine();
		System.out.println("Hey! " +answer+ " is a great color! :)");
		
		System.out.println("What is the best kind of food?");
		answer = inputScanner.nextLine();
		System.out.println(answer+ " is my favorite food too!");
		
		System.out.println("Where do you live?");
		answer = inputScanner.nextLine();
		System.out.println("Processing..\nStoring data..\nNo way! I live there too!! ;)");
		
		System.out.println("Dogs or Cats?");
		answer = inputScanner.nextLine();
		
		if (answer.toLowerCase().equals("dogs") || answer.toLowerCase().equals("dog") ) 
		{
			System.out.println("I love dogs!");
		}
		else if (answer.toLowerCase().equals("cats") || answer.toLowerCase().equals("cat") ) 
		{
			System.out.println("I don't really like cats.");
		}
		else
		{
			System.out.println("Error..\nMoving on..");
		}
//		inputScanner.close();
		//Closed because I am still using the InputStream from the keyboard and don't want any errors.
	}
	
	private void moreInput()
	{
		Scanner textScanner; //This is a declaration of a Scanner variable.
		
		textScanner = new Scanner(System.in); //Initialization of the textScanner variable.
		System.out.println("Type in your favorite number.");
		int userNumber = textScanner.nextInt();
		System.out.println("Your favorite number is: " +userNumber);
		textScanner.nextLine(); //This eats the enter key so it doesn't mess up the next input.
		
		System.out.println("What is your second favorite number?");
		userNumber = textScanner.nextInt();
		System.out.println(userNumber);
		
		System.out.println("What is Pi?");
		Double answer = textScanner.nextDouble();
		System.out.println(answer);
		
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
			System.out.println("You need to type in a number mammal!");
		}
		
		return isValid;
	}
	public boolean validDouble(String example)
	{
		boolean isValid =false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException oops)
		{
			System.out.println("Only floating point values are accepted. AKA- a number with a decimal in it.");
		}
		return true;
	}
}
