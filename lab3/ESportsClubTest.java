package lab3;

public class ESportsClubTest {
    public static void main(String[] args) {
        ESportsClub e = new ESportsClub("Esport", 100);
        e.advertise();
        e.determineBudget();
        e.getName();
        System.out.println(e.determineBudget());
        System.out.println(e.getName());

        
        Club c = new ESportsClub("Esport", 100);
        c.advertise();
        c.determineBudget();
        c.getName();
        System.out.println(c.determineBudget());
        System.out.println(c.getName());

    }
}
