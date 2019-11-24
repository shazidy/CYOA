
import com.sun.jdi.Method;
import com.sun.source.tree.MethodInvocationTree;

import java.nio.file.LinkOption;
import java.util.ArrayList;

import java.util.Scanner;


public class Location {

    //initializes PlayerSetup and EnemySetup
//    static ArrayList<String> inventory = new ArrayList<String>();



    public static Choice pick;
    static PlayerSetup playerSetup;
    static EnemySetup enemySetup;
    //public static Inventory amount = new Inventory();
    public static ArrayList<String> inventory = new ArrayList<String>();


//passes the parameters each time a new instance of PlayerSetup and EnemySetup is initialized to be used by
//Battle.battleSetup(). That way, every change in stats can be handled in a separate class.
//Location(PlayerSetup passedPlayerStats, EnemySetup passedEnemyStats, Inventory passedInventory) {
    //playerSetup = passedPlayerStats;                  //redundant
    //enemySetup = passedEnemyStats;                    //redundant
    //inventory = passedInventory;

    //   }

    //checks whether a location/method has been called (could maybe be initialized in an arraylist)





    private static int choice;//choice variabel for choosing events
    public static String item;
    private static Scanner scanner = new Scanner(System.in);           //Creates scanner
    //public static String name;                                                     //charactername if needed

    //The Start of the story and also the main file for all text and choices. Methods (locations) are all accessible through
    //this class.





    public static void start() {




        inventory.add(Inventory.item = "Rusty Knife");
        Inventory.inventory();

        inventory.add(Inventory.item = "Crap");
        Inventory.inventory();

        inventory.add(Inventory.item = "More Crap");
        Inventory.inventory();

        inventory.add(Inventory.item = "ugly shit");
        Inventory.inventory();

        inventory.add(Inventory.item = "stupid hoe");
        Inventory.inventory();

        inventory.add(Inventory.item = "kage");
        Inventory.inventory();



        System.out.println(
                "Before your journey begins, an important question needs answering." +
                        "\n\nAre you Brains(1), Brawns(2) or a bit of both(3)?");
        //choice = scanner.nextInt();

        pick.choice();
        choice = Choice.getChoice();


        if (choice == 1) {
            playerSetup = new PlayerSetup(10, 5, 15);
            System.out.println(
                    "You value a good book over a trip to the gym. Just be sure, that when push comes to \n" +
                            "shove, you can throw your book hard enough at your opponent.\n");

        }
        if (choice == 2) {
            playerSetup = new PlayerSetup(15, 15, 5);
            System.out.println(
                    "You are a powerhouse of brute force. You can slay any enemy who stand in your way, but \n" +
                            "you have yet to conquer you greatest foe; Dyslexia.\n");
            duck2();
        }
        if (choice == 3) {
            playerSetup = new PlayerSetup(10, 10, 10);
            System.out.println(
                    "You are a Jack of All Trades - Master of None. You seem to be adequately adept, yet \n" +
                            "bland as luke warm oatmeal. Playing it safe isn't necessarily safe.\n");
            duck3();
        }

//Placeholder text for the test encounter below
        System.out.println(
                "A wild duck appears. Maybe it's the sense of fear of new places or the paranoia coursing through\n" +
                        "your mind, but you are certain that this particular duck is out to get you.");

//these next lines of code initiates a battle sequence with customizable enemy. All stats are saved and carried on to
//the next encounter. They have been placed here to test an enemy with given stats against player type
       // playerSetup = new PlayerSetup(100,100,100); //this is a test player (JUnit testing would be the proper way to test ...)

    }
    public static void duck() {
        enemySetup = new EnemySetup("Duck", 2, 50, 2, "Rusty Dagger",
                "As life flees from its soulless eyes, you are glad that you decided to crush this most fiendish of foes");
        Battle.battleSetup();

    }
    public static void duck2() {
        enemySetup = new EnemySetup("Duck2", 2, 50, 2, "Rusty Dagger",
                "As life flees from its soulless eyes, you are glad that you decided to crush this most fiendish of foes");
        Battle.battleSetup();
    }
    public static void duck3() {
        enemySetup = new EnemySetup("Duck3", 2, 50, 2, "Rusty Dagger",
                "As life flees from its soulless eyes, you are glad that you decided to crush this most fiendish of foes");
        Battle.battleSetup();

    }


}

