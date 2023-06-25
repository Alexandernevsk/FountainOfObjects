package FountainOfObjects.Controller.Commands;

import FountainOfObjects.Controller.Controller;

public class South implements PlayerCommands {
    @Override
    public void setAction(Controller controller) {
        if (controller.illegalMove()) {
            controller.getPlayer().setColumn(-1);
        } else System.out.println("Out of bounds");
    }
}
