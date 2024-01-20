
# Change Counter
## Overview
This project involves creating a program to manage and display information about monetary values. The main components of the project include classes representing different denominations of money (e.g., bills, coins), a graphical user interface (myGUI) for user interaction, and handlers (ButtonClickListener and PrintClickListener) to process input and output.

# Files
1. Bill.java

- Represents a bill with a specified dollar amount.
Extends the Money class.

2. ButtonClickListener.java

- Handles button click events in the GUI.
- Processes user input and interacts with other classes (SaveMoney, SaveDate, ReadDate, ReadMoney).

3. Coin.java

- Represents a coin with a specified value.
- Extends the Money class.

4. Dime.java

- Represents a dime coin.
- Extends the Coin class.

5. Main.java

- Main class to start the program by initiating the GUI (myGUI).

6. Money.java

- Represents a generic monetary value.
- Implements Serializable for object serialization.

7. myGUI.java

- GUI class with functionalities for user input and output.
- Utilizes ButtonClickListener and PrintClickListener.

8. Nickel.java

- Represents a nickel coin.
- Extends the Coin class.

9. PrintClickListener.java

- Handles the "Save to ledger.txt" button click event.
- Initiates the PrintLedger class to save the content of a TextArea to a file.

10. PrintLedger.java

- Saves the content of a TextArea to a file named "ledger.txt".

11. Quarter.java

- Represents a quarter coin.
- Extends the Coin class.

12. ReadDate.java
- Reads a Date object from the "date.out" file.
- Displays the date in the GUI.

13. ReadMoney.java
- Reads monetary information from the "money.out" file.
- Displays the total amount of money and the quantity of each denomination in the GUI.

14. SaveDate.java
- Saves the current date to the "date.out" file.

15. SaveMoney.java
- Saves monetary information to the "money.out" file.
- Processes user input from the GUI.

#### How to Run
1. Execute the main method in the Main.java class to initiate the GUI.

2. Enter a monetary value in the provided text field and click the "Count change" button.

3. Optionally, click the "Save to ledger.txt" button to save the displayed information to a file.

# Screenshots

![Alt text](/Screenshots/Screenshot1.png?raw=true "Screenshot1")
![Alt text](/Screenshots/Screenshot2.png?raw=true "Screenshot2")
![Alt text](/Screenshots/Screenshot3.png?raw=true "Screenshot3")
![Alt text](/Screenshots/Screenshot4.png?raw=true "Screenshot4")

# Usage
* The GUI allows users to input monetary values and view the corresponding breakdown of bills and coins.

* The program uses ``serialization`` to save and load monetary information and the current date.