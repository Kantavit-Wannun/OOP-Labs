package lab2;

public class FootBallPlayer {
    private String name;
    private int jerseyNumber;
    private int minutesPlayed;

    public FootballPlayer(String n, int j){
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }
    public void print(){
        System.out.println(name+ ":" +jerseyNumber);
    }
    public void playGame(){
        minutesPlayed = minutesPlayed +90;
    }
    public int getMinutesPlayed(){
        return minutesPlayed;
    }
}
