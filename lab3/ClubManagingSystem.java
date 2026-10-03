package lab3;

public class ClubManagingSystem{
    protected Club[] clubList;

    public ClubManagingSystem(Club[] clubList){
        this.clubList = clubList;
    }
    public double determineAllBudget(){
        double budget = 0;
        for(int i = 0; i < clubList.length; i++){
            budget = budget + clubList[i].determineBudget();
        }
        return budget;
    }
    public int getAllMembers(){
        int totalMembers = 0;
        for(int i = 0; i < clubList.length; i++){
            totalMembers = totalMembers + clubList[i].numMember;
        }
        return totalMembers;
    }
    public Club getHighestMemberClub(){
        Club highestMemberClub = clubList[0];
        for(int i = 0; i < clubList.length; i++){
            if (clubList[i].numMember > highestMemberClub.numMember) {
                highestMemberClub = clubList[i];
            }
        }
        return highestMemberClub;
    }
}
