package lab2;

public class MarketingClub extends Club{
    private int budget;

    public MarketingClub(String c,int m,int budget){
        super(c, m);
        this.budget = budget;
    }
    public boolean useBudget(int amount){
        if (this.budget - amount >= 0) {
            this.budget = this.budget - amount;
            return true;
        } else {
            return false;
        }
    }
    public int determineBudget(){
        if (budget > 1000) {
            return 0;
        } else {
            return super.determineBudget();
        }
    }
}
