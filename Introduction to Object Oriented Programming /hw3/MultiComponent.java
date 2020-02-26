package hw3;

import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/*
 * Multi Comp Class
 * implements IComponent
 * Extends Compound Component 
 */
public class MultiComponent extends CompoundComponent implements IComponent {
    /**
     * MultiComp Constructor
     * @param array for components
     */
    public MultiComponent(IComponent[] components)
    {
        super(components[0].inputs().length * components.length, components.length);

        // Inputs are initially invalid.
        for (int i = 0; i < components.length; i++)
        {
            for (int j = 0; j < components[i].inputs().length; j++)
                components[i].inputs()[j].invalidate();
            for (int j = 0; j < components[i].outputs().length; j++)
                components[i].outputs()[j].invalidate();
        }

        int m = 0;
        int n = 0;

        for (IComponent c : components) {
            addComponent(c);

            for (int i = 0; i < c.inputs().length; i++) {
                inputs()[m].connectTo(c.inputs()[i]);
                m++;
            }

            for (int j = 0; j < c.outputs().length; j++) {
                c.outputs()[j].connectTo(outputs()[n]);
                n++;
            }
        }
    }

    @Override
    public void propagate() {
        for (IComponent c : getComponents()) {
            c.propagate();
        }
    }
}