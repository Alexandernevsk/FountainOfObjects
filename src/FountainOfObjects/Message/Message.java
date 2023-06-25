package FountainOfObjects.Message;

import FountainOfObjects.Player.Player;
import FountainOfObjects.Grid.Room.Room;
public class Message {
    String[] message;
    AnsiColor[] colors;

    public void setColors(AnsiColor... color) {
        this.colors = color;
    }

    public void setPlayerMessage(Room room, Player player) {
       String[] playerMessage= {room.getRoomDescription(), player.toString()};
       this.message = playerMessage;
    }

    public void getDescription() {
        int counter = 0;
        while(counter < message.length) {
            message[counter] = String.format("%s\n", colors[counter] + message[counter]);
        }
    }

    public void printMessage() {

    }
}

