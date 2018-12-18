
#Project:
Atm machine

##Getting Started
#Prerequisites:
java
Some kind of textfile document, preferably
word.The accounts for the program are kept in
Customer.txt(username and password), and
accounts(account number and balance). To login
to the atm machine, first both text files need
to have text.  For Customer.txt, and remember
to separate by semicolon, [0] = Customer name,
[1] = userID/username, [2] = accountID, [3] =
password, [4] = snn.
#Running & Testing The Program:
To run the program, open your terminal in the
src folder of the Atm repository. Compile the
program with javac Atm.java(this is where the
main method is located), then run it with java
Atm. This will bring you to the preliminary
menu that asks whether or not you have an
account. If yes is picked, then the user has
the option to login using their username and
password(located in Customer.txt). If no is
picked, the user will be redirected to
Login.java, and then be asked to create their
username, password, ssn, account number and
some other metric. The account number must
already be present in accounts.txt, or the user
won't be able to proceed.
