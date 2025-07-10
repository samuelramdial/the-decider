/**
@author Ramdial, Samuel "Sam" - ITSC 1212 - 005 - von Briesen
@version 1.0
@since 11/08/2021

Project 2 B
Create a program that can be used to make a decision between two options. 

*/
import java.util.*;
public class theDecider
{
    public static void main(String[] args)
    {
        String startMessage = "*************************** START ************************* \n";
        String endMessage = "\n****************************** END *********************";
        
        Scanner console = new Scanner(System.in);
        boolean end = false; 
        System.out.println(startMessage);

        while (end != true) // continues to loop through until both users enter "end"
        {
            System.out.print("Please enter option: "); 
            String option = console.nextLine(); 
            System.out.print("Please enter first user's name: "); 
            String firstUser = console.nextLine(); 
            System.out.print("Please enter second user's name: ");
            String secondUser = console.nextLine(); 

            decider(option, firstUser, secondUser); // passes parameter to function decider that decides who wins 
            System.out.print("\n" + firstUser + " do you want to decide another option (enter \"end\" to stop)?: ");
            String firstUserStatement = console.nextLine(); 
            System.out.print(secondUser + " do you want to decide another option ( enter \"end\" to stop)?: ");
            String secondUserStatement = console.nextLine(); 
            System.out.println();

            if (firstUserStatement.toLowerCase().equals("end") && secondUserStatement.toLowerCase().equals("end")) // checks to see if both users enter end (not case-sensitive)
            {
                System.out.println("Thank you for using The Decider!");
                end = true; 
            }
            
        }
        System.out.println(endMessage);
 
    }//end main 

    public static void decider(String _option, String _user1, String _user2)
    {
        double decidingNumber = Math.random(); 

        if (decidingNumber < 0.5) // if less than 0.5, user1 wins, else user2 wins. 
        {
            System.out.println("\nCongratulations " + _user1 + " you have the honor of " + _option);
        }
        else 
        {
            System.out.println("\nCongratulations " + _user2 + " you have the honor of " + _option);
        }
    }
}//end class