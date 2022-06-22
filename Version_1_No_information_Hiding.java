/* PRESET CODE BEGIN - NEVER TOUCH CODE BELOW */
public class Main {
    public static void main(String[] args) {
      // Create a vehicle that can handle 10,000 kilograms weight
      System.out.println("Creating a vehicle with a 10,000kg maximum load.");
      Vehicle vehicle = new Vehicle(10000.0);
      // Add a few boxes
      System.out.println("Add box #1 (500kg)");
      vehicle.load = vehicle.load + 500.0;
      System.out.println("Add box #2 (250kg)");
      vehicle.load = vehicle.load + 250.0;
      System.out.println("Add box #3 (5000kg)");
      vehicle.load = vehicle.load + 5000.0;
      System.out.println("Add box #4 (4000kg)");
      vehicle.load = vehicle.load + 4000.0;
      System.out.println("Add box #5 (300kg)");
      vehicle.load = vehicle.load + 300.0;
      // Print out the final vehicle load
      System.out.println("Vehicle load is " + vehicle.getLoad() + " kg");
    }
  }
  /* PRESET CODE END - NEVER TOUCH CODE ABOVE */
  class Vehicle {
      public double load;    // the current weight of the vehicle's cargo
      public double maxLoad; // the vehicle's maximum cargo weight limit
      public Vehicle(double max_load) {
          load = 0;
          maxLoad = max_load;
      }
      public double getLoad() {
          return load;
      }
      public double getMaxLoad() {
          return maxLoad;
      }
  }