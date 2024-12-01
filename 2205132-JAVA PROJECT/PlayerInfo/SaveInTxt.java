package PlayerInfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveInTxt {
    
    public static void save(ArrayList<Player> players)
    {
        String INPUT_FILE_NAME = "players.txt";
        //Reading the file and matching the name
        ArrayList<String> previousplayers = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
            String line;
            while ((line = br.readLine()) != null)
            {
                String[] details = line.split(",");
                if(details.length>0)
                {
                    previousplayers.add(details[0].trim());
                }
            }
            br.close();
        }
        catch (IOException e)
        {
            System.out.println("Error loading players from file: " + e.getMessage());
        }

        try
        {
            FileWriter fw = new FileWriter(INPUT_FILE_NAME,true);
            for(int j=0;j<players.size();j++)
            {
                if(!previousplayers.contains(players.get(j).getName()))
                {
                    fw.write("\n" +
                    players.get(j).getName() + "," +
                    players.get(j).getCountry() + "," +
                    players.get(j).getAge() + "," +
                    players.get(j).getHeight() + "," +
                    players.get(j).getClub() + "," +
                    players.get(j).getPosition() + "," +
                    (players.get(j).getJersey_Number() != -1 ? players.get(j).getJersey_Number() : "") + "," +
                    players.get(j).getWeekly_Salary());
                }
            }
            fw.close();
        }

        catch (IOException e)
        {
            System.out.println("Error Writing players in the file: " + e.getMessage());
        }

    }
}
