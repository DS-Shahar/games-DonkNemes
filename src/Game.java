public class Game {

  // Properties
  private String gameName;
  private int numPlayers;
  private boolean isWater;

  // Constructor
  public Game(String gameName, int numPlayers, boolean isWater) {
    this.gameName = gameName;
    this.numPlayers = numPlayers;
    this.isWater = isWater;
  }

  // Getters and setters
  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public int getNumPlayers() {
    return numPlayers;
  }

  public void setNumPlayers(int numPlayers) {
    this.numPlayers = numPlayers;
  }

  public boolean getIsWater() {
    return isWater;
  }

  public void setIsWater(boolean isWater) {
    this.isWater = isWater;
  }
}
