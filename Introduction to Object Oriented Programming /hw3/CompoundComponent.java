package hw3;

import api.IComponent;
import java.util.ArrayList;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

public  class CompoundComponent extends AbstractComponent implements IComponent {
	//Arraylist for interface
    private ArrayList<IComponent> com;

    /**
     * Constructs a new Compound Component taking two parameters.
     * @param i The number of inputs for the compound component.
     * @param o The number of outputs for the compound component.
     */
    public CompoundComponent(int i, int o)
    {
        super(i, o);
        com = new ArrayList<>();
    }

    /**
     * Adds a component to the list of components, that make up the Compound Component.
     * @param c
     */
    public void addComponent(IComponent c)
    {
        com.add(c);
    }

    /**
     * Returns a list of components of a compound component.
     * @return The list of compound components.
     */
    public ArrayList<IComponent> getComponents() {
        return com;
    }

    /**
     * Propagates the solution through the component.
     */
    @Override
    public void propagate() 
    {
        for (IComponent c : com) {
            if (c.inputsValid()) {
                c.propagate();
            }
        }
    }
}