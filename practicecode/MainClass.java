package practicecode;

abstract class Player {
  protected String name;
  protected double rating;

  public Player() {

  }

  public Player(String name, double rating) {
    this.name = name;
    this.rating = rating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) throws IllegalArgumentException {
    if (rating < 0) {
      throw new IllegalArgumentException("Negative  rating = " + (rating));
    }
    this.rating = rating;
  }

  abstract void changeRating(double rating);

  @Override
  public String toString() {
    return "Player [name=" + name + ", rating=" + rating + "]";
  }

}

interface Comparable {
  public boolean compareTo(FootballPlayer g);
}

class FootballPlayer extends Player implements Comparable {
  int goals;
  int n = 0;
  int[] arr = new int[2];
  boolean check;

  public boolean compareTo(FootballPlayer g) {
    arr[n++] = g.goals;
    if (arr[0] > arr[1]) {
      check = true;
    } else {
      check = false;
    }
    return check;
  }

  void changeRating(double rating) {
    System.out.println(rating);
  }

  public FootballPlayer() {

  }

  public FootballPlayer(int goals) {
    this.goals = goals;
  }

  public FootballPlayer(String name, double rating, int goals) {
    super(name, rating);
    this.goals = goals;
  }

  public int getGoals() {
    return goals;
  }

  public void setGoals(int goals) throws IllegalArgumentException {
    if (goals < 0) {
      throw new IllegalArgumentException("Negative  goals = " + (goals));

    }
    this.goals = goals;
  }

  @Override
  public String toString() {
    return "FootballPlayer [goals=" + super.toString() + "]";
  }

}

public class MainClass {
  public static void main(String[] args) throws IllegalArgumentException {
    Player p1 = new FootballPlayer("shahidul Alom ", 7.6, 10);
    Player p2 = new FootballPlayer("Sabrina  Khaton ", 8.9, 15);

    FootballPlayer f = new FootballPlayer();

    f.compareTo(new FootballPlayer("shahidul Alom ", 7.6, 10));
    f.compareTo(new FootballPlayer("Sabrina  Khaton ", 8.9, 15));
    System.out.println(f.check);

    p1.changeRating(p1.getRating());
    p2.changeRating(p2.getRating());
    p1.toString();
    p2.toString();
    try {
      p1.setRating(-5);

    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    try {
      f.setGoals(-4);
    } catch (IllegalArgumentException e) {
      /* System.out.println(e.getMessage()); */
    }

  }
}
