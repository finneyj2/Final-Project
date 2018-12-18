//this work is the result of my own efforts unless otherwise cited. I consulted TAs and a tutor for assistance with this project
import java.util.Scanner; //imports scanner
public class WithdrawTransaction extends Transaction  //extends Transaction/inherits
{
      public void execute(String accountID)
      {
        Scanner scan = new Scanner(System.in); //makes scanner
        double take; //initializes take as a double
        System.out.println("How much would you like to withdraw?");
        take = scan.nextDouble(); //stores user input in take


        accounts.reset();
        for(int i = 0; i < accounts.size() ;i++ )
        { //for loop brackets
          String[] line = accounts.read().split(";");
          //string array
          if(accountID.equals(line[0]))
          {//if statements
            double current = Double.parseDouble(line[1]);
            take = current - take; //
            if(take < 0) //if statement for condition
            { //if statement for if they overdraw
              System.out.println("You've overdrawn your bank account.");
              System.out.println("Your current balance(overdrawn) is now" + take);
            }

            else { //else statement for if they don't overdraw
              System.out.println("Your balance is $" + take); //prints the balance
              accounts.update(i, accountID + ";" + take);
            }

          }
          }


      }


      }
