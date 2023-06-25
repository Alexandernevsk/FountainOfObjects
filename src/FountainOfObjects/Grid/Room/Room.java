package FountainOfObjects.Grid.Room;

import FountainOfObjects.Player.PlayerVisitor;

public interface Room {
    void accept (PlayerVisitor playerVisitor);
    String getRoomDescription();
}
