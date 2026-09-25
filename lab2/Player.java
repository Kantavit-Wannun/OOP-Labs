package lab2;

public class Player {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;

    public void setName (String name){
        this.name = name;
    }
    public void setJerseyNumber (int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }
    public void setMinutePlayed (int minutesPlayed){
        this.minutesPlayed = minutesPlayed;
    }
    public void print() {
        System.out.println(name + ": " + jerseyNumber);
    }

    public String getName (){
        return name;
    }
    public int getJerseyNumber (){
        return jerseyNumber;
    }
    public int getMinutesPlayed (){
        return minutesPlayed;
    }
}
