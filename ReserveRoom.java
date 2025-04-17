import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReserveRoom {
    private List<Room> rooms; // List of rooms
    private List<String> reservations; // List of room reservations

    // Constructor initializes the list of rooms and reservations
    public ReserveRoom(List<Room> rooms) {
        this.rooms = rooms;
        this.reservations = new ArrayList<>();
    }

    // Method to reserve a room for a user
    public String reserveRoom(User user, Room room) {
        // Check if the room is available
        if (!room.isAvailable()) {
            return "Room " + room.getNumber() + " is already reserved.";
        }
        // Reserve the room
        room.setAvailable(false); // Mark the room as unavailable
        reservations.add("User " + user.getName() + " reserved room " + room.getNumber());

        return "Room " + room.getNumber() + " reserved successfully for " + user.getName() + ".";
    }
    // Method to view available rooms
    public void displayAvailableRooms() {
        boolean foundAvailableRoom = false;
        for (Room room : rooms) {
            if (room.isAvailable()) {
                if (!foundAvailableRoom) {
                    System.out.println("Available rooms:");
                }
                foundAvailableRoom = true;
                System.out.println("Room Number: " + room.getNumber() + ", Type: " + room.getType() + ", Price: " + room.getPrice());
            }
        }
        if (!foundAvailableRoom) {
            System.out.println("No rooms available .");
        }
    }

    public static void main(String[] args) {
        // Example usage of the ReserveRoom class
        Room room1 = new Room(1, "101", "Single", 100.0);
        Room room2 = new Room(2, "102", "Double", 150.0);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

        ReserveRoom reserveRoom = new ReserveRoom(rooms);

        Scanner scanner = new Scanner(System.in);

        // Display available rooms and let the user reserve a room
        while (true) {
            // Display available rooms before each reservation attempt
            reserveRoom.displayAvailableRooms();

            // If there are no available rooms, break the loop
            if (rooms.stream().noneMatch(Room::isAvailable)) {
                break;
            }

            // Ask the user to select a room
            System.out.print("\nEnter the room number you want to reserve (or type 'exit' to quit): ");
            String roomNumber = scanner.nextLine();

            if (roomNumber.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types "exit"
            }

            // Find the room with the selected room number
            Room selectedRoom = null;
            for (Room room : rooms) {
                if (room.getNumber().equals(roomNumber)) {
                    selectedRoom = room;
                    break;
                }
            }

            // If the room is available, ask for user details and proceed with reservation
            if (selectedRoom != null && selectedRoom.isAvailable()) {
                System.out.println("Room " + selectedRoom.getNumber() + " is available. Please enter your details to reserve it.");

                // Ask for user details
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your email: ");
                String email = scanner.nextLine();

                // Create a User object with the provided details
                User user = new User( name, email);  

                // Proceed with reservation
                System.out.println(reserveRoom.reserveRoom(user, selectedRoom));

            } else if (selectedRoom != null && !selectedRoom.isAvailable()) {
                System.out.println("Sorry, room " + selectedRoom.getNumber() + " is already reserved.");
            } else {
                System.out.println("Room not found. Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }
}