package Lab;

import javax.swing.*;
import java.awt.*;

public class ShowFrame1 {
  public static void main(String[] args) {
    JFrame fr = new JFrame("windho ");
    JButton button = new JButton("Press");
    fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
    fr.getContentPane().add(button);
    fr.setSize(300, 400);
    fr.setVisible(true);

  }
}
