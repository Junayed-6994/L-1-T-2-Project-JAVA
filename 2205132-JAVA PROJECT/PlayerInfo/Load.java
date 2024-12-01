package PlayerInfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Load {

    private static final String INPUT_FILE_NAME = "players.txt";
    //private static final String OUTPUT_FILE_NAME = "out.txt";

    private static ArrayList<Player> players = new ArrayList<>();


    public static ArrayList<Player> loadplayers()
    {
        //Reading the file and storing player info
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
            String line;
            while ((line = br.readLine()) != null)
            {
                if(!line.trim().isEmpty()) //Ensuring Line not empty
                {
                    String[] details=line.split(",");
                    if(details.length==8) //Ensuring all fields are there
                    {
                        String Name = details[0].trim();
                        String Country = details[1].trim();
                        int Age = Integer.parseInt(details[2].trim());
                        double Height = Double.parseDouble(details[3].trim());
                        String Club = details[4].trim();
                        String Position = details[5].trim();
                        int Jersey_Number = 0;
                        int Weekly_Salary = 0;
                        if(details[6].trim().isEmpty())
                        {
                            Jersey_Number=-1;
                            Weekly_Salary=Integer.parseInt(details[7].trim());
                        }
                        else
                        {
                            Jersey_Number=Integer.parseInt(details[6].trim());
                            Weekly_Salary=Integer.parseInt(details[7].trim());
                        }
                        players.add(new Player(Name, Country, Age, Height, Club, Position, Jersey_Number, Weekly_Salary));
                    }
                }
            }
            br.close();
        }
        catch (IOException e)
        {
            System.out.println("Error loading players from file: " + e.getMessage());
        }
        return players;
    }
}