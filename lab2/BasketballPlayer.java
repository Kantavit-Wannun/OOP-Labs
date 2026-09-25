package lab2;

public class BasketballPlayer extends Player{
    public BasketballPlayer(String n, int j) {
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }

    public void playGame() {
        minutesPlayed = minutesPlayed + 48;
    }
    public void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name + " changes number to " + jerseyNumber);
    }
}
