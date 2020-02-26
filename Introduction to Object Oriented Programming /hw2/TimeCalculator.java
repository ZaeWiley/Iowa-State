package hw2;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/**
 * A TimeCalculator serves as a simple clock counter to simulate the passage of time. Time is assumed to be in minutes, represented as a single integer.
 * 		- Extends Java Object
 */
public class TimeCalculator extends Object {

	/**
	 *  tells current time
	 */
	private int current;
	
	/**
	 * Constructor
	 *
	 *Constructs a new clock with a current time of zero.
	 */
	public TimeCalculator() 
	{
		//12
	}

	/**
	 * Get Time Method
	 * Returns this clock's current time.
	 * 
	 * @return the current time
	 */
	public int getTime() 
	{
		return current;
	}

	/**
	 * Passage of Time Method including just Minutes
	 * Simulates the passage of time for the given number of minutes.
	 * 
	 * @param minutes - number of minutes to be added to this clock's time
	 */
	public void passageOfTime(int minutes) 
	{
		current = current + minutes;
	}

	/**
	 * Passage of Time Method including Hours & Minutes
	 * Simulates the passage of time for the given hours and minutes.
	 * 
	 * @param hours - number of hours to be added
	 *				 @param minutes - number of minutes to be added
	 */
	public void passageOfTime(int hours, int minutes) 
	{
		current = current + hours * 60 + minutes;
	}
	
}