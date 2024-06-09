import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFacts extends JFrame 
{
   public static void main(String[] args)
   {
      FlowLayout flow = new FlowLayout();
      final int WIDTH = 250;
      final int HEIGHT = 100;
      Font headlineFont = new Font("Imperial" , Font.ITALIC, 35);
      JLabel heading = new JLabel("Facts about the French Revolution");
      aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      aFrame.setVisible(true);
      aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel label = new Jlabel("The French Revolution lasted 10 years from 1789 to 1799.");
      JLabel label = new JLabel("It began on July 14, 1789.");
      JLabel label = new JLabel("There was a deep financial crisis in France right before the revolution.");
      JLabel label = new JLabel("The French believed the Royals were spendthrifts.");
      JLabel label = new JLabel("Severe storms and drastic weather caused poor harvests.");
      JLabel label = new JLabel("High bread prices lead to famine.");
      JLabel label = new JLabel("The revolution came to an end 1799 when a general named Napoleon overthrew the revolutionary government."); 
      aFrame.add(label);
      aFrame.setLayout(newFlowLayout());
      label.setFont(headlineFont);
      aFrame.add(label);

    }
}    
    