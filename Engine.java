/**
 * the engine class represents the engine that the train runs on
 * this class stores information about the fuel type, current fuel level, and maximum fuel level
 * it also contains methods to refuel the engine and to run the engine
 */
public class Engine {

    // variables

    /**
     * an enum that represents the type of fuel the engine uses
     * 
     * @param fuelType the type of fuel the engine uses
     */
    FuelType fuelType;

    /**
     * a double that represents the current fuel level of the engine
     * 
     * @param currentFuel the current fuel level of the engine
     */
    public double currentFuel;

    /**
     * a double that represents the maximum fuel level of the engine
     * 
     * @param maxFuel the maximum fuel level of the engine
     */
    public double maxFuel;

    // constructors

    /**
     * constructs an engine object with the given fuel type, current fuel level, and maximum fuel level
     * 
     * @param fuelType the type of fuel the engine uses
     * @param currentFuel the current fuel level of the engine
     * @param maxFuel the maximum fuel level of the engine
     */
    public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    // methods

    /** 
     * refuels the engine to its maximum fuel level (resets the current fuel level to the maximum fuel level)
     * 
     * @param maxFuel the maximum fuel level of the engine
     */
    public void refuel() {
        currentFuel = maxFuel;
    }

    /**
     * runs the engine, decrementing the fuel level by 1
     * 
     * @param currentFuel the current fuel level of the engine
     * @return true if the engine is running, false if the engine is out of fuel
     */
    public boolean go() {
        // if fuel is not empty (greater than 0) than 0
        if (currentFuel > 0) {
            // decrement fuel
            currentFuel -= 1;
            // print message for testing
            // System.out.println("Remaining fuel level: " + current_fuel);
            // return true
            return true;
        } else {
            // return false
            return false;
        }
    }

    // // testing!
    // public static void main(String[] args) {
    //     // initialize an engine
    //     Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100.0);
    //     // while engine is running
    //     while (myEngine.go()) {
    //         // print message
    //         System.out.println("Choo choo!");
    //     }
    //     // when engine is not running
    //     // print message
    //     System.out.println("Out of fuel.");
    // }
}