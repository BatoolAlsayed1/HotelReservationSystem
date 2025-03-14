import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testUserCreation() {
        User user = new User("John Doe", "john@example.com");

        assertNotNull(user);
        assertEquals("John Doe", user.getName());
        assertEquals("john@example.com", user.getEmail());
        assertTrue(user.getId() > 0);
    }

    @Test
    void testSetName() {
        User user = new User("John Doe", "john@example.com");
        user.setName("Jane Doe");

        assertEquals("Jane Doe", user.getName());
    }

    @Test
    void testSetEmail() {
        User user = new User("John Doe", "john@example.com");
        user.setEmail("jane@example.com");

        assertEquals("jane@example.com", user.getEmail());
    }

    @Test
    void testSetId() {
        User user = new User("John Doe", "john@example.com");
        user.setId(100);

        assertEquals(100, user.getId());
    }

    @Test
    void testToString() {
        User user = new User("John Doe", "john@example.com");
        String expected = "User{id=" + user.getId() + ", name='John Doe', email='john@example.com'}";

        assertEquals(expected, user.toString());
    }
}