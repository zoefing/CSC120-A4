import java.util.ArrayList;

/**
 * the car class represents a train car with a maximum capacity and a list of passengers onboard
 * this class contains methods to add and remove passengers from the car, as well as to print out a list of all passengers aboard the car
 */
public class Car {
    // variables

    /** 
     * an arraylist to store the passengers currently onboard
     * 
     * @param passengers the passengers currently onboard
     * @return the passengers currently onboard
     */
    private ArrayList<Passenger> passengers;

    /** 
     * an int that represents the car's maximum capacity
     * 
     * @param maxCapacity the car's maximum capacity
     * @return the car's maximum capacity
     */
    private int maxCapacity;

    // constructors
    
    /**
     * constructs a car object with the given maximum capacity and an empty list of passengers
     * 
     * @param maxCapacity
     * @param passengers
     */
    public Car(int maxCapacity, ArrayList<Passenger> passengers) {
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<>();
    }

    // methods

    /**
     * gets the car's maximum capacity
     * 
     * @return the car's maximum capacity
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * gets the number of seats remaining in the car
     * 
     * @return the number of seats remaining in the car
     */
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    /**
     * attempts to add a passenger to the car
     * if the car is not full, the passenger is added to the car
     * otherwise, a message is printed indicating that the car is full
     * 
     * @param p the passenger to add
     * @return true if the passenger was added, false if the car is full
     */
    public boolean addPassenger(Passenger p) {
        // first, make sure there are seats remaining
        if (seatsRemaining() > 0) {
            // if there is availability, add passenger to the list of passengers in the car
            passengers.add(p);
            // return true
            return true;
        } else {
            // if the car is full, return false
            return false;
        }
    }

    /**
     * attempts to remove a passenger from the car
     * if the passenger is onboard, the passenger is removed from the car
     * otherwise, a message is printed indicating that the passenger wasn't found on the car
     * 
     * @param p the passenger to remove
     * @return true if the passenger was removed, false if the passenger wasn't found on the car
     */
    public boolean removePassenger(Passenger p) {
        // first, make sure passenger is onboard
        if (passengers.contains(p)) {
            // if passenger is in the list of passengers in the car, remove passenger
            passengers.remove(p);
            // Return true
            return true;
        } else {
            // if the passenger is not in the list of passengers in the car, return false
            return false;
        }
    }

    /**
     * prints out a list of all passengers aboard the car
     * 
     * @return the list of passengers aboard the car
     */
    public void printManifest() {
        // if there the car is not empty
        if (!passengers.isEmpty()) {
            // print out the list of passengers aboard the car
            System.out.println("Passengers aboard the car:");
            for (Passenger p : passengers) {
                System.out.println(p.getName());
            }
        } else {
            // if there are no passengers onboard, print out a message saying the car is empty
            System.out.println("This car is EMPTY.");
        }
    }

    // // testing!
    // public static void main(String[] args) {
    //     // initialize cars
    //     Car quietCar = new Car(4, new ArrayList<>());
    //     Car rearCar = new Car(4, new ArrayList<>());

    //     // initialize passengers
    //     Passenger Jekyll = new Passenger("Jekyll");
    //     Passenger Hyde = new Passenger("Hyde");

    //     // add passenger to quiet car
    //     quietCar.addPassenger(Jekyll);

    //     // add passenger to rear car
    //     rearCar.addPassenger(Hyde);

    //     // print out the list of passengers aboard the car
    //     quietCar.printManifest();
    //     rearCar.printManifest();

    //     // remove passengers from car
    //     quietCar.removePassenger(Jekyll);
    //     rearCar.removePassenger(Hyde);

    //     // print out the list of passengers aboard the cars
    //     quietCar.printManifest();
    //     rearCar.printManifest();
    // }
}