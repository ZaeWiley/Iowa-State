package hw3;

import api.IStatefulComponent;
import api.Endpoint;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

public class Counter extends AbstractComponent implements IStatefulComponent {
    // Int for the current state
	private int cState;
	// int for the num
    private int num;

    /**
     * Constructs a new counter with n number of outputs.
     * @param o The number of outputs.
     */
    public Counter(int n) 
    {
        super(0, n);

        this.cState = 0;
        this.num = n;

        clear();
    }

    /**
     * Updates the internal state, 
     * provided that the component is enabled.
     */
    @Override
    public void tick() 
    {
        if (isEnabled() && inputsValid()) {
            invalidateOutputs();

            cState++;

            String binary = Integer.toBinaryString(cState);

            char c = ' ';
            int num = 0;

            for (int i = 0; i < Math.min(binary.length(), num); i++) {
                c = binary.charAt(binary.length() - i - 1);
                num = Character.getNumericValue(c);
                outputs()[i].set(num);
            }
        }
    }

	@Override
	public void clear()
	{
		for (int i = 0; i < outputs().length; i++) {
			Endpoint e = outputs()[i];
			e.set(0);
		}
		
	}
}