package FountainOfObjects.Player.Commands;

import FountainOfObjects.Player.Player;

public class West implements PlayerCommands {
    @Override
    public void setAction(Player player) {
        player.setRow(-1);
    }
}
