//When PlayerSetup is called, initial stats are set. These can be altered through getters and setters, which are handled
//by Battle.battleSetup() method or through player actions. Identifiers are set in the PlayerSetups parameters to make
//initialization easier.


public class PlayerSetup {

    private int HP;
    private int INT;
    private int STR;
    private String playerName;
    String visual = "█";

    public PlayerSetup(int HP, int STR, int INT){
        this.HP = HP;
        this.STR = STR;
        this.INT = INT;
    }

//Getters and Setters
//To change player name
    public void setPlayerName(String playerName) { this.playerName = playerName; }
    public String getPlayerName(){ return this.playerName; }
//To change player HP
    public void setHP(int HP){ this.HP = HP; }
    public int getHP() { return this.HP; }
//To change player intelligence
    public void setINT(int INT){ this.INT = INT; }
    public int getINT() { return this.INT; }
//To change player strength
    public void setSTR(int STR) { this.STR = STR; }
    public int getSTR(){ return this.STR; }

//calls for a status of player stats and displays them.
    public void status() {
        System.out.println("Your Health is: ");
        for (int i = 0; i < getHP() ; i++) {
            System.out.print(visual);
        }
        System.out.println(" " + getHP() + "\nYour Intelligence is: ");
        for (int i = 0; i < getINT() ; i++) {
            System.out.print(visual);
        }
        System.out.println(" " + getINT() +"\nYour Strenght is: ");
        for (int i = 0; i < getSTR() ; i++) {
            System.out.print(visual);
        }
        System.out.println(" " + getSTR());

//Runs conditions if an of them has reached below 1 (DEAD)
        if (getHP() < 1 || getSTR() < 1 || getINT() < 1){
            if (getHP() <1 ){
                System.out.println(
                        "\nYou body has been punished beyond any reasonable measure. This new world has gotten the better \n" +
                        "of you.\n\nYou are Dead!!!"); }
            if (getINT() < 1) {
                System.out.println(
                        "\nYour body has succumbed to you brain's inability to spare a single braincell for oxygenation.\n" +
                        "Alas you were too stupid to comprehend that your body and mind were in a fierce battle against\n" +
                        "eachother. In a fight like that, there is no winner.\n\n You are Dead!!!"); }
            if (getSTR() < 1) {
                System.out.println(
                        "\nAll your muscles have withered down to the bone. you are nothing but a hollow shell of loose\n" +
                        "skin clamping to the a brittle frame of loose joints. You end your days as a unrecognizable pile\n" +
                        "of smelly puss.\n\n You are Dead!!!"); }
            System.exit(0);
        }
    }
}




