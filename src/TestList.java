// ************************************************************************************************************
// Lab 2			Authors: Zhipeng Mei, Vince Garcia
// Class: CS 111C		Date:	 4/6/16
// The TestList class is the driver program.  It does not call any ListInterface methods.
// The user's choice, determined by input assumed to be either 1, 2, or 3, is handled via two different methods.
//  Input of 3 will immediately exit the program
//  A StringTokenizer is used to handle user input and insert them into the list
//  The equals and replace  methods within ListReferenceBased are called and handle the appropriate operations 
// ************************************************************************************************************
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
//      int listnum;
//      int replacer;
//      Node[] nodes;
      
      
      boolean done = false;
      while(!done) {
         // add code to empty the list?
        menu(); //display the main menu
        int choice = in.nextInt(); //get the user's keyboard Integer input
                
        
        if(choice == 1){
            replacement();
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

   
    public static void replacement(){
 
        List.ListReferenceBased aList = new List.ListReferenceBased();

        System.out.print("Enter a list of integers: "); //prompt for user input
            
        in.nextLine();
        String userInput = in.nextLine();

        //use tokenizer to break down a string into pieces of ints
        StringTokenizer sx = new StringTokenizer(userInput);
        int sxSize = sx.countTokens();

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
           
           int count = aList.replace(mod, replacer);
           
           System.out.print("Modified list: ");
           for(int i=0; i< aList.size(); i++){
               System.out.print(aList.get(i) + " ");
           }
           System.out.println("\nNumber of items replaced: " + count );
           
           System.out.println("");
    }  


    //public static void compare() {
    //   System.out.print("Enter first list to be compared: ");
    //    String input;
    //    List.Node aList = new List.Node(null);
    //        input = in.nextLine();
    //        input = in.nextLine();
    //        StringTokenizer sts = new StringTokenizer(input);
    //        int stsSize = sts.countTokens();
    //        Object itemss[] = new Object[stsSize];
    //        while (sts.hasMoreTokens()) {
    //               for(int i=0; i<stsSize; i++){
    //                   int newInput = Integer.parseInt(sts.nextToken());
    //                    itemss[i] = newInput;
    //                    aList.item = itemss[i];
    //                    aList.next = aList;
    //          }
    //      }
    //   System.out.print("Enter second list to be compared: ");
    //       List.Node list2 = new List.Node(null);
    //      String inputs;
    //        inputs = in.nextLine();
    //        inputs = in.nextLine();
    //        StringTokenizer tok = new StringTokenizer(inputs);
    //        int tokSize = tok.countTokens();
    //        Object itemz[] = new Object[tokSize];
    //        while (tok.hasMoreTokens()) {
    //               for(int i=0; i<tokSize; i++){
    //                   int newInput = Integer.parseInt(tok.nextToken());
    //                    itemz[i] = newInput;
    //                    list2.item = itemz[i];
    //                    list2.next = list2;
    //      }
    //   }
    //
    //    //equals(aList);
    //
    // }//end compare()


} // end class