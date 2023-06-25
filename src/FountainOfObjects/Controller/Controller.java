package FountainOfObjects.Controller;

import FountainOfObjects.Grid.Grid;
import FountainOfObjects.Grid.Room.Fountain;
import FountainOfObjects.Grid.Room.Pit;
import FountainOfObjects.Player.Player;


public class Controller {
    private Player player;
    private Grid grid;

    public Controller() {
        this.player = new Player(new Coordinate(0, 0));
        this.grid = new Grid();
    }

    public Player getPlayer() {
        return player;
    }

    public Grid getGrid() {
        return grid;
    }

    public boolean illegalMove() {
        if (player.getPlayerCoordinate().column() - 1 >= 0 && player.getPlayerCoordinate().row() - 1 >= 0) {
            return true;
        } else
            return player.getPlayerCoordinate().row() + 1 < grid.getWidth() && player.getPlayerCoordinate().column() + 1 < grid.getHeight();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
    }

    public boolean atFountain() {
        return player.getPlayerCoordinate().equals(grid.getFountain());
    }
}
