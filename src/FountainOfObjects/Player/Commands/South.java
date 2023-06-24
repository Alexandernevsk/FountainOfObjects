package FountainOfObjects.Player.Commands;

import FountainOfObjects.Player.Player;

class South implements PlayerCommands {
    @Override
    public void setAction(Player player) {
        player.setColumn(-1);
    }
}
