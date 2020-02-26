package hw3;

import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

public class NotGate extends AbstractComponent implements IComponent {
    /**
     * Constructs a new NotGate object 
     * sets the one inputs and single output to a new endpoint
     */
    public NotGate() 
    {
        super(1, 1);
    }

    /**
     * Propagates inputs to outputs.
     *  Literally almost exact as the other propagate methods in prior classes
     */
    @Override
    public void propagate() 
    {
        int newValue = 0;

        if (inputsValid()) {
            if (inputs()[0].getValue() == 0) {
                newValue = 1;
            }

            outputs()[0].set(newValue);
        }
    }
}
