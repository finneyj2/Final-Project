import java.util.Scanner;

public class UserRedirection
{ //opening class bracket

  Scanner scan = new Scanner(System.in);

  public static void main(String[] args)
  { //first method bracket

    Scanner scan = new Scanner(System.in);
    System.out.println("Are you an employee or a user? If employee, enter 1. If a user, enter 2.");
    int response = scan.nextInt();

  /*  if(response == 1)
    { //if opening bracket
      EmployeeLogin Employee = new EmployeeLogin();
      Employee.EmployeeInfo();

    } //closing if bracket
*/
  } //closing first method bracket
} //ending class bracket
