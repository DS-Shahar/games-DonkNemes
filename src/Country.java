public class Country {
  // properties

  private String countryName;
  private String[] games = new String[43];

  public Country(String countryName, String[] games) {

    this.countryName = countryName;
    for (int i = 0; i < games.length; i++) {
      // loop to get the elements from the main program's inputted array
      this.games[i].equals(games[i]);

    }

  }

  public Country(Country other) {
    this.countryName = other.countryName;
    for (int i = 0; i < other.games.length; i++) {
      // loop to get the elements from the main program's inputted array
      this.games[i].equals(other.games[i]);

    }
  }

  public Country(String countryName) {
    this.countryName = countryName;
  }

  public boolean hasGame(String game) {
    for (int i = 0; i < games.length; i++) {
      if (games[i].equalsIgnoreCase(game)) {
        return true;
      }
    }
    return false;
  }

  public String getCountryName() {

    return countryName;

  }

  public void setCountryName(String countryName) {

    this.countryName = countryName;

  }

  public void setGames(String[] games) {
    this.games = games;
  }

  public String[] getGames() {

    return games;

  }

}
