package Menu;

import java.util.ArrayList;

import static PlayerInfo.Load.loadplayers;
import static Menu.MainMenu.menu;
import PlayerInfo.Player;

public class Main{
    public static void main(String[] args)
    {
        ArrayList<Player> players = new ArrayList<>(loadplayers());
        menu(players);
    }

}