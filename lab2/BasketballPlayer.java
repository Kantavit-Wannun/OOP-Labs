package lab2;

public class BasketballPlayer extends Player{
    private String name;
    private int jerseyNumber;
    private int minutesPlayed;

    public BasketballPlayer(String n, int j) {
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }

    public void print() {
        System.out.println(name + ":" + jerseyNumber);
    }

    public void playGame() {
        minutesPlayed = minutesPlayed + 48;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name + " changes number to " + jerseyNumber);
    }
}
