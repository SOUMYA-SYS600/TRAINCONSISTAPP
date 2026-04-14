import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =========================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * =========================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * Maintains insertion order while preventing duplicates
 * using LinkedHashSet.
 *
 * @version 5.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== Header =====
        System.out.println("=========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=========================================\n");

        // ===== LinkedHashSet =====
        Set<String> formation = new LinkedHashSet<>();

        // ===== Add bogies (with duplicates) =====
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("AC");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate entries (ignored automatically)
        formation.add("Sleeper");
        formation.add("AC");

        // ===== Display final formation =====
        System.out.println("Final Train Formation:");
        System.out.println(formation + "\n");

        // ===== Note =====
        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.\n");

        System.out.println("UC5 formation setup completed...");
    }
}