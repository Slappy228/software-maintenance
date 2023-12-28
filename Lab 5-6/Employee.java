import java.util.*;

public class Employee {
    private String name;
    private String position;
    private List<String> previousPositions;
    private AccessCard accessCard;
    private List<Room> assignedRooms;

    public Employee(String name, String position, AccessCard accessCard) {
        this.name = name;
        this.position = position;
        this.accessCard = accessCard;
        this.previousPositions = new ArrayList<>();
        this.assignedRooms = new ArrayList<>();
    }

    public void addPreviousPosition(String previousPosition) {
        this.previousPositions.add(previousPosition);
    }

    public void assignRoom(Room room) {
        this.assignedRooms.add(room);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public List<String> getPreviousPositions() {
        return previousPositions;
    }

    public AccessCard getAccessCard() {
        return accessCard;
    }

    public List<Room> getAssignedRooms() {
        return assignedRooms;
    }
}