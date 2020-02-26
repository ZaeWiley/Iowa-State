package hw2;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/**
 * An ExitGate checks a ticket and determines whether its payment time allows the holder to exit.
 * 		- Extends Java Object
 */
public class ExitGate extends Object {
	
	/**
	 * new ticket
	 */
	private Ticket tick;
	
	/**
	 * New Time Calculator
	 */
	private TimeCalculator timeCalc;
	
	/**
	 * number of cars that have exited.
	 */
	private int numExit;

	/**
	 * Constructor
	 * 		Constructs an ExitGate that will use the given clock.
	 * 
	 * @param  givenClock - clock to be used by this machine
	 */
	public ExitGate(TimeCalculator givenClock) 
	{
		timeCalc = givenClock;
		numExit = 0;
	}

	/**
	 * Check Ticket Method
	 * Returns true if ticket is paid and the car is exiting within EXIT_TIME_LIMIT minutes of payment, otherwise returns false. 
	 * Always returns false if payment time is zero. It also sets the ticket to invalid if it is paid and the car exits.
	 * 
	 * @param t - ticket whose payment time is to be checked
	 * @return true if payment time is within EXIT_TIME_LIMIT minutes current time, false otherwise
	 */
	public boolean checkTicket(Ticket t) 
	{
		tick = t;
		if (tick.getPaymentTime() == 0) 
		{
			return false;
		}

		int allowed = timeCalc.getTime() - tick.getPaymentTime();

		if (allowed > 0 && allowed <= CostCalculator.EXIT_TIME_LIMIT) 
		{
			numExit++;
			return true;

		} else
			return false;
	}

	/**
	 * Cars Exited Method
	 * Returns the total number of cars that successfully exited the gate though the machine. A successful exit is a call to checkTicket() that returned true.
	 * 
	 * @return number of successful exits
	 */
	public int carsExited() {
		return numExit;
	}
	
}
