package lab2;

public class ClubTest {
    public static void main(String[] args) {
        SportsClub sports = new SportsClub("Football Club", 10);
        System.out.println("--- SportsClub Test ---");
        System.out.println("Club Name: " + sports.getName());
        sports.addMember(5);
        System.out.println("SportsClub Budget: " + sports.determineBudget());
        sports.changeName("Basketball Club");
        System.out.println("Club Name after change attempt: " + sports.getName());
        System.out.println();

        MarketingClub marketing = new MarketingClub("HelloJava Club", 8, 1200);
        System.out.println("--- MarketingClub Test ---");
        System.out.println("Club Name: " + marketing.getName());
        System.out.println("MarketingClub Budget: " + marketing.determineBudget());
        System.out.println("Use budget 500: " + marketing.useBudget(500));
        System.out.println("MarketingClub Budget: " + marketing.determineBudget());
        System.out.println("Use budget 1000: " + marketing.useBudget(1000));
    }
}
