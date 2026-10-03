package lab3;

public class Club {
    protected String clubName; //name of the club
    protected int minNumMember; //minimumnumber of members in the club
    protected int numMember; //current number of members
    public Club(String c,int m){
        clubName = c;
        minNumMember = m;
        numMember = m;
    }
    public void addMember(int num){
        numMember = numMember + num;
    }
    public void changeName(String newName){
        clubName = newName;
    }
    public String getName(){
        return clubName;
    }
    public int determineBudget(){
        return(numMember * 1000);
    }
    public void advertise(){
        System.out.println("Please join club: " + clubName);
    }
}
