package FountainOfObjects.Grid.Room;

import FountainOfObjects.Player.PlayerVisitor;

public class Pit implements Room {

    boolean trapped = false;

    public boolean isTrapped() {
        return trapped;
    }

    public void setTrapped(boolean trapped) {
        this.trapped = trapped;
    }

    @Override
    public void accept(PlayerVisitor playerVisitor) {
        playerVisitor.visit(this);
    }

    @Override
    public String getRoomDescription() {
        return "you fell into the pit!";
    }
}
