package FountainOfObjects.Room;

import FountainOfObjects.Player.PlayerVisitor;

public class Fountain implements Room {
    boolean isOn;

    //Initializes the Fountain to start turned off;
    public Fountain() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void accept(PlayerVisitor playerVisitor) {
        playerVisitor.visit(this);
    }

    //Room description depends on the state of the fountain.
    @Override
    public String getRoomDescription() {
        return isOn() ? "You hear the rushing waters from the Fountain of Objects. It has reactivated!" :
                "You hear water dripping in this room. The Fountain of objects is here!";
    }
}
