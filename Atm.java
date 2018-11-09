//this work is the result of my own efforts unless otherwise cited. I consulted TAs and a tutor for assistance with this project
public class Atm
{

 public static String accountID; //creates static String

    public static void main(String[] args) //creates main method
    { 
      Login atm = new Login(); //creates new object from login
      atm.displayMenu(); //calls specific method
      TransactionMenu menu = new TransactionMenu(); //creates a new object from TransactionMenu
      menu.displayMenu(); //calls a specific method

    }





}
