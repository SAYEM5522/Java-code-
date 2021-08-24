package java1;

import java.util.ArrayList;

// Abstract Class
abstract class Product {
  private String name;
  private double price;

  Product() {

  }

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // abstract method
  public abstract void changePrice(double percentage);

  @Override
  public abstract String toString();

}

// ElectronicDevice Class
class ElectronicDevice extends Product {

  private String model;
  private String warranty;

  ElectronicDevice() {

  }

  public ElectronicDevice(String name, double price, String model, String warranty) {
    super(name, price);
    this.model = model;
    this.warranty = warranty;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getWarranty() {
    return warranty;
  }

  public void setWarranty(String newWarranty) {
    this.warranty = newWarranty;
  }

  public void changePrice(double percentage) {
    System.out.println("Change Price of ElectronicDevice with 10% Tax " + percentage);
  }

  @Override
  public String toString() {

    return "[The name of the  ElectronicDevice = " + super.getName() + " The Price of the  ElectronicDevice = "
        + super.getPrice() + " The Model of the  ElectronicDevice = " + getModel()
        + " The Warranty of the  ElectronicDevice = " + getWarranty() + "]";

  }
}

class ClothingItem extends Product {

  private String fabricType;

  ClothingItem() {

  }

  public ClothingItem(String name, double price, String fabricType) {
    super(name, price);
    this.fabricType = fabricType;
  }

  public String getFabricType() {
    return fabricType;
  }

  public void setFabricType(String newFabricType) {
    this.fabricType = fabricType;
  }

  public void changePrice(double percentage) {
    System.out.println("Change Price of ClothingItem with 20% Discount = " + percentage);
  }

  @Override
  public String toString() {
    return "The name of the  ClothingItem =" + super.getName() + "The Price of the  ClothingItem =" + super.getPrice()
        + " The fabrictype of the  ClothingItem =" + fabricType + "]";
  }
}

// Main Class

public class Abstract {
  public static void main(String[] args) {
    Product p1 = new ElectronicDevice("Ipad  ", 1000, "Air ", "10 months");
    ElectronicDevice p = (ElectronicDevice) p1;
    ClothingItem p2 = new ClothingItem("T-Shirt", 500, "Cotton");
    ElectronicDevice p3 = new ElectronicDevice(" Ipad  ", 1000, "Air", "10 months");
    double d = p3.getPrice() - (p3.getPrice() * 0.9);
    p3.changePrice(p3.getPrice() + d);
    p2.changePrice(p2.getPrice() - (p2.getPrice() * 0.2));
    System.out.println(" Warranty of P1 = " + p.getWarranty());
    ArrayList<Product> array = new ArrayList<Product>();
    array.add(p1);
    array.add(p2);
    array.add(p3);
    p.setWarranty("6 months ");
    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i).toString());

    }

  }
}
