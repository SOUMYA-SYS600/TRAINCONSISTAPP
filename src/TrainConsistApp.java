import java.util.HashSet;
import java.util.Set;

/**
 * =========================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * =========================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * Ensures duplicate bogie IDs are NOT added using HashSet.
 *
 * Demonstrates:
 * - Set (HashSet)
 * - Automatic duplicate removal
 * - Unique element storage
 *
 * @version 3.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== Display Header =====
        System.out.println("=====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================\n");

        // ===== Create Set for unique bogie IDs =====
        Set<String> bogies = new HashSet<>();

        // ===== Add Bogie IDs (including duplicates) =====
        bogies.add("B6101");
        bogies.add("B6102");
        bogies.add("B6103");
        bogies.add("B6104");

        // Duplicate entries (will be ignored automatically)
        bogies.add("B6101");
        bogies.add("B6102");

        // ===== Display Result =====
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies + "\n");

        // ===== Note =====
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}