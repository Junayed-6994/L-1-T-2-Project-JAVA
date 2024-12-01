package Searching;
import java.util.ArrayList;
import java.util.Scanner;

import PlayerInfo.Player;
import static Utilities.InfoFromClub.*;

public class SearchClubOptions {

    public static void searchingclubs(ArrayList<Player> players)
    {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("Club Searching Options:");
            System.out.println("(1) Player(s) with the maximum salary of a club");
            System.out.println("(2) Player(s) with the maximum age of a club");
            System.out.println("(3) Player(s) with the maximum height of a club");
            System.out.println("(4) Total yearly salary of a club");
            System.out.println("(5) Back to Main Menu");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            String clubname;

            switch (choice) 
            {
                case 1: 
                    System.out.println("Enter the Club Name: ");
                    clubname = sc.nextLine().trim();
                    ArrayList<Player> Salary = Search_By_MaxSalary(players,clubname);
                    if(Salary.size()>0)
                    {
                        System.out.println("Players(s) with the Maximum Salary:");
                        for(int i=0;i<Salary.size();i++)
                        {
                            System.out.println(Salary.get(i).toString());
                        }
                    }
                    else System.out.println("No such Club with this name");
                    break;

                case 2: 
                    System.out.println("Enter the Club Name: ");
                    clubname = sc.nextLine().trim();
                    ArrayList<Player> Age = Search_By_MaxAge(players, clubname);
                    if(Age.size()>0) 
                    {
                        System.out.println("Players(s) with the Maximum Age:");
                        for(int i=0;i<Age.size();i++)
                        {
                            System.out.println(Age.get(i).toString());
                        }
                    }
                    else System.out.println("No such Club with this name");
                    break;

                case 3: 
                    System.out.println("Enter the Club Name: ");
                    clubname = sc.nextLine().trim();
                    ArrayList<Player> Height = Search_By_MaxHeight(players, clubname);
                    if(Height.size()>0) 
                    {
                        System.out.println("Players(s) with the Maximum Age:");
                        for(int i=0;i<Height.size();i++)
                        {
                            System.out.println(Height.get(i).toString());
                        }
                    }
                    else System.out.println("No such Club with this name");
                    break;

                case 4:
                    System.out.println("Enter the Club Name: ");
                    clubname = sc.nextLine().trim(); 
                    double Total_Salary = -1;
                    Total_Salary = Search_By_TotalSalary(players,clubname);
                    if(Total_Salary==-1) System.out.println("No such Club with this name");
                    else System.out.println("Total Yearly salary of " + clubname + " is: " + Total_Salary);
                    break;

                case 5: 
                    System.out.println("Back to the Main Menu");
                    return;
                default:
                    System.out.println("Invalid Input. Please give input again");
                    break;

            }
        }
    }
    
}
