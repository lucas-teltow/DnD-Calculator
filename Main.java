/******************************************************************************

Calculator

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //various variables
        int contacted = 0;
        int followers = 0;
        int believers = 0;
        int missionaries = 0;
        int enemies = 0;
        int banes = 0;
        int anathemas = 0;
        int heroes = 0;
        int woeTiders = 0;
        String test = "L";
        Random rand = new Random();
        int temp = 0;
        int fixedVal = 0;
        int counter = 0;
        
        Scanner in = new Scanner(System.in); //scanner for the console inputs
        
        // System.out.println("Type your name");
        // test = in.nextLine();
        
        // System.out.println("Your name is " + test);
        
        System.out.println("Number of Missionaries");
        missionaries = in.nextInt();
        
        System.out.println("Number of Workers");
        believers = in.nextInt();
        
        System.out.println("Number of Followers");
        followers = in.nextInt();
        
        System.out.println("Number of Banes");
        banes = in.nextInt();
        
        System.out.println("Number of Anathemas");
        anathemas = in.nextInt();
        
        System.out.println("Number of Heroes");
        heroes = in.nextInt();
        
        System.out.println("Number of Woe Tiders");
        woeTiders = in.nextInt();
        
        while(true)
        {
            //contacted math
            System.out.println("Input Number of people contacted by Dark Dreams");
            contacted = in.nextInt();
            
            contacted = contacted / 4;
            
            for(int i = 0; i < contacted; i++)
            {
                temp = temp + rand.nextInt(4) + 1;
            }//summing up all the d4 values
            
            contacted = temp;
            
            contacted = contacted / 2;
            
            followers = followers + contacted;
            
            //missionaries math
            temp = 0;
            for(int i = 0; i < (missionaries / 4); i++)
            {
                temp = temp + rand.nextInt(4) + 1;
            }//summing up all the d4 values
            
            missionaries = missionaries + (temp / 4);
            
            followers = followers + (temp - (temp / 4));
            
            //believers total
            believers = followers + missionaries;
            
            
            //enemies
            //woe tiders
            fixedVal = woeTiders;
            for(int i = 0; i < fixedVal; i++)
            {
                temp = rand.nextInt(4) + 1;
                
                if(temp == 1)
                {
                    woeTiders++;
                    continue;
                }
                
                if(temp == 2)
                {
                    woeTiders = woeTiders + 2;
                    continue;
                }
                
                if(temp == 3)
                {
                    woeTiders = woeTiders + 3;
                    continue;
                }
                
                if(temp == 4)
                {
                    heroes++;
                }
            }//end of woeTiders loop
            
            //heroes calculation
            fixedVal = heroes;
            for(int i = 0; i < fixedVal; i++)
            {
                temp = rand.nextInt(4) + 1;
                
                if(temp == 1)
                {
                    heroes++;
                    counter = 0;
                    continue;
                }
                
                if(temp == 2)
                {
                    woeTiders = woeTiders + 2;
                    counter = 0;
                    continue;
                }
                
                if(temp == 3)
                {
                    woeTiders = woeTiders + 3;
                    counter = 0;
                    continue;
                }
                
                if(temp == 4)
                {
                    counter++;
                    if(counter == 2)
                    {
                        anathemas++;
                        counter = 1;
                    }
                }
            }//end of heroes loop
            
            //anathemas calculation
            fixedVal = anathemas;
            counter = 0;
            for(int i = 0; i < fixedVal; i++)
            {
                temp = rand.nextInt(4) + 1;
                
                if(temp == 1)
                {
                    anathemas++;
                    continue;
                }
                
                if(temp == 2)
                {
                    heroes = heroes + 2;
                    continue;
                }
                
                if(temp == 3)
                {
                    woeTiders = woeTiders + 3;
                    continue;
                }
                
                if(temp == 4)
                {
                    counter++;
                    if(counter == 4)
                    {
                        banes++;
                        counter = 0;
                    }
                }
            }//end of anathemas loop
            
            //total enemies
            enemies = banes + anathemas + heroes + woeTiders;
            
            System.out.println("\n\n\n\nMissionaries: " + missionaries);
            System.out.println("Followers: " + followers);
            System.out.println("Total Believers: " + believers);
            System.out.println("Banes: " + banes);
            System.out.println("Anathemas: " + anathemas);
            System.out.println("Heroes: " + heroes);
            System.out.println("Woe-Tiders: " + woeTiders);
            System.out.println("Total Enemies: " + enemies);
        }//end of the big loop
    }//end of main function
}//end of main class


