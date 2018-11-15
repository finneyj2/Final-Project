public abstract class Transaction //creates abstract class Transaction
{
FileUtility accounts = new FileUtility("accounts.txt");
//creates FileUtility accounts


  public abstract void execute(String accountID);
 //creates abstract method with string arguments
}
