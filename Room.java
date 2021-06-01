import java.util.ArrayList;

public class Room {
    private String roomType;
    private ArrayList<Reservation> booked = new ArrayList<Reservation>();

    public String getRoomType() {
        return roomType;
    }

    public ArrayList<Reservation> getBooked() {
        return booked;
    }


}
