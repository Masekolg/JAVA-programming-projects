import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;


  public class ValidateCheckDigits
{

  public static void isValidNumber(String accNum) throws FileNotFoundException, IOException
{
      FileWriter fw = new FileWriter(new File("validAccounts.txt"),true);
      BufferedWriter bw = new BufferedWriter(fw);

      int sum = 0,lastDigit = 0;
      for(int i = 0; i < accNum.length(); i++)
{
if(i == accNum.length() - 1)
{
      lastDigit = Character.digit(accNum.charAt(i),16);
}

else
{
      int temp = Character.digit(accNum.charAt(i),16);
      sum += temp;
}

}


       int reminder = sum%10;

       if(reminder == lastDigit)
{

        System.out.println("Account Number "+accNum+" is Valid ");

        bw.write(accNum);
        bw.newLine();
}
else
{
        System.out.println("Account Number "+accNum+" is Not Valid ");
}

bw.close();


}
}