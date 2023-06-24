package FountainOfObjects.Grid;

import FountainOfObjects.Controller.Coordinate;
import FountainOfObjects.Room.Fountain;
import FountainOfObjects.Room.Pit;
import FountainOfObjects.Room.Room;
import java.util.HashMap;
import java.util.Random;

public class Grid {

    public enum Size {
        SMALL(4), MEDIUM(6), LARGE(8);
        private final int areaNumber;

        Size(int areaNumber) {
            this.areaNumber = areaNumber;
        }

        public int getAreaNumber() {
            return areaNumber;
        }
    }

    private final HashMap<Coordinate, Room> map = new HashMap<>();
    //Exit can be the same as Entrance, so the message will be different
    //Only if the exit is different as entrance, does a player see a different message;
    private Coordinate entrance;
    private Coordinate exit;
    private Coordinate fountain;
    private Coordinate pit;
    private int width;
    private int height;
    private Size size;
    private Random random = new Random();

    //Custom Map
    public Grid(Coordinate entrance, Coordinate exit, Coordinate fountain, int width, int height) {
        this.entrance = entrance;
        this.exit = exit;
        this.fountain = fountain;
        this.width = width;
        this.height = height;
        populateMap();
    }

    //Standard map size(s) with custom entrance, exit and fountain locations;
    public Grid(Coordinate entrance, Coordinate exit, Coordinate fountain, Size size) {
        this.entrance = entrance;
        this.exit = exit;
        this.fountain = fountain;
        this.size = size;
        populateMap();
    }

    //Standard sizes(s) with custom fountain location;
    public Grid(Size size, Coordinate fountain) {
        entrance = new Coordinate(0, 0);
        exit = new Coordinate(0, 0);
        width = size.getAreaNumber();
        height = size.getAreaNumber();
        this.size = size;
        populateMap();
    }

    //Default
    public Grid() {
        size = Size.SMALL;
        width = size.getAreaNumber();
        height = size.getAreaNumber();
        entrance = new Coordinate(0, 0);
        exit = new Coordinate(0, 0);
        fountain = new Coordinate(2, 0);
        //Randomizes pit
        do {
           pit = new Coordinate(random.nextInt(width), random.nextInt(height));
        } while (pit.equals(entrance) && pit.equals(fountain));

        populateMap();
    }
    //Initializes HashMap only for special maps;
    private void populateMap() {
        map.put(fountain, new Fountain());
    }

    public HashMap<Coordinate, Room> getMap() {
        return map;
    }

    public Coordinate getEntrance() {
        return entrance;
    }

    public Coordinate getExit() {
        return exit;
    }

    public Coordinate getFountain() {
        return fountain;
    }
}
