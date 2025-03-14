import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ReserveRoomTest {
    private ReserveRoom reserveRoom;
    private Room room1, room2;
    private User user;

    @BeforeEach
    void setUp() {
        // Initialize rooms
        room1 = new Room(1, "101", "Single", 100.0);
        room2 = new Room(2, "102", "Double", 150.0);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

        // Initialize ReserveRoom instance
        reserveRoom = new ReserveRoom(rooms);

        // Initialize a user
        user = new User("John Doe", "john@example.com");
    }

    @Test
    void testReserveAvailableRoom() {
        String result = reserveRoom.reserveRoom(user, room1);
        assertEquals("Room 101 reserved successfully for John Doe.", result);
        assertFalse(room1.isAvailable()); // Ensure room is marked as unavailable
    }

    @Test
    void testReserveAlreadyReservedRoom() {
        room1.setAvailable(false); // Manually set room as unavailable
        String result = reserveRoom.reserveRoom(user, room1);
        assertEquals("Room 101 is already reserved.", result);
    }

    @Test
    void testDisplayAvailableRooms() {
        room1.setAvailable(false); // Make one room unavailable
        reserveRoom.displayAvailableRooms(); // Should only display room2
        assertTrue(room2.isAvailable());
        assertFalse(room1.isAvailable());
    }
}
