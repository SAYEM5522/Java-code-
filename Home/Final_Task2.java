package Home;

import java.util.ArrayList;
import java.util.*;

public class Final_Task2 {

  private static ArrayList<String> January = new ArrayList<String>();
  private static ArrayList<String> February = new ArrayList<String>();
  private static ArrayList<String> March = new ArrayList<String>();
  private static ArrayList<String> April = new ArrayList<String>();
  private static ArrayList<String> May = new ArrayList<String>();
  private static ArrayList<String> June = new ArrayList<String>();
  private static ArrayList<String> July = new ArrayList<String>();
  private static ArrayList<String> Auguest = new ArrayList<String>();
  private static ArrayList<String> September = new ArrayList<String>();
  private static ArrayList<String> October = new ArrayList<String>();
  private static ArrayList<String> November = new ArrayList<String>();
  private static ArrayList<String> December = new ArrayList<String>();

  public static void addTask() {
    Scanner input = new Scanner(System.in);

    System.out.println("\t----- Add Task Section -----\n");
    System.out.print("\tEnter the month (Ex. January): ");
    String month = input.nextLine();

    if (month.equals("January")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      January.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("February")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      February.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("March")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      March.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("April")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      April.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("May")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      May.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("June")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      June.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("July")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      July.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("Auguest")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      Auguest.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("September")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      September.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("October")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      October.add(task);
      System.out.println("\tTask added!");
    } else if (month.equals("November")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      November.add(task);
    } else if (month.equals("December")) {
      System.out.print("\tEnter Task: ");
      String task = input.nextLine();
      December.add(task);
      System.out.println("\tTask added!");
    } else {
      System.out.println("\tPlease enter in correct form!");
    }

  }

  public static void showTask() {
    Scanner input = new Scanner(System.in);

    System.out.println("\t----- Show Tasks  -----\n");
    System.out.print("\tEnter the month (Ex. January): ");
    String month = input.nextLine();

    if (month.equals("January")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : January) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("February")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : February) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("March")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : March) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("April")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : April) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("May")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : May) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("June")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : June) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("July")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : July) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("Auguest")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : Auguest) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("September")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : September) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("October")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : October) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("November")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : November) {
        System.out.println("\t" + i);
      }
    } else if (month.equals("December")) {
      System.out.println("\nList of tasks for " + month + ": \n");
      for (String i : December) {
        System.out.println("\t" + i);
      }
    } else {
      System.out.println("\tPlease enter in correct form!");
    }
  }

  public static void main(String[] args) {
    while (true) {

      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);

      // display options
      System.out.println("\n\t[1] Add a task");
      System.out.println("\t[2] Show tasks to do");
      System.out.println("\t[3] Exit");

      // get choice from user
      System.out.println("\n\tEnter choice");
      System.out.println("\t---------------------");
      System.out.print("\t> ");
      int choice = input.nextInt();

      // switch methods according to choice
      switch (choice) {
        case 1:
          addTask();
          break;
        case 2:
          showTask();
          break;
        case 3:
          System.exit(0);
        default:
          System.out.println("\n\tIncorrect Input!");
      }

    }
  }

}
