import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Define regex patterns
        String trainIdPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";
        
        // Test inputs
        String trainId1 = "TRN-1234";
        String trainId2 = "TRAIN12";
        String cargoCode1 = "PET-AB";
        String cargoCode2 = "PET-ab";
        
        // Validate Train IDs
        System.out.println("Train ID Validation:");
        System.out.println(trainId1 + " : " + trainId1.matches(trainIdPattern));
        System.out.println(trainId2 + " : " + trainId2.matches(trainIdPattern));
        
        System.out.println("\nCargo Code Validation:");
        System.out.println(cargoCode1 + " : " + cargoCode1.matches(cargoCodePattern));
        System.out.println(cargoCode2 + " : " + cargoCode2.matches(cargoCodePattern));
    }
}
