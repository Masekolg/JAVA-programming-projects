import java.util.Scanner;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import java.awt.Font;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextArea;

  public class HedgeYourBet extends JFrame implements

  ItemListener, ActionListener

{


    final int QUESTIONS = 5;

    final int CHOICES = 3;


    final int Tea = 0;

    final int Coffee = 1;

    final int Milk = 2;



    FlowLayout flow = new FlowLayout();

    JLabel greeting = new JLabel("Welcome to HedgeYourBet Quiz - choose 1, 2 or"

    + " 3 answers");


    Font serifBold = new Font("Courier New", Font.BOLD,20);

    JCheckBox[] choice = new JCheckBox[CHOICES];


    JLabel[] label = new JLabel[CHOICES];


    JTextArea outArea = new JTextArea("");


    String[] drinkName = { "Tea", "Coffee",

    "Milk" };


    String[] question = {

     "Points Earned: \n\nWhich is the" +
     " most" 
     + " \nconsumed drink?", 

     "\nWhich drink has caffeine?",

     "\nWhich drink is used for " 
     +"\ncereals?",

     "\nWhich drink can be made using " 
     +"\nbeans?",

     "\nWhich drink is naturally white in "
     + "color?" };


     int[] answers = { Tea, Coffee, Milk, Coffee, Milk };

     int questionNum = 0;

     int numChosen;


     JButton doneButton = new JButton("OK");

      boolean[] isChosen = new boolean[CHOICES];


      int points = 0;


      final int HIGHPOINTS = 5;
      final int MEDPOINTS = 2;
      final int LOWPOINTS = 1;

      String msg = new String("");
      
      final int HIGHMARK = 21;
      final int MEDMARK = 15;


      public HedgeYourBet()

{

      super("Hedge Your Best");

      JPanel mainPanel = new JPanel(new

      BorderLayout());

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      setLayout(flow);

      mainPanel.add(greeting, BorderLayout.CENTER);

      greeting.setFont(serifBold);

      outArea.setText(question[questionNum]);

      outArea.setFont(new Font("Arial",

      Font.BOLD + Font.ITALIC, 15));

      JPanel subPanel = new JPanel(new

      GridLayout(2,1));

      subPanel.add(outArea);

      JPanel optionsPanel = new JPanel(new

      GridLayout(3, 2));

for (int x = 0; x < CHOICES; ++x)

{

      choice[x] = new JCheckBox();

      label[x] = new JLabel(" " +

      drinkName[x]);


      label[x].setFont(new Font("Times of"

      + " NewRoman", Font.ITALIC, 16));

      optionsPanel.add(label[x]);

      optionsPanel.add(choice[x]);


      choice[x].addItemListener(this);

}


      subPanel.add(optionsPanel);

      doneButton.addActionListener(this);

      mainPanel.add(subPanel, BorderLayout.CENTER);

      mainPanel.add(doneButton, BorderLayout.SOUTH);

      add(mainPanel);

}

public static void main(String[] arguments)

{

      HedgeYourBet hFrame = new HedgeYourBet();
      hFrame.setSize(500, 400);
      hFrame.setResizable(false);
      hFrame.setVisible(true);
}

@Override

public void itemStateChanged(ItemEvent check)

{

      Object source = check.getItem();
      for (int x = 0; x < CHOICES; ++x)

{

      if (source == choice[x])

{


       int select = check.getStateChange();

       if (select == ItemEvent.SELECTED)

       isChosen[x] = true;

else

       isChosen[x] = false;

}

}

}

@Override


public void actionPerformed(ActionEvent e)

{

      numChosen = 0;

      for (int x = 0; x < CHOICES; ++x)

      if (isChosen[x])

      ++numChosen;

      if (isChosen[answers[questionNum]])

{


      if (numChosen == 1)

      points += HIGHPOINTS;

      else if (numChosen == 2)

      points += MEDPOINTS;

      else if (numChosen == 3)

      points += LOWPOINTS;

}

      for (int x = 0; x < CHOICES; ++x)

{

      choice[x].setSelected(false);

}


       outArea.setText("Total points earned: " + points

       +"\n");


       ++questionNum;


       if (questionNum == QUESTIONS)

{


       for (int x = 0; x < CHOICES; ++x)

{

       choice[x].setVisible(false);

       label[x].setVisible(false);

}


       doneButton.setEnabled(false);


       if (points > HIGHMARK)

       msg = "\nYour Knowledge is: "

       + "Fantastic!";


       else if (points >= MEDMARK)

       msg = "\nYour Knowledge is: "

       + "Very Good!";

       else

       msg = "\nYour Knowledge is: OK!";


       outArea.append(msg);

       outArea.append("\nGame over\n");

}

        else

        outArea.append("\n" + question[questionNum]);

}

}
     
