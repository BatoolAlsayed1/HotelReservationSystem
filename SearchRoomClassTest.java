import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * JUnit test class for SearchRoomClass functionality.
 * Tests searching by type, price, and availability.
 * 
 * @author Bushra
 */
class SearchRoomClassTest {
    private LinkedList<RoomClass> roomsList;

    @BeforeEach
    void setUp() {
        roomsList = new LinkedList<>();
        roomsList.add(new RoomClass(1, "101", "Deluxe", 150.0));
        roomsList.add(new RoomClass(2, "102", "Standard", 100.0));
        roomsList.add(new RoomClass(3, "103", "Deluxe", 180.0));
        roomsList.add(new RoomClass(4, "104", "Suite", 250.0));
        roomsList.get(1).setAvailable(false); // Mark room 102 as unavailable
    }

    @Test
    void testSearchByType() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SearchRoomClass.searchByType(roomsList, "Deluxe");
        String output = outContent.toString().trim();

        assertTrue(output.contains("Room{id=1, number='101', type='Deluxe', price=150.0, available=true}"));
        assertTrue(output.contains("Room{id=3, number='103', type='Deluxe', price=180.0, available=true}"));
    }

    @Test
    void testSearchByPrice() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SearchRoomClass.searchByPrice(roomsList, 100, 180);
        String output = outContent.toString().trim();

        assertTrue(output.contains("Room{id=1, number='101', type='Deluxe', price=150.0, available=true}"));
        assertTrue(output.contains("Room{id=2, number='102', type='Standard', price=100.0, available=false}"));
    }

    @Test
    void testSearchByAvailability() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SearchRoomClass.searchByAvailability(roomsList);
        String output = outContent.toString().trim();

        assertTrue(output.contains("Room{id=1, number='101', type='Deluxe', price=150.0, available=true}"));
        assertTrue(output.contains("Room{id=3, number='103', type='Deluxe', price=180.0, available=true}"));
        assertTrue(output.contains("Room{id=4, number='104', type='Suite', price=250.0, available=true}"));
        assertFalse(output.contains("Room{id=2, number='102', type='Standard', price=100.0, available=false}"));
    }
}