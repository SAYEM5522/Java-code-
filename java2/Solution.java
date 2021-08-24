package java2;

// Plant 
class Plant {

  private String name;
  private String color;

  Plant() {

  }

  Plant(String n, String c) {
    this.name = n;
    this.color = c;
  }

  public String getName() {
    return name;
  }

  public void setName(String n) {
    this.name = n;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String c) {
    this.color = c;
  }

  @Override
  public String toString() {
    return "color=" + color + ", name=" + name;
  }

}

class Flower extends Plant {
  private boolean hasSmell;
  private boolean hasThron;

  Flower() {

  }

  Flower(String n, String c, boolean smell, boolean thorn) {
    this.hasSmell = smell;
    this.hasThron = thorn;

  }

  public boolean getHasSmell() {
    return hasSmell;
  }

  public void setHasSmell(boolean smell) {
    this.hasSmell = smell;
  }

  public boolean getHasThron() {
    return hasThron;
  }

  public void setHasThron(boolean thron) {
    this.hasThron = thron;
  }

  @Override
  public String toString() {
    return "hasSmell=" + hasSmell + ", hasThron=" + hasThron;
  }
}

// Herb

class Herb extends Plant {
  private boolean isMediinal;
  private String Season;

  Herb() {

  }

  public Herb(String n, String c, boolean mediinal, String season) {
    this.isMediinal = mediinal;
    Season = season;
  }

  public boolean getMediinal() {
    return isMediinal;
  }

  public void setMediinal(boolean mediinal) {
    this.isMediinal = mediinal;
  }

  public String getSeason() {
    return Season;
  }

  public void setSeason(String season) {
    Season = season;
  }

  @Override
  public String toString() {
    return "Season=" + Season + ", isMediinal=" + isMediinal;
  }

}

// Solution Class

public class Solution {

  // public String [] plants=new String[20];

  public static Plant[] plants = new Plant[5];
  public static int plantCount = -1;
  public int findPlant = -1;

  public static void add(Plant p) {
    plants[++plantCount] = p;
  }

  public void remove(String delete) {
    String[] r = new String[plants.length - 1];

    for (int i = 0; i <= plantCount; i++) {
      if (plants[i].getName().equals(delete)) {

        System.arraycopy(delete, 0, r, 0, 0);
        System.arraycopy(delete, 0 + 1, r, 0, r.length - 0);
      }
      System.out.println(r);
    }
  }

  // public static Plant search(String find){

  // }

  public void display() {

  }

  public static void main(String[] args) {

    Plant f = new Flower("r", "white", true, false);
    Plant h = new Herb("r", "white", true, "spring");
    add(new Plant("rose", "red"));
    add(new Plant("tulsi", "red"));

    System.out.println(f.toString());
    // p.setName("Rose");
    // p.setName("white rose");
    // p.setName("Rose");
    // p.setName("Rose");

    // System.out.println(p.toString());
    System.out.println(h.toString());

  }

 
}
