import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create list of bogie names with types
        List<String> bogies = Arrays.asList(
            "Sleeper", "AC Chair", "First Class",
            "Sleeper", "AC Chair", "Sleeper"
        );
        
        System.out.println("All Bogies:");
        System.out.println(bogies);
        
        // Group bogies by type using Collectors.groupingBy
        Map<String, List<String>> groupedBogies = bogies.stream()
            .collect(Collectors.groupingBy(bogie -> bogie));
        
        System.out.println("\nGrouped Bogies by Type:");
        groupedBogies.forEach((type, list) -> 
            System.out.println(type + " : " + list + " (Count: " + list.size() + ")"));
    }
}
