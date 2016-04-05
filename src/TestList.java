
// ************************************************************************************************************************************
// Lab 3			Authors: Zhipeng Mei, Vince Garcia
// Class: CS 111C		Date:	 4/6/16
// The TestList class is the driver program.
// The user's choice, determined by input assumed to be either 1, 2, or 3, is handled via two different methods. input of 3 immediately exits the program
//  Method menu() displays the user's options all in one.  It is called at the beginning of each loop so that the program is continous until the boolean flag is triggered
//  Lists are instantited and created through the constructors of the ListReferenceBased class.  The content of the lists are added through calls to that class'es methods.
//  A StringTokenizer is used to handle user input and insert them into the list.  Input is read as strings and then parsed to Ints.  They're then added to lists
//  Method replacement() prompts the user to create a list and takes in two int arguements which are passed to the replace() method within ListReferenceBased
//  Method compare() prompts the user to create two lists.  A boolean named logic calls the equals() method which returns true or false based on list equality
// ***********************************************************************************************************************************
import List.Node;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestList
{
// -----------------------------------------------------------------------
// Precondition:  List exists
// Postcondition: Returns corresponding method  operations
//------------------------------------------------------------------------
   static Scanner in = new Scanner(System.in);  //Scanner for keyboard input
   public static void main(String args[]) {

       boolean done = false;
        while(!done) {

            menu(); //display the main menu
            int choice = in.nextInt(); //get the user's keyboard Integer input

            if(choice == 1){
                replacement();
            }
            if(choice == 2){
                compare();
            }
            if(choice == 3){
                done = true;
            }

            System.out.println("");
        }//end while

    }// end main

    // Main menu display for the program
    public static void menu(){
        System.out.println("What you want to do?");
        System.out.println("1)Replace a value in a list of integers");
        System.out.println("2)Compare two lists of integers");
        System.out.println("3)Quit");
        System.out.print("Enter your choice: ");
    }//end menu()

   //replace value(s) in a list
    public static void replacement(){
// -----------------------------------------------------------------------
// Precondition:  Input of 1 was entered by the user
// Postcondition:Prints the number of items replaced
//------------------------------------------------------------------------
        List.ListReferenceBased aList = new List.ListReferenceBased();

        System.out.print("Enter a list of integers: "); //prompt for user input

        in.nextLine();                      //clear the newline
        String userInput = in.nextLine();   //user input

        //use tokenizer to break down a string into pieces of ints
        StringTokenizer sx = new StringTokenizer(userInput);
        int sxSize = sx.countTokens();  //get the size of tokens

        //store tokens into aList
        while (sx.hasMoreTokens()) {
               for(int i=0; i < sxSize; i++){
                   int newInput = Integer.parseInt(sx.nextToken());
                   aList.add(i, newInput);
                }
        }// end while

        System.out.print("Enter a value to be modified: ");
        int mod = in.nextInt();

        System.out.print("Enter replacement value: ");
        int replacer = in.nextInt();

        //replace method call, get return value "count"
        int count = aList.replace(mod, replacer);

        //print out the new list to console
        System.out.print("Modified list: ");
        for(int i=0; i< aList.size(); i++){
            System.out.print(aList.get(i) + " ");
        }

        //print out the Number of items replaced
        System.out.println("\nNumber of items replaced: " + count + " " );
    }


    //compare two lists
    public static void compare() {
// -----------------------------------------------------------------------
// Precondition:   Input of 2 was entered by the user
// Postcondition: Prints whether or not the two lists are equal
//------------------------------------------------------------------------
        //create two empty lists
        List.ListReferenceBased bList = new List.ListReferenceBased();
        List.ListReferenceBased cList = new List.ListReferenceBased();

        System.out.print("Enter first list to be compared: ");
        in.nextLine();
        String userInput = in.nextLine();

        //store data into first list
        StringTokenizer sts = new StringTokenizer(userInput);
        int stsSize = sts.countTokens();
        while (sts.hasMoreTokens()) {
            for(int i=0; i<stsSize; i++){
                int newInput = Integer.parseInt(sts.nextToken());
                bList.add(i, newInput);
            }
        }//end while

        System.out.print("Enter second list to be compared: ");
        String userNewInput = in.nextLine();

        //store data into second list
        StringTokenizer something = new StringTokenizer(userNewInput);
        int somethingSize = something.countTokens();
        while (something.hasMoreTokens()) {
            for(int i=0; i<somethingSize; i++){
                int newwInput = Integer.parseInt(something.nextToken());
                cList.add(i, newwInput);
            }
        }//end while

        //equals method call, get return boolean
        boolean logic = bList.equals(cList);
        if(logic == true){
            System.out.println("The two lists are equal");
        } else {
            System.out.println("The two lists are not equal");
        }
    }//end compare()

} // end class



/******* Sample output *********
What you want to do?
1) Replace a value in a list of integers
2) Compare two lists of integers
3) Quit
Enter your choice: 1
Enter a list of integers:  10  14  10  13  25  10
Enter a value to be modified:  10
Enter replacement value:  2
Modified list:  2  14  2  13  25  2
Number of items replaced:  3

What you want to do?
1) Replace a value in a list of integers
2) Compare two lists of integers
3) Quit
Enter your choice: 1
Enter a list of integers:  10  14  10  13  25  10
Enter a value to be modified:  9
Enter replacement value:  2
Modified list:  10  14  10  13  25  10
Number of items replaced:  0

What you want to do?
1) Replace a value in a list of integers
2) Compare two lists of integers
3) Quit
Enter your choice: 2
Enter first list to be compared:  10  14  10  13  25  10
Enter second list to be compared:  10  14  10  13  25  10
The two lists are equal.

What you want to do?
1) Replace a value in a list of integers
2) Compare two lists of integers
3) Quit
Enter your choice: 2
Enter first list to be compared:  10  14  10  13  25  10
Enter second list to be compared:  10  14  10  13  25
The two lists are not equal.

What you want to do?
1) Replace a value in a list of integers
2) Compare two lists of integers
3) Quit
Enter your choice: 2
Enter first list to be compared:  10  14  10  13  25  10
Enter second list to be compared:  10  14  10  11  25  10
The two lists are not equal.

What you want to do?
1) Replace a value in a list of integers
2) Compare two lists of integers
3) Quit
Enter your choice: 3

********************/
