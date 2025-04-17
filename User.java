/** Represents a book object with its details.
 @author Batool Sayed Ebrahim Ahmed 202109262
 */
public class User {
    private static int nextId = 1;
    private int id;
    private String name;
    private String email;

    // Constructor
    public User(String name, String email) {
        this.id = nextId++;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    // toString method
    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}