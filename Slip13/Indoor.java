
package Slip13;

// Indoor class
public class Indoor {
    private String gameName;
    private String[] players;

    // Parameterized constructor
    public Indoor(String gameName, String[] players) {
        this.gameName = gameName;
        this.players = players;
    }

    // Display the list of players for the specific game
    public void display() {
        System.out.println("Indoor Game: " + gameName);
        System.out.println("Players: ");
        for (String player : players) {
            System.out.println(player);
        }
    }

    // Finalize method (called by garbage collector before object is destroyed)
    protected void finalize() {
        System.out.println("Indoor game object destroyed.");
    }
}

// Outdoor class
public class Outdoor {
    private String gameName;
    private String[] players;

    // Parameterized constructor
    public Outdoor(String gameName, String[] players) {
        this.gameName = gameName;
        this.players = players;
    }

    // Display the list of players for the specific game
    public void display() {
        System.out.println("Outdoor Game: " + gameName);
        System.out.println("Players: ");
        for (String player : players) {
            System.out.println(player);
        }
    }

    // Finalize method (called by garbage collector before object is destroyed)
    protected void finalize() {
        System.out.println("Outdoor game object destroyed.");
    }
}