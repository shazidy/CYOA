//Behavior of battle once initiated. Alters stats for player and enemy accordingly and sets conditions when threshold is reached.
//the try/catch for inputmismatch wasn't fixed in time. Type only A, B or C

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Battle {

//    static PlayerSetup playerSetup;
//    static EnemySetup enemySetup;
    private static String choice;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

//A lower bound for giving enemy damage ...
//could be placed as a stat in playerSetup
// (would actually give more sense)
    private static int lowerBound = 5;
    private static boolean isABC;


    public static void battleSetup() {

        Location.playerSetup.status();
        Location.enemySetup.status();

        System.out.println("\nYou engage the enemy: " + Location.enemySetup.getName());


//        try {
        // this is just a bunch of numbers being crunched
        isABC = false; // ensures more battles can be instantiated in the same methods
            while (Location.enemySetup.getHP() > 0 && !isABC) {
                System.out.println(
                        "\n(A) Attack\n(B) Block\n(C) Evade");
                choice = scanner.nextLine();
                if (choice.equals("A")) {
                    Location.playerSetup.setHP(Location.playerSetup.getHP()
                            - random.nextInt(Location.enemySetup.getATK() * 2));
                    Location.enemySetup.setHP(Location.enemySetup.getHP()
                            - lowerBound
                            - Location.playerSetup.getSTR() / 3
                            - random.nextInt(Location.playerSetup.getSTR()) / 2
                            + random.nextInt(Location.enemySetup.getDEF()));
                    // System.out.println(passedStats.enemySetup.getHP() + "\n");
                }
                if (choice.equals("B")) {
                    Location.playerSetup.setHP(Location.playerSetup.getHP()
                            - random.nextInt(Location.enemySetup.getATK()));
                    Location.enemySetup.setHP(Location.enemySetup.getHP()
                            - random.nextInt(Location.playerSetup.getINT()
                            / 2));
                }
                if (choice.equals("B") && Location.playerSetup.getINT() < 5) {
                    Location.playerSetup.setHP(Location.playerSetup.getHP()
                            - random.nextInt(Location.enemySetup.getATK()));
                    Location.enemySetup.setHP(Location.enemySetup.getHP()
                            - lowerBound * Location.playerSetup.getINT()
                            - random.nextInt(Location.playerSetup.getINT() * Location.playerSetup.getSTR()));

                }
                if (choice.equals("C")) {
                    Location.playerSetup.setHP(Location.playerSetup.getHP()
                            - random.nextInt((Location.enemySetup.getATK() / 2)));
                    Location.enemySetup.setHP(Location.enemySetup.getHP()
                            - lowerBound
                            - random.nextInt(Location.playerSetup.getINT() * 2));
                }

                System.out.println();
                Location.playerSetup.status();
                Location.enemySetup.status();
            }
            isABC = true;

//        } catch(InputMismatchException ime) {
//            System.err.println("Not a valid input");
//            isABC = false;
//        }
    }
}