public class Hrac {

    private String playerName;
    private String favouriteClass;
    private int MMR; //??????

    public Hrac(String playerName, String favouriteClass, int MMR) {
        this.playerName = playerName;
        this.favouriteClass = favouriteClass;
        this.MMR = MMR;
    }

    public String toString() {
        return "Jméno: " +playerName+ " | Oblíbená classa: " + favouriteClass + " | MMR:" + MMR;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getFavouriteClass() {
        return favouriteClass;
    }

    public void setFavouriteClass(String favouriteClass) {
        this.favouriteClass = favouriteClass;
    }

    public int getMMR() {
        return MMR;
    }

    public void setMMR(int MMR) {
        this.MMR = MMR;
    }
}
