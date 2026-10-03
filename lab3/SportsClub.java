package lab3;

public class SportsClub extends Club {
    public SportsClub(String c,int m) {
        super(c, m);
    }
    public int determineBudget (){
        return (numMember * 1000) + (numMember - minNumMember) *100;
    }
    public void changeName(String newName){}
    public int getNumMember (){
        return numMember;
    }
}
