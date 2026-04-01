import java.util.*;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Grain"));
        
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(b);
        }
        
        // Safety check: Cylindrical bogies must carry only Petroleum
        boolean isSafe = goodsBogies.stream()
            .allMatch(bogie -> 
                !bogie.type.equals("Cylindrical") || bogie.cargo.equals("Petroleum")
            );
        
        System.out.println("\nSafety Compliance Check:");
        if (isSafe) {
            System.out.println("Train is SAFE - All cylindrical bogies carry Petroleum");
        } else {
            System.out.println("Train is UNSAFE - Cylindrical bogies must carry only Petroleum");
        }
        
        // Test with unsafe bogie
        System.out.println("\n=== Testing with Unsafe Configuration ===");
        List<GoodsBogie> unsafeBogies = new ArrayList<>();
        unsafeBogies.add(new GoodsBogie("Cylindrical", "Coal"));
        unsafeBogies.add(new GoodsBogie("Rectangular", "Petroleum"));
        unsafeBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : unsafeBogies) {
            System.out.println(b);
        }
        
        boolean isSafe2 = unsafeBogies.stream()
            .allMatch(bogie -> 
                !bogie.type.equals("Cylindrical") || bogie.cargo.equals("Petroleum")
            );
        
        System.out.println("\nSafety Compliance Check:");
        if (isSafe2) {
            System.out.println("Train is SAFE - All cylindrical bogies carry Petroleum");
        } else {
            System.out.println("Train is UNSAFE - Cylindrical bogies must carry only Petroleum");
        }
    }
}

class GoodsBogie {
    String type;
    String cargo;
    
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
    
    public String toString() {
        return type + ":" + cargo;
    }
}
