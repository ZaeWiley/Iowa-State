package hw3;

import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

public class Multiplexer extends AbstractComponent implements IComponent {
    private int k;

    /**
     * Constructs a new Multiplexer
     * 
     * @param k 
     */
    public Multiplexer(int k) 
    {
        super(((int) Math.pow(2, k) + k), 1);

        this.k = k;
    }

    /**
     * Override Propagate
     */
    @Override
    public void propagate() 
    {
        int constant = k - 1;
        int output = 0;

        for (int i = (int) (Math.pow(2, k) + k) - 1; i >= (int) (Math.pow(2, k) + k) - k; i--) 
        {
            output += inputs()[i].getValue() * Math.pow(2, constant);
            constant--;
        }

        outputs()[0].set(inputs()[output].getValue());
    }
}