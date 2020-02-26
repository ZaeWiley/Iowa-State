package hw3;

import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/*
 * implements IComponent
 * no-argument constructor
 *  inputs and outputs are initially invalid
 */
public class HalfAdder extends CompoundComponent implements IComponent {
 
	
    /**
     * Constructs a new HalfAdder.
     */
    public HalfAdder() {
        super(2, 2);
        
        //Essential Interface Components
        IComponent andGate = new AndGate();
        IComponent andGate2 = new AndGate();
        IComponent orGate = new OrGate();
        IComponent notGate = new NotGate();
        
        //Adding initialized  components
        addComponent(andGate);
        addComponent(andGate2);
        addComponent(orGate);
        addComponent(notGate);
        
        //Inputs & Wiring / Connections
        inputs()[0].connectTo(andGate.inputs()[0]);
        inputs()[1].connectTo(orGate.inputs()[1]);
        inputs()[0].connectTo(andGate.inputs()[0]);
        inputs()[1].connectTo(orGate.inputs()[1]);
        
        //Outputs  & Connections
        orGate.outputs()[0].connectTo(andGate2.inputs()[0]);
        andGate.outputs()[0].connectTo(orGate.inputs()[0]);
        notGate.outputs()[0].connectTo(andGate2.inputs()[1]);
        
        andGate2.outputs()[0].connectTo(outputs()[0]);
        andGate.outputs()[0].connectTo(outputs()[1]);
    }
}