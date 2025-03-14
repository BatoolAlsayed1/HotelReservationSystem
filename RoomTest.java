import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testRoomCreation() {
        Room room = new Room(101, "A1", "Single", 150.0);

        assertNotNull(room);
        assertEquals(101, room.getId());
        assertEquals("A1", room.getNumber());
        assertEquals("Single", room.getType());
        assertEquals(150.0, room.getPrice());
        assertTrue(room.isAvailable()); // By default, the room should be available
    }

    @Test
    void testSetId() {
        Room room = new Room();
        room.setId(102);
        assertEquals(102, room.getId());
    }

    @Test
    void testSetNumber() {
        Room room = new Room();
        room.setNumber("B2");
        assertEquals("B2", room.getNumber());
    }

    @Test
    void testSetType() {
        Room room = new Room();
        room.setType("Double");
        assertEquals("Double", room.getType());
    }

    @Test
    void testSetPrice() {
        Room room = new Room();
        room.setPrice(200.0);
        assertEquals(200.0, room.getPrice());
    }

    @Test
    void testSetAvailability() {
        Room room = new Room();
        room.setAvailable(false);
        assertFalse(room.isAvailable());
    }

    @Test
    void testToString() {
        Room room = new Room(103, "C3", "Suite", 300.0);
        String expected = "Room{id=103, number='C3', type='Suite', price=300.0, available=true}";
        assertEquals(expected, room.toString());
    }
}
