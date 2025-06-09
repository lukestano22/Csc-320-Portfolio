public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Automobile() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
        } catch (Exception e) {
            System.out.println("Constructor error: " + e.getMessage());
        }
    }

    public Automobile(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } catch (Exception e) {
            System.out.println("Constructor error: " + e.getMessage());
        }
    }

    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully.";
        } catch (Exception e) {
            return "Error adding vehicle: " + e.getMessage();
        }
    }

    public String[] listVehicleInfo() {
        try {
            return new String[]{
                    "Make: " + make,
                    "Model: " + model,
                    "Color: " + color,
                    "Year: " + year,
                    "Mileage: " + mileage
            };
        } catch (Exception e) {
            return new String[]{"Error listing vehicle: " + e.getMessage()};
        }
    }

    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Error removing vehicle: " + e.getMessage();
        }
    }

    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Error updating vehicle: " + e.getMessage();
        }
    }
}

