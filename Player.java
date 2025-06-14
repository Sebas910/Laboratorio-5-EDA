public class Player{


   private String playerName;
   private int wins;
   private int draws;
   private int losses;

    public void addWin(){
        this.wins++;
    }

    public void addDraw(){
        this.draws++;
    }
    public void addLoss(){
        this.losses++;
    }

    public void winRate(){
        float winRate = (float)wins/(float)draws;
    }





}