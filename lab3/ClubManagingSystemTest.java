package lab3;

public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club c = new Club("Student", 200);
        SportsClub s = new SportsClub("Football", 40);
        ESportsClub e = new ESportsClub("RoV", 5);
        MarketingClub m = new MarketingClub("Advertising", 10, 100);

        Club[] clubs = {c, s, e, m};

        ClubManagingSystem system = new ClubManagingSystem(clubs);
        System.out.println("Highest member club: " +system.getHighestMemberClub().getName());
        System.out.println("All budget: " +system.determineAllBudget());
        System.out.println("All members: " +system.getAllMembers());
    }
}
