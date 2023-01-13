package Quiz;
import java.util.ArrayList;

public class FootballStats {
    private String A_side;
    private String B_side;

    FootballStats(){
        this.A_side = "A Side";
        this.B_side = "B Side";
    }
    FootballStats(String A_side, String B_side){
        this.A_side = A_side;
        this.B_side = B_side;
    }
    private int[] ScoreSheet = {0, 0};

    public int[] getScoreSheet() {
        return ScoreSheet;
    }
    private ArrayList<int[]> GoalsScored = new ArrayList<>();
    public void Goal(int time, int scorer, int side){
        if(side == 0){
            this.ScoreSheet[0]++;
        } else if (side == 1){
            this.ScoreSheet[1]++;
        } else{
            return;
        }
        int[] goal = {time, scorer, side};
        this.GoalsScored.add(goal);
    }
    public void getGoals(){
        for (int[] is : GoalsScored) {
            System.out.print("Time: " + is[0] + " > "); 
            System.out.print("Scorer: " + is[1] + " > ");
            String team;
            if (is[2] == 0){
                team = this.A_side;
            }else{
                team = this.B_side;
            }
            System.out.println("Team: " + team); 
        }
    }
    private ArrayList<int[]> Cards = new ArrayList<>();
    public void Card(int time, int player, int side){
        if(side != 0 || side != 1){
            return;
        }
        int[] card = {time, player, side};
        this.Cards.add(card);
    }
    public void getCards(){
        for (int[] is : Cards) {
            System.out.print("Time: " + is[0] + " > "); 
            System.out.print("Player: " + is[1] + " > ");
            String team;
            if (is[2] == 0){
                team = this.A_side;
            }else{
                team = this.B_side;
            }
            System.out.println("Team: " + team); 
        }
    }
    private int[] Possession = {50, 50};

    public int[] getPossession() {
        return this.Possession;
    }
    public void setPossession(int A_side, int B_side){
        if (A_side + B_side != 100){
            System.out.println("Invalid possession");
            return;
        }
        this.Possession[0] = A_side;
        this.Possession[1] = B_side;
    }
}
