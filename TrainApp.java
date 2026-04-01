import java.util.*;

// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String name;
    int capacity;
    
    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }
    
    public String toString() {
        return name + ":" + capacity + " seats";
    }
}

public class TrainConsistApp {
    
    public static void main(String[] args) {
        System.out.println("=== Adding Passenger Bogies ===");
        
        // Try to add valid bogies
        try {
            PassengerBogie bogie1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Added: " + bogie1);
            
            PassengerBogie bogie2 = new PassengerBogie("AC Chair", 56);
            System.out.println("Added: " + bogie2);
            
            PassengerBogie bogie3 = new PassengerBogie("First Class", 24);
            System.out.println("Added: " + bogie3);
            
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\n=== Testing Invalid Capacities ===");
        
        // Try to add invalid bogies
        try {
            PassengerBogie bogie4 = new PassengerBogie("Invalid", 0);
            System.out.println("Added: " + bogie4);
        } catch (InvalidCapacityException e) {
            System.out.println("Error adding bogie with capacity 0: " + e.getMessage());
        }
        
        try {
            PassengerBogie bogie5 = new PassengerBogie("Invalid", -10);
            System.out.println("Added: " + bogie5);
        } catch (InvalidCapacityException e) {
            System.out.println("Error adding bogie with capacity -10: " + e.getMessage());
        }
    }
}
