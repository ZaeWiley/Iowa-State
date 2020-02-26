package hw3;

import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

public class OrGate extends AbstractComponent implements IComponent {
    /**
     * Constructs a new OrGate object 
     *  sets the two inputs and single output to new endpoints
     */
    public OrGate() 
    {
        super(2, 1);
    }

    /**
     * Propagates inputs to outputs. 
     *  Does nothing if all inputs are  not valid.
     */
    @Override
    public void propagate() 
    {
        int newValue = 0;

        if (inputsValid()) {
            if (inputs()[0].getValue() == 1 || inputs()[1].getValue() == 1) {
                newValue = 1;
            }

            outputs()[0].set(newValue);
        }
    }
}