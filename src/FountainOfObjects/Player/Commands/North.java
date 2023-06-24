package FountainOfObjects.Player.Commands;

import FountainOfObjects.Player.Player;

class North implements PlayerCommands {
    @Override
    public void setAction(Player player) {
        player.setColumn(1);
    }
}
