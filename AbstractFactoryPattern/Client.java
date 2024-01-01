package AbstractFactoryPattern;

import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter which type you want( 1- Formal or 2-Casual):  ");
		int choice = input.nextInt();

		if(choice ==1)
		{
			FormalDressFactory formalDressFactory = new FormalDressFactory();
			formalDressFactory.getShirt().give();
			formalDressFactory.getPant().give();
		}
		else if(choice ==2)
		{
			CasualDressFactory casualDressFactory = new CasualDressFactory();
			casualDressFactory.getShirt().give();
			casualDressFactory.getPant().give();
		}

		System.out.println("\n \n <------ Thank You For Shopping 😊 --------> \n ");
	}
}
