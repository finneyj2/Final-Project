//this work is the result of my own efforts unless otherwise cited. I consulted TAs and a tutor for assistance with this project
import java.util.Scanner; //imports scanner

public class DepositTransaction extends Transaction //extends Transaction
{ //class opening brackets


      public void execute(String accountID) //calls the execute method
      { Scanner scan = new Scanner(System.in); //declares scanner
        double add; //initializes add
        System.out.println("How much would you like to add?"); //printline for deposit
        add = scan.nextDouble(); //scans user input for deposit amount



          accounts.reset();
          for(int i = 0; i < accounts.size() ;i++ ) //for loop
          { //for loop brackets
            String[] line = accounts.read().split(";");
            //makes a string array
            //sets it equal to accounts.read

            if(accountID.equals(line[0]))
            {
              double current = Double.parseDouble(line[1]); //sets current equal to double.parseDouble
              add += current; //adds the variable add to current.
              System.out.println("Your balance is $" + add); //prints the balance to the user
              accounts.update(i, accountID + ";" + add); //changes the account balance


            }



           } //for loop ending brackets

      } //class closing brackets



}
