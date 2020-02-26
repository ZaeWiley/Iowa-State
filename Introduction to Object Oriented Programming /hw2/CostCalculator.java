package hw2;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/**
 * CostCalculator calculates parking rates for the parking garage.
 * 	- Extends Java Object
 */
public class CostCalculator extends Object {
	
	/**
	 * Max allowed time in minutes between payment of a ticket and exit from the garage.
	 * 	- Starts at the value of 10
	 */
	public static final int EXIT_TIME_LIMIT = 10;

	/**
	 * Calculate Cost Method
	 * 	Calculates cost based on rate, and minutes parked.
	 * 
	 * @param minutes - number of minutes parked
	 * @return cost for parking the given number of minutes
	 */
	public static double calculateCost(int minutes) 
	{
		double pay = 0.0;

		if (minutes > 0 && minutes < 15) 
		{
			pay = 0;

		} else if (minutes >= 15 && minutes < 30) 
		{
			pay = 1;

		} else if (minutes >= 30 && minutes < 60) 
		{
			pay = 2;

		} else if (minutes >= 60 && minutes < 120) 
		{
			pay = 3.50;

		} else if (minutes >= 120 && minutes < 180) 
		{
			pay = 5.0;

		} else if (minutes >= 180 && minutes < 240) 
		{
			pay = 6.50;

		} else if (minutes >= 240 && minutes < 300) 
		{
			pay = 8.0;

		} else if (minutes >= 300 && minutes <= 600) 
		{
			pay = 11.0;

		} else 
		{
			pay = 15.0;
		}
		return pay;
	}
}
