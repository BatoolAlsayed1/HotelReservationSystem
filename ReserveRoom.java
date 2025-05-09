import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReserveRoom {
    private List<Room> rooms;         
    private List<String> reservations;  

    public ReserveRoom(List<Room> rooms) {
        this.rooms = rooms;
        this.reservations = new ArrayList<>();
    }
    private User promptUserDetails(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();  // Trims whitespace
        System.out.print("Enter your email: ");
        String email = scanner.nextLine().trim();  // Trims whitespace
        return new User(name, email);
    }

    public String reserveRoom(User user, Room room) {
        if (!room.isAvailable()) {
            return "Room " + room.getNumber() + " is already reserved.";
        }
        room.setAvailable(false);
        reservations.add("User " + user.getName() + " reserved room " + room.getNumber());
        return "Room " + room.getNumber() + " reserved successfully for " + user.getName() + ".";
    }

    public void displayAvailableRooms() {
        boolean hasAvailableRooms = false;
        for (Room room : rooms) {
            if (room.isAvailable()) {
                if (!found) {
                    System.out.println("\nAvailable rooms:");
                }
                found = true;
                System.out.printf("Room Number: %s, Type: %s, Price: %.2f%n",
                                  room.getNumber(), room.getType(), room.getPrice());
            }
        }
        if (!found) {
            System.out.println("\nNo rooms available.");
        }
    }

    public static void main(String[] args) {

        Room room1 = new Room(1, "101", "Single", 100.0);
        Room room2 = new Room(2, "102", "Double", 150.0);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

        ReserveRoom reserveRoom = new ReserveRoom(rooms);
        Scanner scanner = new Scanner(System.in);


        User user = reserveRoom.promptUserDetails(scanner);


        while (rooms.stream().anyMatch(Room::isAvailable)) {
            reserveRoom.displayAvailableRooms();

            System.out.print("\nEnter the room number to reserve (or 'exit'): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("exit")) {
                break;
            }

            Room selectedRoom = null;
            for (Room r : rooms) {
                if (r.getNumber().equals(choice)) {
                    selectedRoom = r;
                    break;
                }
            }

            if (selectedRoom == null) {
                System.out.println("Room not found. Please try again.");
            } else {
                System.out.println(reserveRoom.reserveRoom(user, selectedRoom));
            }
            System.out.println();
        }


        System.out.println("Your reservations:");
        for (String rec : reserveRoom.reservations) {
            System.out.println(rec);
        }

        scanner.close();
    }
}