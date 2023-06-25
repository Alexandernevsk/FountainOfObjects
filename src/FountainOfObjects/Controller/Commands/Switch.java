package FountainOfObjects.Controller.Commands;

import FountainOfObjects.Controller.Controller;
import FountainOfObjects.Grid.Room.Room;

public class Switch implements PlayerCommands {
    @Override
    public void setAction(Controller controller) {
        Room room = controller.getGrid().getMap().get(controller.getPlayer().getPlayerCoordinate());
        if(controller.atFountain()){

        }
    }
}
