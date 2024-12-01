package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import PlayerInfo.Player;
import static PlayerInfo.SaveInTxt.save;
import static Searching.AddPlayers.addingplayer;
import static Searching.SearchClubOptions.searchingclubs;
import static Searching.SearchOptions.searchingplayers;


public class MainMenu {
    
    public static void menu(ArrayList<Player> players)
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("Main Menu Page: ");
            System.out.println("1. Search Players Page: ");
            System.out.println("2. Search Clubs Page: ");
            System.out.println("3. Add Players Page: ");
            System.out.println("4. Exit The System: ");

            int choice = sc.nextInt();
            sc.nextLine(); //Consuming Newline

            switch(choice)
            {
                case 1:
                    searchingplayers(players);
                    break;
                case 2:
                    searchingclubs(players);
                    break;
                case 3:
                    Player player = addingplayer(players);
                    if(player==null) System.out.println("Player with this name already exists");
                    else players.add(player);
                    break;
                case 4:
                    save(players);
                    System.out.println("We are exiting the system succesfully.Hope you've enjoyed it!");
                    return;
                default:
                    System.out.println("Invalid Input. Please give input again");
                    break;
            }

        }
    }
}
