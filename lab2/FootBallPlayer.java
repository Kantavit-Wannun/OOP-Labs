package lab2;

public class FootballPlayer extends Player{
    public FootballPlayer(String n, int j){
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }
    public void playGame(){
        minutesPlayed = minutesPlayed +90;
    }
}
