package hw3;

import api.Endpoint;
import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/**
 * Abstract Class AbstractComponent
 * 	Implements IComponent
 */
public class AbstractComponent implements IComponent {
	//Endpoint for inputs
    private Endpoint[] input;
    //Endpoint for Outputs
    private Endpoint[] output;
    //Boolean for  whether it is enabled or not
    private boolean isEnabled;

    /**
     * Creates a new AbstractComponent
     * @param in for # of inputs &  out for # of outputs
     */
    public AbstractComponent(int in, int out) {
        input = new Endpoint[in];
        output = new Endpoint[out];
        isEnabled = false;

        for (int j = 0; j < input.length; j++) {
            input[j] = new Endpoint(this);
        }

        for (int j = 0; j < output.length; j++) {
            output[j] = new Endpoint(this);
        }
    }

    /**
     * Returns an array of  Endpoints from the inputs
     *
     * @return array of input Endpoints
     */
    @Override
    public Endpoint[] inputs() {
        return input;
    }

    /**
     * Returns the array of Endpoints representing this component's outputs.
     *
     * @return array of output Endpoints
     */
    @Override
    public Endpoint[] outputs() {
        return output;
    }

    /**
     * Returns whether all inputs are valid.
     *
     * @return true if all inputs are valid, false otherwise
     */
    @Override
    public boolean inputsValid() {
        for (Endpoint e : input) {
            if (!e.isValid()) {
                return false;
            }
        }

        return true;
    }

    /**
     * Returns whether all outputs are valid.
     *
     * @return true if all outputs are valid, false otherwise
     */
    @Override
    public boolean outputsValid() {
        for (Endpoint e : output) {
            if (!e.isValid()) {
                return false;
            }
        }

        return true;
    }

    /**
     * Invalidates Input
     * Sets state to false
     */
    @Override
    public void invalidateInputs() {
        for (Endpoint e : input) {
            if (e.isValid()) {
                e.invalidate();
            }
        }
    }

    /**
     * Invalidates output
     * Sets state to false
     */
    @Override
    public void invalidateOutputs() {
        for (Endpoint e : output) {
            if (e.isValid()) {
                e.invalidate();
            }
        }
    }

    /**
     * Propagates inputs to outputs.  Does nothing if all inputs are not valid.
     */
    @Override
    public void propagate() {

    }

    /**
     * Enables updates to the internal state, if any, when processing
     * the tick() operation.
     *
     * @param enabled
     */
    public void setEnabled(boolean state) {
        isEnabled = state;
    }

    /**
     * Check if it is enabled
     */
    public boolean isEnabled() {
        return  isEnabled;
    }
}