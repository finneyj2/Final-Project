//this work is the result of my own efforts unless otherwise cited. I consulted TAs and a tutor for assistance with this project
public class DisplayTransaction extends Transaction
{ //opening class bracket

  public void execute(String accountID)
  { //method brackets


  accounts.reset();
  for(int i = 0; i < accounts.size() ;i++ )
  { //for loop brackets
    String[] line = accounts.read().split(";");

    if(accountID.equals(line[0]))
    { //if statement
      System.out.println("Your balance is $" + line[1]);
      //prints out the balance
    }



   } //for loop ending brackets

 } //method ending brackets


} //ending class bracket
