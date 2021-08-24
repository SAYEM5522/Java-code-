package java1;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ShowAFrame {

  public static void main(String[] args) {
    String[] a = { "abc", "djie", "afj" };

    // Variables in this code
    int one = 12;
    int two = 22;
    int total = one + two;
    System.out.println(total);

    JFrame myFrame = new JFrame("Test GUI");
    myFrame.setVisible(true);
    myFrame.setBounds(300, 200, 700, 400);
    JLabel myText = new JLabel("I'm a label in the window, output : " + total, SwingConstants.CENTER);
    for (int i = 0; i < a.length; i++) {
      myText.setText(a[i]);
    }

    myFrame.getContentPane().add(myText, BorderLayout.CENTER);

  }

}
