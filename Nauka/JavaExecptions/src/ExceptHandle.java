//import java.lang.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
//import java.awt.*;


public class ExceptHandle extends JFrame
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
//        File Not Found Exception
//        getAFile("./somestuff.txt");
//
//      //Input Mismatch Exception
//      System.out.println("How are you?");
//      int age= checkValidAge();
//      if(age != 0)
//      {
//        System.out.println("You are "+ age);
//      }


    }

    public static void getAFile(String fileName)
    {
        try {
            FileInputStream file = new FileInputStream(fileName);
        }
        catch(FileNotFoundException e)
        {
            System.out.println(":-(");
        }
        catch (IOException e)
        {
            System.out.println(" Unknown IO Error");
        }
        catch (Exception e){
            System.out.println("Error occured");
        }
        finally
        {
            System.out.println(".");
        }

    }
    public static int checkValidAge()
    {
        try
        {
            return userInput.nextInt();
        }
        catch (InputMismatchException e)
        {
            userInput.next();
            System.out.println("That is't a whole number");
        }
        return 0;
    }
}
