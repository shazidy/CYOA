/*
Every time this code is run in a class with 'Choice pick;' referenced in a class:

pick.choice();
choice = Choice.getChoice();

this try/catch will pick up any mismatched reference. However, since every method can have different numbers
of choices, the number cap has been set at five (no more than five choices), meaning that if there are less
the remaining inputs will return nullpointesceptions ... this can be fixed. The booleans keep track of what has
been entered into the console.

 */
import java.util.InputMismatchException;
import java.util.Scanner;


public class Choice {
    private static boolean isNumeric;
    private static int choice;
    private static String hotKey;

    //Getter and setter for isNumeric

    public static void setIsNumeric(boolean isNumeric) {
        Choice.isNumeric = isNumeric; }
    public static int getChoice() { return choice; }




    public static void choice(){

//if numeric value entered, it will break the while loop

        Scanner scanner = new Scanner(System.in);
//        String iHotKey = scanner.nextLine();
//        hotKey = iHotKey;
//        if (hotKey.equals("I)")) {
//                    for (int i = 0; i < Location.inventory.size(); i++) {
//                        System.out.println("Slot " + i + " " + Location.inventory.get(i));
//                        isNumeric = false;
//                }

        isNumeric = false;
//      Choice.setIsNumeric(false); //ensures that when choice is called, isNumeric is false
        while (!isNumeric)
            try {

                int iChoice = scanner.nextInt();
                choice = iChoice;
//        if (hotKey.equals("I)")) {
//                    for (int i = 0; i < Location.inventory.size(); i++) {
//                        System.out.println("Slot " + i + " " + Location.inventory.get(i));
//                        isNumeric = false;
//                        }
//                }
                isNumeric = true;       //breaks  the while-loop

//if input is more than 5 it will try again
//This is so far the only bug for choices if
//the input is less than 5 but more than number
//of available choices


                if (choice > 5 || choice == 0) {
                    System.err.println("Invalid Choice");
                    isNumeric = false;
                }
            }

//if input is not a number it gets caught and is run through
//IME and sets isNumeric to false so the while loop can try again

             catch (InputMismatchException ime) {
                 System.err.println("Invalid Choice");
                 isNumeric = false;

                 scanner.nextLine();    //Advance the scanner
             }
    }
}
