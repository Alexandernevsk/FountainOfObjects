package FountainOfObjects.Player.Commands;

import FountainOfObjects.Player.Player;

public class OnCommand implements PlayerCommands {
    @Override
    public void setAction(Player player) {
        player.setSwitchFountain(true);
    }
}
