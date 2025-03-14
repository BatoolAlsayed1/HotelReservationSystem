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
        user.setName("Ali Ahmed");

        assertEquals("Ali Ahmed", user.getName());
    }

    @Test
    void testSetEmail() {
        User user = new User("John Doe", "john@example.com");
        user.setEmail("Ali@gmail.com");

        assertEquals("Ali@gmail.com", user.getEmail());
    }

    @Test
    void testSetId() {
        User user = new User("John Doe", "john@example.com");
        user.setId(300);
        
        assertEquals(300, user.getId());
    }

    @Test
    void testToString() {
        User user = new User("John Doe", "john@example.com");
        String expected = "User{id=" + user.getId() + ", name='John Doe', email='john@example.com'}";

        assertEquals(expected, user.toString());
    }
}