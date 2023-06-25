package FountainOfObjects.Controller.Commands;

import FountainOfObjects.Controller.Controller;

public class East implements PlayerCommands {
    @Override
    public void setAction(Controller controller) {
        if (controller.illegalMove()) {
            controller.getPlayer().setRow(1);
        } else System.out.println("Out of bounds");
    }
}
