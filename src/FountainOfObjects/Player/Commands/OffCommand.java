package FountainOfObjects.Player.Commands;

import FountainOfObjects.Player.Player;

public class OffCommand implements PlayerCommands{
    @Override
    public void setAction(Player player) {
        player.setSwitchFountain(false);
    }
}
