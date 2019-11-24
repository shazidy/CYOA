
public class Main {

    /**
     * SuperTale is a very short, very unfinished game with huge potential.
     * A simple CYOA game with RPG elements.
     * Battle is handled in a separated class and works as intended even keeping the updated playerStats for
     * next enemy encounter. Both Player and Enemy has their own class and creates a specific instance of their
     * respective objects when instantiated. Everything from stats, items and even death-string is instantiated
     * in Location class along with the main text of the story. Only A, B and C are valid options at the moment
     * since exceptions hasn't been handled in the Battle class.
     * We chose to keep text and choices together in their respective methods, as there are conditions that, when
     * returned to a method can create different branches going from that method, as each method also serves as
     * a situation/location in the world. It works and gives an okay overview of where each method leads to if
     * the accompanying booleans are aptly named to reflect to which method they belong.
     * 21-11-2019 ASJ & UNA
     */

    public static void main(String args[]) {

        System.out.println("  _________                        ___________      .__          \n" +
                " /   _____/__ ________   __________\\__    ___/____  |  |   ____  \n" +
                " \\_____  \\|  |  \\____ \\_/ __ \\_  __ \\|    |  \\__  \\ |  | _/ __ \\ \n" +
                " /        \\  |  /  |_> >  ___/|  | \\/|    |   / __ \\|  |_\\  ___/ \n" +
                "/_______  /____/|   __/ \\___  >__|   |____|  (____  /____/\\___  >\n" +
                "        \\/      |__|        \\/                    \\/          \\/ "

        );
        //ASCII text created using http://patorjk.com/software/taag
        System.out.println("A tiny CYOA-game created by André Jensen & Ulrikke Norrbohm Andersen\n\n");

        Location.start();
    }
}
