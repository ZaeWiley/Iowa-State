package hw2;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/**
 * An EntryGate generates new tickets having a start time determined by the internal clock.
 * 	- Extends Java Object
 */
public class EntryGate extends Object {
	
	/**
	 * Calculates Time.
	 */
	private TimeCalculator timeCalc;
	
	/**
	 * number of cars entered.
	 */
	private int numCars;

	/**
	 * Constructor
	 * 	Constructs an EntryGate that will use the given clock.
	 * 
	 * @param givenClock
	 */
	public EntryGate(TimeCalculator givenClock) 
	{
		timeCalc = givenClock;

	}

	/**
	 * Take Ticket Method
	 * Returns a newly constructed ticket whose start time is the current time according to this machine's clock. 
	 * The ticket is also set to a valid ticket.
	 * 
	 * @return new ticket object
	 */
	public Ticket takeTicket() 
	{
		Ticket t = new Ticket(timeCalc.getTime());
		t.setTicketPaymentTime(0);
		numCars = numCars + 1;

		return t;
	}

	/**
	 * Cars Entered Method
	 * Returns the total number of cars that successfully entered the gate though the machine. 
	 * A successful entry is the number of times takeTicket() has been called.
	 * 
	 * @return number of successful exits
	 */
	public int carsEntered() 
	{
		return numCars;
	}
	
}
