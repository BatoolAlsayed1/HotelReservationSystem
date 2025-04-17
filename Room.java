/** Represents a book object with its details.
 @author Batool Sayed Ebrahim Ahmed 202109262
 */
public class Room{
    private int id;
    private String number, type;
    private double price;
    private boolean available;

    // Default constructor
    public Room() {
        this.id = 0;
        this.number = "";
        this.type = "";
        this.price = 0.0;
        this.available = true;
    }

    // Parameterized constructor
    public Room(int id, String number, String type, double price) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.price = price;
        this.available = true; // By default, new rooms should be available
    }

    // Getters
    public int getId() { return id; }
    public String getNumber() { return number; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }

    //Setters
    public void setId(int id) { this.id = id; }
    public void setNumber(String number) { this.number = number; }
    public void setType(String type) { this.type = type; }
    public void setPrice(double price) { this.price = price; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return "Room{id=" + id + ", number='" + number + "', type='" + type + "', price=" + price + ", available=" + available + "}";
    }
}