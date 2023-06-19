package Section12.Generics;

public class Main {
    public static void main(String[] args) {

        BaseballTeam phillies1 = new BaseballTeam("Phil");
        BaseballTeam astros1 = new BaseballTeam("AStro");
        scoreResult(phillies1,3,astros1,5);

        SportsTeam phillies2 = new SportsTeam("Phil");
        SportsTeam astros2 = new SportsTeam("AStro");
        scoreResult(phillies2,3,astros2,5);

        Team<BaseballPlayer> phillies = new Team<>("Phil");
        Team<BaseballPlayer> astros = new Team<>("AStro");
        scoreResult(phillies,3,astros,2);


        var harper = new BaseballPlayer("B harper","Right fielder");
        var marsh = new BaseballPlayer("Marsh","Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

        SportsTeam rm1 = new SportsTeam("Real Madrid");
        Team<FootBallPlayer> rm = new Team<>("Real Madrid");
        var rem = new FootBallPlayer("Benzema","Defense");
        rm.addTeamMember(rem);
        rm.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score){
        String message = team1.setScores(t1_score,t2_score);
        team2.setScores(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score){
        String message = team1.setScores(t1_score,t2_score);
        team2.setScores(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){
        String message = team1.setScores(t1_score,t2_score);
        team2.setScores(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }
}
