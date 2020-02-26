package hw2;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/**
 * A Ticket models a parking ticket that records the time of entry, the time of payment and validation of ticket. 
 * Time is assumed to be represented in minutes as a single integer.
 * 		- Extends Object
 */
public class Ticket extends Object {

	/**
	 * Start of parking.
	 */
	private int startTime;
	
	/**
	 * Time paid/ to pay.
	 */
	private int payTime;
	
	/**
	 * Checks whether ticket is valid.
	 */
	private boolean validTicket;

	/**
	 * Constructor 
	 * Constructs a ticket with the given start time and a payment time of zero.
	 * 
	 * @param givenStartTime - start time for this ticket
	 */
	public Ticket(int givenStartTime) 
	{
		startTime = givenStartTime;
		payTime = 0;
		validTicket = false;
	}

	/**
	 * Get Entry Time Method
	 * Returns the start time for this ticket.
	 * 
	 * @return the start time of this ticket
	 */
	public int getEntryTime() 
	{
		return startTime;
	}

	/**
	 * Get Payment Time Method
	 * Returns the payment time for this ticket.
	 * 
	 * @return payment time for the ticket
	 */
	public int getPaymentTime() 
	{
		return payTime;
	}

	/**
	 * Set Ticket Payment Time Method
	 * 		Sets the payment time for this ticket.
	 * 
	 * @param givenPaymentTime - time to be set
	 */
	public void setTicketPaymentTime(int givenPaymentTime) 
	{
		payTime = givenPaymentTime;
	}

	/**
	 * Ticket Validation Method
	 *Returns if the ticket is valid or not.
	 * 
	 * @return true if ticket is valid, false otherwise
	 */
	public boolean ticketValid() 
	{
		return validTicket;
	}

	/**
	 * Set Validation Method
	 * Sets the ticket validation to given validation.
	 * 
	 * @param givenValid - boolean variable that sets the value of ticket valid
	 */
	public void setValid(boolean givenValid) 
	{
		validTicket = givenValid;
	}
	
}
