//this work is the result of my own efforts unless otherwise cited. I consulted TAs and a tutor for assistance with this project
import java.util.Scanner; //imports scanner

public class TransactionMenu implements Menu { //implements interface


  public void displayMenu(){ //method for displayMenu

    Scanner scan = new Scanner(System.in); //creates Scanner

    boolean finished = false; //creates boolean finished and set it to false

    while(finished == false) { //while loop opening brackets
      //while condition for if finished == false

    System.out.println("to Display current balance enter 1");
    System.out.println();
    System.out.println("To deposit, enter 2");
    System.out.println();
    System.out.println("To withdraw, enter 3");
    System.out.println();
    System.out.println("To exit the atm, enter 4");
    System.out.println();
    System.out.print(":)");
    //displays the menu options for the user
    String response = scan.nextLine();
    //stores user input in string response


        switch(response) { //switch brackets
          case "1": DisplayTransaction option = new DisplayTransaction();
                  option.execute(Atm.accountID);
                  //creates object from DisplayTransaction method
                break; //breaks out of case

          case "2": DepositTransaction option2 = new DepositTransaction();
                  option2.execute(Atm.accountID);
                      //creates object from DisplayTransaction method
                break;//breaks out of case

          case "3": WithdrawTransaction option3 = new WithdrawTransaction();
                  option3.execute(Atm.accountID);
                  //creates object from DisplayTransaction method
                break; //breaks out of case

          case "4": finished = true; //sets boolean equal to true
                break;
                //case switch code for the user options


        } //switch brackets
} //while loop closing brackets

}
}
