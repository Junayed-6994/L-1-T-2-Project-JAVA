package Searching;
import java.util.ArrayList;
import java.util.Scanner;

import PlayerInfo.Player;
import static Utilities.AddingCheck.*;

public class AddPlayers {

    public static Player addingplayer(ArrayList<Player> players)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Adding a Player in the Database: ");

        String Name = inputname();
        String Country = inputcountry();
        int Age = inputage();
        double Height = inputheight();
        String Club = inputclub();
        String Position = inputposition();
        int Jersey_Number = inputjersey();
        int Weekly_Salary = inputsalary();


        for(int i=0;i<players.size();i++)
        {
            if(players.get(i).getName().equalsIgnoreCase(Name))
            {
                return null;
            }
        }

        return new Player(Name, Country, Age, Height, Club, Position, Jersey_Number, Weekly_Salary);
    }
}
