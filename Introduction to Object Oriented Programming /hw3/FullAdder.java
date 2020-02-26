package hw3;

import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/*
 * Full Adder Class
 * implements IComponent
 *  no-argument constructor;
 *  inputs and outputs are initially invalid 
 */
public class FullAdder extends CompoundComponent implements IComponent{
    private IComponent halfAdd1;
    private IComponent halfAdd2;
    private IComponent orGate;

    /**
     * Constructs a new FullAdder.
     */
    public FullAdder() {
        super(3, 2);

        halfAdd1 = new HalfAdder();
        halfAdd2 = new HalfAdder();
        orGate = new OrGate();

        addComponent(halfAdd1);
        addComponent(halfAdd2);
        addComponent(orGate);

        inputs()[0].connectTo(halfAdd1.inputs()[0]);
        inputs()[1].connectTo(halfAdd1.inputs()[1]);
        inputs()[2].connectTo(halfAdd2.inputs()[0]);


        halfAdd1.outputs()[0].connectTo(halfAdd2.inputs()[1]);
        halfAdd1.outputs()[1].connectTo(orGate.inputs()[0]);
        halfAdd2.outputs()[1].connectTo(orGate.inputs()[1]);

        halfAdd2.outputs()[0].connectTo(outputs()[0]);
        orGate.outputs()[0].connectTo(outputs()[1]);
    }
}