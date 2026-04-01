import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create large dataset of bogie capacities
        List<Integer> capacities = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            capacities.add(50 + (int)(Math.random() * 50));
        }
        
        System.out.println("Dataset Size: " + capacities.size() + " bogies");
        System.out.println("Filtering bogies with capacity > 60");
        System.out.println();
        
        // Method 1: Traditional Loop
        long startLoop = System.nanoTime();
        
        List<Integer> loopResult = new ArrayList<>();
        for (int cap : capacities) {
            if (cap > 60) {
                loopResult.add(cap);
            }
        }
        
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;
        
        System.out.println("Loop Approach:");
        System.out.println("  Filtered count: " + loopResult.size());
        System.out.println("  Time: " + loopTime / 1000000 + " ms");
        
        // Method 2: Stream Approach
        long startStream = System.nanoTime();
        
        List<Integer> streamResult = capacities.stream()
            .filter(cap -> cap > 60)
            .collect(Collectors.toList());
        
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;
        
        System.out.println("\nStream Approach:");
        System.out.println("  Filtered count: " + streamResult.size());
        System.out.println("  Time: " + streamTime / 1000000 + " ms");
        
        // Compare results
        System.out.println("\nComparison:");
        System.out.println("  Results match: " + loopResult.equals(streamResult));
        
        if (loopTime < streamTime) {
            System.out.println("  Loop was faster by " + (streamTime - loopTime) / 1000000 + " ms");
        } else {
            System.out.println("  Stream was faster by " + (loopTime - streamTime) / 1000000 + " ms");
        }
    }
}
