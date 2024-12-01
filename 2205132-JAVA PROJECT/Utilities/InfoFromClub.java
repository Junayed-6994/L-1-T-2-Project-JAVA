package Utilities;
import java.util.ArrayList;

import PlayerInfo.Player;

public class InfoFromClub {

    public static ArrayList<Player> Search_By_MaxSalary(ArrayList<Player> players, String clubname)
    {
        ArrayList<Player> salary= new ArrayList<>();
        double max_salary = 0;
        for(int i=0;i<players.size();i++)
        {
            if(players.get(i).getClub().equalsIgnoreCase(clubname))
            {
                double player_salary = players.get(i).getWeekly_Salary();
                if(player_salary>max_salary)
                {
                    max_salary=player_salary;
                    salary.clear();
                    salary.add(players.get(i));
                }
                else if(player_salary==max_salary)
                {
                    salary.add(players.get(i));
                }
            }
        }
        return salary;
    }

    public static ArrayList<Player> Search_By_MaxAge(ArrayList<Player> players, String clubname )
    {
        ArrayList<Player> age= new ArrayList<>();
        double max_age = 0;
        for(int i=0;i<players.size();i++)
        {
            if(players.get(i).getClub().equalsIgnoreCase(clubname))
            {
                double player_age = players.get(i).getAge();
                if(player_age>max_age)
                {
                    max_age=player_age;
                    age.clear();
                    age.add(players.get(i));
                }
                else if(player_age==max_age)
                {
                    age.add(players.get(i));
                }
            }
        }
        return age;
    }

    public static ArrayList<Player> Search_By_MaxHeight(ArrayList<Player> players, String clubname )
    {
        ArrayList<Player> height= new ArrayList<>();
        double max_height = 0;
        for(int i=0;i<players.size();i++)
        {
            if(players.get(i).getClub().equalsIgnoreCase(clubname))
            {
                double player_height = players.get(i).getHeight();
                if(player_height>max_height)
                {
                    max_height=player_height;
                    height.clear();
                    height.add(players.get(i));
                }
                else if(player_height==max_height)
                {
                    height.add(players.get(i));
                }
            }
        }
        return height;
    }

    public static double Search_By_TotalSalary(ArrayList<Player> players, String clubname )
    {
        double total_salary = 0;
        for(int i=0;i<players.size();i++)
        {
            if(players.get(i).getClub().equalsIgnoreCase(clubname))
            {
                total_salary+= (players.get(i).getWeekly_Salary()/7)*365;
            }
        }
        return total_salary;
    }
}
    
