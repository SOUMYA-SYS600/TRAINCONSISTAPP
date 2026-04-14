import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * =========================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Demonstrates:
 * - Adding elements (CREATE)
 * - Removing elements (DELETE)
 * - Checking existence
 * - Displaying list
 *
 * @version 2.0
 */

public class TrainConsistApp  {

    public static void main(String[] args) {

        // ===== Display Header =====
        System.out.println("======================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("======================================\n");

        // ===== Create ArrayList =====
        List<String> passengerBogies = new ArrayList<>();

        // ===== Add Bogies =====
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies + "\n");

        // ===== Remove a Bogie =====
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies + "\n");

        // ===== Check if exists =====
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper?: " + passengerBogies.contains("Sleeper") + "\n");

        // ===== Final Output =====
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}