import java.util.ArrayList;

/**
 * the passenger class represents a passenger who can board and get off a car
 * this class stores information about the passenger's name
 * it also contains methods to board and get off a car
 */
public class Passenger {
    
    // variables

    /**
     * a string that represents the name of the passenger
     */
    private String name;


    // constructors

    /**
     * constructs a passenger object with the given name
     * 
     * @param name the name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * gets the name of the passenger
     * 
     * @return the name of the passenger
     */
    public String getName() {
        return name;
    }

    // methods
    
    /**
     * attempts to board a passenger to the specified car
     * if the car is not full, the passenger is added to the car
     * otherwise, a message is printed indicating that the car is full
     * 
     * @param c the car to board
     */
    public void boardCar(Car c) {
        // checks that the car is not full
        if (c.addPassenger(this)) {
            // if the car is not full, add the passenger to the car
            System.out.println(name + " boarded the car.");
        } else {
            // if the car is full, print out a message saying the car is full
            System.out.println("Sorry, " + name + " couldn't board the car. The car is full.");
        }
    }

    /**
     * attempts to remove a passenger from the specified car
     * if the passenger is onboard, the passenger is removed from the car
     * otherwise, a message is printed indicating that the passenger wasn't found on the car
     * 
     * @param c the car to get off
     */
    public void getOffCar(Car c) {
        // check if the passenger is onboard
        if (c.removePassenger(this)) {
            // if the passenger is onboard, remove the passenger from the car
            System.out.println(name + " got off the car.");
        } else {
            // if the passenger is not onboard, print out a message saying the passenger wasn't found on the car
            System.out.println("Sorry, " + name + " wasn't found on this car.");
        }
    }

    // // testing!
    // public static void main(String[] args) {
    //     // create a passenger
        
    //     Passenger Freud = new Passenger("Freud");

    //     // create a car
    //     Car businessClass = new Car(4, new ArrayList<>());

    //     // add passenger to car
    //     Freud.boardCar(businessClass);

    //     // print out the list of passengers aboard the car
    //     businessClass.printManifest();

    //     // remove passenger from car
    //     Freud.getOffCar(businessClass);

    //     // print out the list of passengers aboard the car
    //     businessClass.printManifest();
    // }
}
