package FountainOfObjects.Player;
import FountainOfObjects.Room.Fountain;
import FountainOfObjects.Room.Pit;

public interface PlayerVisitor {
    void visit (Fountain fountain);
    void visit (Pit pit);
}

