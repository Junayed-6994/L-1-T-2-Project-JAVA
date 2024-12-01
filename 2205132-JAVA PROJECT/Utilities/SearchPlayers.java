package Utilities;
import java.util.ArrayList;
import java.util.HashMap;

import PlayerInfo.Player;


public class SearchPlayers{
  
    public static Player Search_By_Name(ArrayList<Player> players, String str)
    {
        for(int i=0;i<players.size();i++)
        {
            if(players.get(i).getName().equalsIgnoreCase(str))
            {
                return players.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Player> Search_By_Club_n_Country(ArrayList<Player> players, String country, String club)
    {
        ArrayList<Player> temp = new ArrayList<>();
        
        for(int i=0;i<players.size();i++)
        {
            if(club.equalsIgnoreCase("ANY") && players.get(i).getCountry().equalsIgnoreCase(country))
            {
                temp.add(players.get(i));
            }
            else if(players.get(i).getCountry().equalsIgnoreCase(country) && players.get(i).getClub().equalsIgnoreCase(club))
            {
                temp.add(players.get(i));
            }
        }
        return temp;
    }

    public static ArrayList<Player> Search_By_Position(ArrayList<Player> players, String position)
    {
        ArrayList<Player> temp = new ArrayList<>();
        for(int i=0;i<players.size();i++)
        {
            if(players.get(i).getPosition().equalsIgnoreCase(position))
            {
                temp.add(players.get(i));
            }
        }
        return temp;
    }

    public static ArrayList<Player> Search_By_Salary_Range(ArrayList<Player> players, double start, double end)
    {
        ArrayList<Player> temp = new ArrayList<>();
        for(int i=0;i<players.size();i++)
        {
            int salary = players.get(i).getWeekly_Salary();
            if(salary>=start && salary<=end)
            {
                temp.add(players.get(i));
            }
        }
        return temp;
    }

    public static HashMap<String,Integer> Search_By_PlayerCount(ArrayList<Player> players)
    {
        HashMap<String,Integer> my_map= new HashMap<>();
        for(int i=0;i<players.size();i++)
        {
            String country = players.get(i).getCountry();
            if(my_map.containsKey(country))
            {
                my_map.put(country,my_map.get(country)+1);
            }
            else
            {
                my_map.put(country,1);
            }
        }

        return my_map;
    }

}
