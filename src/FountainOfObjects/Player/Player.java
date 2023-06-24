package FountainOfObjects.Player;

import FountainOfObjects.Controller.Coordinate;
import FountainOfObjects.Player.Commands.OnCommand;
import FountainOfObjects.Player.Commands.PlayerCommands;
import FountainOfObjects.Room.Fountain;
import FountainOfObjects.Room.Pit;

public class Player implements PlayerVisitor {
    private Coordinate playerCoordinate;
    private boolean switchFountain;

    public Player(Coordinate playerCoordinate) {
        this.playerCoordinate = playerCoordinate;
    }

    public void setRow(int row) {
        playerCoordinate = new Coordinate(playerCoordinate.row() + row, 0);
    }

    public void setColumn(int column) {
        playerCoordinate = new Coordinate(0, playerCoordinate.column() + column);
    }

    public Coordinate getPlayerCoordinate() {
        return playerCoordinate;
    }

    public void executeAction(PlayerCommands playerCommands) {
        playerCommands.setAction(this);
    }

    public void setSwitchFountain(boolean switchFountain) {
        this.switchFountain = switchFountain;
    }

    @Override
    public void visit(Fountain fountain) {
        fountain.setOn(switchFountain);
    }

    @Override
    public void visit(Pit pit) {
        pit.setTrapped(true);
    }
}
