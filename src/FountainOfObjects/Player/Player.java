package FountainOfObjects.Player;

import FountainOfObjects.Controller.Coordinate;
import FountainOfObjects.Grid.Room.Fountain;
import FountainOfObjects.Grid.Room.Pit;

public class Player implements PlayerVisitor {
    private Coordinate playerCoordinate;
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
    @Override
    public Fountain visit(Fountain fountain) {
        return fountain;
    }


    @Override
    public Pit visit(Pit pit) {
        return pit;
    }
}
