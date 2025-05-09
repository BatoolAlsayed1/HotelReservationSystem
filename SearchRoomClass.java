import java.util.*;

/**
 * Handles searching for available rooms based on user input.
 * Supports search by room type, price range, or availability.
 * 
 * @author
 * Bushra Hussain Habib
 * 202207555
 */
public class SearchRoomClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // [MODIFIED] Renamed scanner from 'kb' to 'input' for standardization

        // Sample list of rooms
        LinkedList<RoomClass> roomsList = new LinkedList<>();
        roomsList.add(new RoomClass(1, "101", "Deluxe", 150.0));
        roomsList.add(new RoomClass(2, "102", "Standard", 100.0));
        roomsList.add(new RoomClass(3, "103", "Deluxe", 180.0));
        roomsList.add(new RoomClass(4, "104", "Suite", 250.0));

        System.out.println("Search options: Type / Price / Availability");
        System.out.print("How would you like to search? ");
        String method = input.nextLine().trim(); // [MODIFIED] Trimmed input to sanitize

        switch (method.toLowerCase()) {
            case "type":
                System.out.println("Available room types: Deluxe, Standard, Suite"); // [MODIFIED] Show available types for user clarity
                System.out.print("Enter a valid room type to search: "); // [MODIFIED] Clear prompt for type
                String inputType = input.nextLine().trim(); // [MODIFIED] Trimmed input

                if (inputType.isEmpty()) {
                    System.out.println("Room type cannot be empty."); // [MODIFIED] Input validation
                } else if (!isValidType(inputType, roomsList)) {
                    System.out.println("Invalid room type entered."); // [MODIFIED] Match against available types
                } else {
                    searchByType(roomsList, inputType);
                }
                break;

            case "price":
                System.out.print("Enter minimum price: ");
                double minPrice = readPositiveDouble(input); // [MODIFIED] Ensure non-negative input

                System.out.print("Enter maximum price: ");
                double maxPrice = readPositiveDouble(input); // [MODIFIED] Ensure non-negative input

                if (minPrice > maxPrice) {
                    System.out.println("Minimum price cannot be greater than maximum price."); // [MODIFIED] Logical range check
                } else {
                    searchByPrice(roomsList, minPrice, maxPrice);
                }
                break;

            case "availability":
                searchByAvailability(roomsList);
                break;

            default:
                System.out.println("Invalid search method!");
        }

        input.close();
    }

    // [MODIFIED] New helper method to check if type is valid
    private static boolean isValidType(String type, List<RoomClass> roomsList) {
        for (RoomClass room : roomsList) {
            if (room.getType().equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }

    // [MODIFIED] New helper method to enforce valid numeric input
    private static double readPositiveDouble(Scanner input) {
        while (true) {
            try {
                double value = Double.parseDouble(input.nextLine().trim()); // [MODIFIED] Trimmed input
                if (value < 0) {
                    System.out.print("Please enter a non-negative value: ");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }

    // Search rooms by type
    public static void searchByType(LinkedList<RoomClass> roomsList, String type) {
        boolean matchFound = false;
        for (RoomClass room : roomsList) {
            if (room.getType().equalsIgnoreCase(type)) {
                System.out.println(room);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No rooms found with type: " + type);
        }
    }

    // Search rooms by price range
    public static void searchByPrice(LinkedList<RoomClass> roomsList, double minPrice, double maxPrice) {
        boolean matchFound = false;
        for (RoomClass room : roomsList) {
            if (room.getPrice() >= minPrice && room.getPrice() <= maxPrice) {
                System.out.println(room);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No rooms found within price range: " + minPrice + " - " + maxPrice);
        }
    }

    // Search available rooms
    public static void searchByAvailability(LinkedList<RoomClass> roomsList) {
        boolean matchFound = false;
        for (RoomClass room : roomsList) {
            if (room.isAvailable()) {
                System.out.println(room);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No available rooms at the moment.");
        }
    }
}
