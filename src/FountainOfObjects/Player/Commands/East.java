package FountainOfObjects.Player.Commands;

import FountainOfObjects.Player.Player;

class East implements PlayerCommands {
    @Override
    public void setAction(Player player) {
        player.setRow(1);
    }
}
