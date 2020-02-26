package hw3;

import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

public class NorGate extends AbstractComponent implements IComponent {
    /**
     * Constructs a new XorGate object that sets the two inputs and output to new endpoints.
     */
    public NorGate()
    {
    	//2 inputs
    	//1 output
        super(2, 1);
    }

    /**
     * Propagates inputs to outputs.
     * Does nothing if all inputs are not valid
     */
    @Override
	public void propagate() {
		int newValue = 0;

		if (inputsValid()) {
			if (inputs()[0].getValue() == 1 || inputs()[1].getValue() == 1) {
				newValue = 0;
			}

			outputs()[0].set(newValue);
		}
	}

}