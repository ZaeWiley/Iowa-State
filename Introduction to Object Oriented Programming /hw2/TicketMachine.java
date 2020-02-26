package hw2;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/**
 * A TicketMachine has methods allowing a Ticket object to be updated to show when payment is made. 
 * There is a method insertTicket() to simulate inserting a ticket into the machine. At that point a transaction is said to be "in progress", 
 * and the transactionInProgress() method returns true, until a subsequent call to ejectTicket(). 
 * The amount due for parking can be obtained from the method getPaymentDue(). 
 * The method makePayment() finally updates the Ticket object to record the time of payment. 
 * (We assume that all payments are by credit/debit and are successful.) 
 * In addition, the TicketMachine includes an accumulator that records the total amount of money paid into the machine since it was initialized.
 * 		- Extends Java Object
 */
public class TicketMachine extends Object {

	/**
	 * total amount.
	 */
	private double amount;
	
	/**
	 * new ticket
	 */
	private Ticket tick;
	
	/**
	 * Checks if ticket is in machine.
	 */
	private boolean tickCheck;
	
	/**
	 * New Clock
	 */
	private TimeCalculator clock;

	/**
	 * Constructor
	 * Constructs a TicketMachine that will use the given clock to determine the current time.
	 * 
	 * @param givenClock - clock to be used by this machine.
	 */
	public TicketMachine(TimeCalculator givenClock) 
	{
		clock = givenClock;
		tickCheck = false;
	}

	/**
	 * Insert Ticket Method
	 * Simulates inserting the given ticket into this machine. 
	 * The method checks if the ticket is a valid ticket. If it is not, it ejects the ticket. 
	 * If a transaction is already in progress, this method does nothing.
	 * 
	 * @param t
	 */
	public void insertTicket(Ticket t) 
	{
		tick = t;
		if (tickCheck) 
		{
			tickCheck = true;
		}
	}

	/**
	 * Transaction In Progress Method
	 * Determines whether a ticket is currently in this machine.
	 * 
	 * @return true if there is a ticket in this machine, false otherwise
	 */
	public boolean transactionInProgress() 
	{
		return tickCheck;
	}

	/**
	 * Payment Due Method
	 * Returns the payment due for the ticket currently in the machine.
	 * If no transaction is in progress, returns 0.0.
	 * 
	 * @return payment due for the ticket currently in the machine
	 */
	public double paymentDue() 
	{
		if(transactionInProgress() == true && tick.getPaymentTime() == 0)
		{
			return CostCalculator.calculateCost(clock.getTime() - tick.getEntryTime());
		}
		else if (transactionInProgress() == true && tick.getPaymentTime() != 0)
		{
			return (CostCalculator.calculateCost(clock.getTime() - tick.getEntryTime())) -(CostCalculator.calculateCost(tick.getPaymentTime() - tick.getEntryTime()));
		}
		else
		{
			return 0.0;
		}
	}

	/**
	 * Eject Ticket Method
	 * 
	 * Simulates ejecting the ticket from this machine. 
	 * Has no effect if no transaction is in progress.
	 */
	public void ejectTicket() 
	{
		if (tickCheck) 
		{
			tickCheck= false;
		}
	}

	/**
	 * Make Payment Method
	 * 
	 * Updates the current ticket with the payment time and adds the payment amount to this machine's total. 
	 * If there is no transaction in progress, this method has no effect.
	 */
	public void makePayment() 
	{
		amount = amount + paymentDue();
		tick.setTicketPaymentTime(clock.getTime());
	}

	/**
	 * Get Current Ticket Method
	 *Returns the ticket currently in this machine, or null if there is none.
	 * 
	 * @return ticket currently in this machine, or null
	 */
	public Ticket getCurrentTicket() 
	{

		if (tickCheck) 
		{
			return tick;
		}
		return null;
	}

	/**
	 * Get Total Payment On Machine Method
	 *Returns the total payments made at this machine.
	 * 
	 * @return total payments
	 */
	public double getTotalPaymentsOnMachine() 
	{
		return amount;
	}
	
}