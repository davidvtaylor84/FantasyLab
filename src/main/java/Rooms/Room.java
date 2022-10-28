package Rooms;

import enemies.IEnemyAttack;
import players.ITakeDamage;

import java.util.ArrayList;

public abstract class Room{

    private String roomName;
    private String roomDescription;
    private ArrayList<ITakeDamage> players;
    private ArrayList<IEnemyAttack> enemies;
    private ArrayList<RoomDirection> exits;

    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.players = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.exits = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

}
