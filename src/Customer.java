import java.util.Scanner;
public class Customer
{

  public void createU() {
    Scanner scan = new Scanner(System.in); //creates Scanner
    FileUtility accounts = new FileUtility("accounts.txt"); //creates FileUtility
    FileUtility text = new FileUtility("customers.txt");
    String answer; //initializes String answer
    String password; //initializes String password
    String ssn; //initializes string ssn
    String accountID; //if acountId doesn't match, exit the program. Inform user that they're a liar
    String userID; //initializes userID
    boolean honesty = false;

    System.out.println("Whata is your name?");
    answer = scan.nextLine(); //stores user input for name
    System.out.println("Create your own ID");
		userID = scan.nextLine(); //stores user input for userID
    System.out.println("Create your accountID");
    accountID = scan.nextLine(); //stores user input for accountID
    System.out.println("Create your password?");
    password = scan.nextLine(); //stores user input for password
    System.out.println("What is your SSN?");
    ssn = scan.nextLine(); //stores user input for ssn
    Atm.accountID = accountID; //sets accountID equal to atm.accountID

    accounts.reset();
    for(int i = 0; i < accounts.size() ;i++ )
    { //for loop brackets
      String[] line = accounts.read().split(";");

      if(accountID.equals(line[0]))
      {
        honesty = true;
      }

     } //for loop ending brackets


    if(honesty == false) //conditional statement for if inputted accountID doesn't match an existing one
    {
      System.out.println( "You're a liar. Your account ID doesn't exist!");
      System.exit(0);
    }

    else //conditional else statement for if inputted accountID does match an existing ID
    {
      text.write(answer + ";" + userID + ";" + accountID + ";" + password + ";" + ssn + ";");
    }

  } //answer[0], userID[1], accountID[2], password[3], ssn[4]




}
