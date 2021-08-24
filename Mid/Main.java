package Mid;

public class Main {

  public static Plant[] prr = new Plant[5];
  public static int plantCount = -1;
  public static int findPlant = -1;

  public static void add(Plant p) {
    prr[++plantCount] = p;
  }

  public static void remove(String delete) {
    for (int i = 0; i < plantCount; i++) {
      if (prr[i].getName().equals(delete)) {
        Plant temp = prr[i];
        prr[i] = prr[plantCount];
        prr[plantCount] = temp;
        plantCount--;
        break;
      }
    }
  }

  public static Plant search(String find) {
    for (int i = 0; i < plantCount; i++) {
      if (find.equals(prr[i].getName())) {
        return prr[i];
      }
    }
    return null;
  }

  public static void display() {
    for (int i = 0; i <= plantCount; i++) {
      if (prr[i] instanceof Flower) {
        System.out.printf("Flower [Name = %s, Color = %s, hasSmell=%s, hasThorn=%s]\n", prr[i].getName(),
            prr[i].getColor(), ((Flower) prr[i]).getHasThorn() ? "true" : "false",
            ((Flower) prr[i]).getHasThorn() ? "true" : "false");
      } else if (prr[i] instanceof Herb) {
        System.out.printf("Herb [Name = %s, Color = %s, isMedicinal=%s, Season=%s]\n", prr[i].getName(),
            prr[i].getColor(), ((Herb) prr[i]).getIsMedicinal() ? "true" : "false", ((Herb) prr[i]).getSeason());
      } else {
        System.out.printf("Plant [Name = %s, Color = %s]\n", prr[i].getName(), prr[i].getColor());
      }
    }
  }

  public static void main(String[] args) {
    add(new Plant("Almond", "Brown"));

    add(new Herb("Tulsi", "Green", "All", true));
    add(new Flower("Rose", "Red", true, true));

    display();

    remove("Tulsi");

    display();

    Plant p = search("Almond");
    if (p != null) {
      System.out.printf("Plant [Name = %s, Color = %s]\n", p.getName(), p.getColor());
    } else {
      System.out.printf("Plant [Name = N/A, Color = N/A]\n");
    }
    p = search("Tulsi");
    if (p != null) {
      System.out.printf("Plant [Name = %s, Color = %s]\n", p.getName(), p.getColor());
    } else {
      System.out.printf("Plant [Name = N/A, Color = N/A]\n");
    }

  }
}

class Plant {
  private String name = "", color = "";

  public Plant() {

  }

  public Plant(String n, String c) {
    name = n;
    color = c;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Plant{" + "name='" + name + '\'' + ", color='" + color + '\'' + '}';
  }
}

class Flower extends Plant {
  private boolean hasSmell, hasThorn;

  public Flower() {
    super();
  }

  public Flower(String n, String c, boolean smell, boolean thorn) {
    super(n, c);
    hasSmell = smell;
    hasThorn = thorn;
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public String getColor() {
    return super.getColor();
  }

  public boolean getHasSmell() {
    return hasSmell;
  }

  public boolean getHasThorn() {
    return hasThorn;
  }

  public void setHasSmell(boolean hasSmell) {
    this.hasSmell = hasSmell;
  }

  public void setHasThorn(boolean hasThorn) {
    this.hasThorn = hasThorn;
  }

  @Override
  public String toString() {
    return "Flower{" + "hasSmell=" + hasSmell + ", hasThorn=" + hasThorn + '}';
  }
}

class Herb extends Plant {
  private boolean isMedicinal;
  private String Season;

  public Herb() {
    super();
  }

  public Herb(String n, String c, String season, boolean isMedicinal) {
    super(n, c);
    Season = season;
    this.isMedicinal = isMedicinal;
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public String getColor() {
    return super.getColor();
  }

  public boolean getIsMedicinal() {
    return isMedicinal;
  }

  public String getSeason() {
    return Season;
  }

  public void setIsMedicinal(boolean medicinal) {
    isMedicinal = medicinal;
  }

  public void setSeason(String season) {
    Season = season;
  }

  @Override
  public String toString() {
    return "Herb{" + "isMedicinal=" + isMedicinal + ", Season='" + Season + '\'' + '}';
  }
}
