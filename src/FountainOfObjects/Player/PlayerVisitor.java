package FountainOfObjects.Player;
import FountainOfObjects.Grid.Room.Fountain;
import FountainOfObjects.Grid.Room.Pit;

public interface PlayerVisitor {
    Fountain visit (Fountain fountain);
    Pit visit (Pit pit);
}

