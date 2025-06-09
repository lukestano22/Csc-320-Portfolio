import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Automobile car = new Automobile("Toyota", "Camry", "Silver", 2020, 15000);
            System.out.println("Initial Vehicle Info:");
            printArray(car.listVehicleInfo());

            System.out.println("\nRemoving vehicle...");
            System.out.println(car.removeVehicle());

            System.out.println("\nAdding new vehicle...");
            System.out.println(car.addVehicle("Honda", "Civic", "Blue", 2022, 5000));

            System.out.println("\nUpdating vehicle...");
            System.out.println(car.updateVehicle("Honda", "Accord", "Red", 2023, 1200));

            String[] info = car.listVehicleInfo();
            printArray(info);

            System.out.print("\nDo you want to save this info to a JSON file? (Y/N): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                saveToJson(car, "vehicle_inventory.json");
                System.out.println("Vehicle info saved to vehicle_inventory.json");
            } else {
                System.out.println("Vehicle info will not be saved.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void saveToJson(Automobile car, String filename) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(filename);
            gson.toJson(car, writer);
            writer.close();
        } catch (Exception e) {
            System.out.println("Error writing JSON: " + e.getMessage());
        }
    }
}

