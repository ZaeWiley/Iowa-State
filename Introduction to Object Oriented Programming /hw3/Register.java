package hw3;

import api.IStatefulComponent;
import api.Endpoint;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

public class Register extends AbstractComponent implements IStatefulComponent {
   
	/**
     * Construct - new register
     * @param n 
     */
    public Register(int n) 
    {
        super(n, n);

        clear();
    }

    /**
     * Updates the internal state
     * assuming component is enabled.
     */
    @Override
    public void tick() 
    {
        int[] currentState = new int[inputs().length];

        if (isEnabled() && inputsValid()) {
            for (int i = 0; i < inputs().length; i++) {
                currentState[i] = inputs()[i].getValue();
            }

            for (int j = 0; j < outputs().length; j++) {
                outputs()[j].set(currentState[j]);
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