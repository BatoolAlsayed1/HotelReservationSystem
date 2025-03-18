import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the Room class.
 * Ensures that Room attributes and methods function as expected.
 *
 * @author Bushra Hussain Habib 202207555
 */
class RoomTest {
    private Room room;

    @BeforeEach
    void setUp() {
        room = new Room(1, "101", "Deluxe", 150.0);
    }

    @Test
    void testDefaultConstructor() {
        Room defaultRoom = new Room();
        assertEquals(0, defaultRoom.getId());
        assertEquals("", defaultRoom.getNumber());
        assertEquals("", defaultRoom.getType());
        assertEquals(0.0, defaultRoom.getPrice(), 0.01);
        assertTrue(defaultRoom.isAvailable());
    }

    @Test
    void testParameterizedConstructor() {
        assertEquals(1, room.getId());
        assertEquals("101", room.getNumber());
        assertEquals("Deluxe", room.getType());
        assertEquals(150.0, room.getPrice(), 0.01);
        assertTrue(room.isAvailable());
    }

    @Test
    void testSetters() {
        room.setId(2);
        room.setNumber("102");
        room.setType("Suite");
        room.setPrice(200.0);
        room.setAvailable(false);
    }

    @Test
    void testGetters() {
        assertEquals(1, room.getId());
        assertEquals("101", room.getNumber());
        assertEquals("Deluxe", room.getType());
        assertEquals(150.0, room.getPrice(), 0.01);
        assertTrue(room.isAvailable());
    }

    @Test
    void testToString() {
        String expected = "Room{id=1, number='101', type='Deluxe', price=150.0, available=true}";
        assertEquals(expected, room.toString());
    }
}
