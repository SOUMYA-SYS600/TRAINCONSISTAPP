import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * =========================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * Entry point of Train Consist Management Application.
 *
 * This program:
 * - Displays welcome message
 * - Initializes empty train consist
 * - Shows initial bogie count
 * - Prints current state
 *
 * @author Developer
 * @version 1.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== Display Welcome Banner =====
        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        // ===== Create dynamic list for train consist =====
        List<String> trainConsist = new ArrayList<>();

        // ===== Display Initialization Message =====
        System.out.println("Train initialized successfully...");

        // ===== Display Initial Bogie Count =====
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // ===== Display Current Train State =====
        System.out.println("Current Train Consist: " + trainConsist);

        // ===== Final System Ready Message =====
        System.out.println("\nSystem ready for operations...");
    }
}