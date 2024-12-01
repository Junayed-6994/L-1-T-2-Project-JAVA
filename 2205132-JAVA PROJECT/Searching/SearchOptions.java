package Searching;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import PlayerInfo.Player;
import static Utilities.SearchPlayers.*;


public class SearchOptions{

    public static void searchingplayers(ArrayList<Player> players)
    {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("Player Searching Options:");
            System.out.println("1. By Player Name");
            System.out.println("2. By Club and Country");
            System.out.println("3. By Position");
            System.out.println("4. By Salary Range");
            System.out.println("5. Country-wise Player Count");
            System.out.println("6. Back to Main Menu");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) 
            {
                case 1: 
                    System.out.println("Enter the name of the player");
                    String str = sc.nextLine().trim();
                    Player BY_Name = Search_By_Name(players,str);
                    if(BY_Name!=null) System.out.println(BY_Name.toString());
                    else System.out.println("No player found with the given name.");     
                    break;

                case 2: 
                    System.out.println("Enter a Country Name");
                    String country = sc.nextLine().trim();
                    System.out.println("Enter a Club Name");
                    String club = sc.nextLine().trim();
                    ArrayList<Player> BY_Club_n_Country = Search_By_Club_n_Country(players,country,club);
                    if(BY_Club_n_Country.size()>0) 
                    {
                        for(int i=0;i<BY_Club_n_Country.size();i++)
                        {
                            System.out.println(BY_Club_n_Country.get(i).toString());
                        }
                    }
                    else System.out.println("No such player with this country and club");
                    break;

                case 3: 
                    System.out.println("Enter the position of the player");
                    String position = sc.nextLine().trim();
                    ArrayList<Player> BY_Position = Search_By_Position(players,position);
                    if(BY_Position.size()>0) 
                    {
                        for(int i=0;i<BY_Position.size();i++)
                        {
                            System.out.println(BY_Position.get(i).getName());
                        }
                    }
                    else System.out.println("No such player with this position");
                    break;

                case 4: 
                    System.out.println("Enter the starting salary range:");
                    double start = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter the ending salary range:");
                    double end = sc.nextDouble();
                    ArrayList<Player> BY_Salary = Search_By_Salary_Range(players,start,end);
                    if(BY_Salary.size()>0) 
                    {
                        for(int i=0;i<BY_Salary.size();i++)
                        {
                            System.out.println(BY_Salary.get(i).getName());
                        }
                    }
                    else System.out.println("No such players with this weekly salary range");
                    break;

                case 5: 
                    HashMap<String,Integer> PlayerCount = Search_By_PlayerCount(players);
                    PlayerCount.forEach((key,value) -> System.out.println("Country: "+ key +"\nPlayers: "+ value +"\n"));
                    break;
                    
                case 6: 
                    System.out.println("Back to Main Menu");
                    return;
                default:
                    System.out.println("Invalid Input. Please give input again");
                    break;

            }
        }
    }
    
}
