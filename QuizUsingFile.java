import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.io.Writer;

import java.util.Scanner;

public class QuizUsingFile

{

    public static void main(String args[]) throws IOException

    {

        File file = new File("score.txt");

        file.createNewFile();

        Scanner fin = new Scanner(file);

        int highScore = 0;

        while(fin.hasNextLine())

            highScore = Integer.parseInt(fin.nextLine());

        fin.close();

        System.out.println("High Score = " + highScore);

        String QA[][] = new String[10][5];

        Q1[0][0] = "What color is blood?";

        Q1[0][1] = "1) Red";

        Q1[0][2] = "2) Blue";

        Q1[0][3] = "3) Black";

        Q1[0][4] = "1";

       

        Q1[1][0] = "Which animal flies below?";

        Q1[1][1] = "1) Cow";

        Q1[1][2] = "2) Lion";

        Q1[1][3] = "3) Bird";

        Q1[1][4] = "3";

       

        Q1[2][0] = "Which is not a fruit";

        Q1[2][1] = "1) Banana";

        Q1[2][2] = "2) Lettuce";

        Q1[2][3] = "3) Orange";

        Q1[2][4] = "2";

       

        Q1[3][0] = "Which room has no door or window?";

        Q1[3][1] = "1) Bedroom";

        Q1[3][2] = "2) Mushroom";

        Q1[3][3] = "3) Bathroom";

        Q1[3][4] = "2";

       

        QA[4][0] = "How many states are in the USA?";

        QA[4][1] = "1) Fifteen";

        QA[4][2] = "2) One-Hundred";

        QA[4][3] = "3) Fifty";

        QA[4][4] = "3";

       

        QA[5][0] = "Under which province is Johannesburg?";
        QA[5][1] = "1) Limpopo";

        QA[5][2] = "2) Gauteng";

        QA[5][3] = "3) Mpumalanga";

        QA[5][4] = "2";

       

        QA[6][0] = "What is USA currency?";

        QA[6][1] = "1) Dollar";

        QA[6][2] = "2) Yen";

        QA[6][3] = "3) Euro";

        QA[6][4] = "1";

       

        QA[7][0] = "Which of the following is a loop in Java?";

        QA[7][1] = "A) void";

        QA[7][2] = "B) for";

        QA[7][3] = "C) public";

        QA[7][4] = "B";

       

        QA[8][0] = "What color is the sky?";

        QA[8][1] = "1) Green";

        QA[8][2] = "2) Yellow";

        QA[8][3] = "3) Blue";

        QA[8][4] = "3";


        Scanner sc = new Scanner(System.in);

        char option;

        int correct = 0, incorrect = 0;

        for(int i = 0; i < 10; i++)

        {

            System.out.println("Question " + (i + 1) + ":");

            System.out.println(QA[i][0]);

            System.out.println("\t" + QA[i][1]);

            System.out.println("\t" + QA[i][2]);

            System.out.println("\t" + QA[i][3]);

            System.out.print("Enter the answer [1 / 2 / 3]: ");


            while(true)

            {

                option = sc.next().charAt(0);

                if(option == '1' || option == '2' || option == '3')

                    break;


                System.out.print("Invalid entry!! Enter the answer [1/ 2 / 3]: ");

            }

            if(option == QA[i][4].toCharArray()[0])

            {  

                System.out.println("Correct!");

                correct += 1;

            }


            else

            {

                System.out.println("The correct answer is " + QA[i][4]);

                incorrect += 1;

            }    

        }

        System.out.println("Total correct attempts: " + correct);

        System.out.println("Total incorrect attempts: " + incorrect);

        if(correct > highScore)

        {

            System.out.println("Congrats. New high score.");

            highScore = correct;

            Writer fout = new FileWriter("score.txt");

            fout.write(highScore + "");

            fout.close();

        }

        sc.close();

    }

}
