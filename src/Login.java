//this work is the result of my own efforts unless otherwise cited. I consulted TAs and a tutor for assistance with this project
import java.util.Scanner; //imports scanner

public class Login implements Menu { //implements Menu


	public void displayMenu()
	{

		FileUtility everything = new FileUtility("customers.txt");
		Scanner scan = new Scanner(System.in);
		String answer; //initializes string answer
		String username; //userID goes into customers
		String password; //initializes string password
		boolean validPass = false;
		boolean validUser = false;


		System.out.print("Do you already have an account? Please type yes or no.");
		answer = scan.nextLine(); //stores user input into answer
		String[] info = new String[]{"", "", ""}; //creates string array and string literal
		if (answer.equals("yes")) //if statement for when answer = yes
	{

			System.out.println("It's time to log in! What's your userID?");
			username = scan.nextLine(); //stores user input into username
			System.out.println("What's your password?");
			password = scan.nextLine(); //stores user input into password
			everything.reset(); //resets

			for(int i = 0; i < everything.size() ;i++ )
			{ //for loop brackets
			 	String[] line = everything.read().split(";");
				 if(line[1].equals(username)) //if condition for if username is equal to password
				 {//outer if
					 validUser = true; //sets value to true if username is correct

						if(line[3].equals(password)) //this tests if the password is correct
						{//inner if

					 		validPass = true; //sets value to true if password is true
							info = line; //sets info equal to line
						}//closing brackets inner if
						break; //breaks out of loop
					} //closing brackets outer if




			 } //for loop ending brackets


			 if(validPass && validUser)
			 { //only logs in if both password and username are correct
				System.out.println("You logged in!");
				Atm.accountID = info[2];

			 }




			else if(validUser == false) //condition for if validUser remains false
			 { //first else if curly brackets
				 System.out.println("Wrong username.");
				 //put play again option here, and if they're wrong a second time, exit program
				 //program doesn't immediately exit if the username is wrong
				 System.exit(0); //exits program
			 }

				 else if (validPass == false) //condition for if validPass remains false
				 { //second else if curly brackets
					 System.out.println("Wrong password.");
					 //put play again option here, and if they're wrong a second time, exit program
					 System.exit(0); //exits program
				 }

	 } //first if ending brackets



		else
		{ //else bracket
			Customer original = new Customer(); //creates an object from Customer
			original.createU(); //calls method createU

		} //else bracket
}




}
