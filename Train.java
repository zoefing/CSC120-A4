import java.util.ArrayList;

/**
 * the train class represents a train with an engine and a list of cars
 * this class contains methods to get the engine, get a car, get the maximum capacity of the train, 
 * get the number of remaining open seats across all cars, and print out a list of all passengers onboard
 * 
 * the train class also contains a main method to test the train class
 */

public class Train {

    // variables

    /**
     * an engine object that represents the engine of the train
     * 
     * @param engine the engine of the train
     */
    private Engine engine;

    /**
     * an arraylist to store the cars currently attached to the train
     * 
     * @param cars the cars currently attached to the train
     * @return the cars currently attached to the train
     */
    private ArrayList<Car> cars;

    // constructors

    /**
     * constructs a train object with the given fuel type, fuel capacity, current fuel level, number of cars, and passenger capacity
     * 
     * @param fuelType the type of fuel the engine uses
     * @param fuelCapacity the maximum fuel level of the engine
     * @param currentFuel the current fuel level of the engine
     * @param nCars the number of cars attached to the train
     * @param passengerCapacity the maximum capacity of each car
     */
    public Train(FuelType fuelType, double fuelCapacity, double currentFuel, int nCars, int passengerCapacity) {
        // create a new engine object
        this.engine = new Engine(fuelType, fuelCapacity, currentFuel);
        // create a new arraylist of cars
        this.cars = new ArrayList<>();

        // for each car to add to the train (specified by nCars)
        for (int i = 0; i < nCars; i++) {
            // add a new car to the train
            cars.add(new Car(passengerCapacity, new ArrayList<>()));
        }
    }

    // methods

    /**
     * gets the engine of the train
     * 
     * @return the engine of the train
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * gets the car at the specified index
     * 
     * @param i the index of the car to return
     * @return the car at the specified index
     */
    public Car getCar(int i) {
        return cars.get(i);
    }

    /**
     * gets the maximum total capacity across all cars
     * 
     * @return the maximum total capacity across all cars
     */
    public int getMaxCapacity() {
        // create a variable to store the maximum total capacity
        int maxCapacity = 0;
        // for each car in the train
        for (Car car : cars) {
            // add the car's capacity to the maximum total capacity
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    /**
     * gets the number of remaining seats across all cars
     * 
     * @return the number of remaining seats across all cars
     */
    public int seatsRemaining() {
        // create a variable to store the number of remaining seats
        int seatsRemaining = 0;
        // for each car in the train
        for (Car car : cars) {
            // add the car's remaining seats to the number of remaining seats
            seatsRemaining += car.seatsRemaining();
        }
        return seatsRemaining;
    }

    /**
     * prints out a list of all passengers onboard by calling the printManifest method for each car
     */
    public void printManifest() {
        // for each car in the train
        for (Car car : cars) {
            // print out a list of all passengers onboard
            car.printManifest();
        }
    }

    // // testing!
    // public static void main(String[] args) {
    //     // create a train
    //     Train train = new Train(FuelType.STEAM, 100, 100, 3, 50);

    //     // print out the engine's fuel type
    //     System.out.println("Engine Fuel Type: " + train.getEngine().fuelType);

    //     // get the maximum capacity of the train
    //     System.out.println("Maximum Capacity: " + train.getMaxCapacity());

    //     // print out the number of remaining open seats across all cars
    //     System.out.println("Remaining Open Seats: " + train.seatsRemaining());

    //     // add passengers to the train
    //     Passenger Sonny = new Passenger("Sonny");
    //     Passenger Cher = new Passenger("Cher");

    //     // board passengers to cars
    //     Sonny.boardCar(train.getCar(0));
    //     Cher.boardCar(train.getCar(0));
    //     System.out.println("Remaining Open Seats: " + train.seatsRemaining());

    //     // print out a list of all passengers onboard
    //     train.printManifest();

    //     // remove a passenger from the train
    //     Sonny.getOffCar(train.getCar(0));

    //     // print out the updated list after passenger gets off
    //     train.printManifest();
    // }
}