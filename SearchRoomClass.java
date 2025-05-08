import java.util.*;

/**
 * Handles searching for available rooms based on user input.
 * 
 * @author Bushra Hussain Habib 202207555
 */
public class SearchRoomClass {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Sample rooms
        LinkedList<RoomClass> roomsList = new LinkedList<>();
        roomsList.add(new RoomClass(1, "101", "Deluxe", 150.0));
        roomsList.add(new RoomClass(2, "102", "Standard", 100.0));
        roomsList.add(new RoomClass(3, "103", "Deluxe", 180.0));
        roomsList.add(new RoomClass(4, "104", "Suite", 250.0));

        // Ask user what parameter they want to search by
        System.out.println("What will you use to search? (Type/Price/Availability)");
        String method = kb.nextLine();
        System.out.println("Enter " + method + ":");

        if (method.equalsIgnoreCase("Type")) {
            String inputType = kb.nextLine();
            searchByType(roomsList, inputType);
        } else if (method.equalsIgnoreCase("Price")) {
            System.out.println("Enter minimum price:");
            double minPrice = kb.nextDouble();
            System.out.println("Enter maximum price:");
            double maxPrice = kb.nextDouble();
            searchByPrice(roomsList, minPrice, maxPrice);
        } else if (method.equalsIgnoreCase("Availability")) {
            searchByAvailability(roomsList);
        } else {
            System.out.println("Invalid search method!");
        }

        kb.close();
    }

    // Search rooms by type
    public static void searchByType(LinkedList<RoomClass> roomsList, String type) {
        boolean found = false;
        for (RoomClass room : roomsList) {
            if (room.getType().equalsIgnoreCase(type)) {
                System.out.println(room);
                found = true;
            }
        }
        if (!found)
            System.out.println("No rooms found with type: " + type);
    }

    // Search rooms by price range
    public static void searchByPrice(LinkedList<RoomClass> roomsList, double minPrice, double maxPrice) {
        boolean found = false;
        for (RoomClass room : roomsList) {
            if (room.getPrice() >= minPrice && room.getPrice() <= maxPrice) {
                System.out.println(room);
                found = true;
            }
        }
        if (!found)
            System.out.println("No rooms found within price range: " + minPrice + " - " + maxPrice);
    }

    // Search available rooms
    public static void searchByAvailability(LinkedList<RoomClass> roomsList) {
        boolean found = false;
        for (RoomClass room : roomsList) {
            if (room.isAvailable()) {
                System.out.println(room);
                found = true;
            }
        }
        if (!found)
            System.out.println("No available rooms at the moment.");
    }
}
