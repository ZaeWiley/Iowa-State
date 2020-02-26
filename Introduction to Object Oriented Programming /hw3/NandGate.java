package hw3;

import javax.xml.ws.Endpoint;

import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

public class NandGate extends AbstractComponent implements IComponent {
	
	public NandGate()
	{
		//2 outputs
		//1 input
		super(2, 1);
	}
	
	@Override
	public void propagate()
	{
		api.Endpoint[] in = inputs();
		if (inputsValid()) {
			int newValue = 0;
			if (in[0].getValue() == 1 && in[1].getValue() == 1) {
				newValue = 0;
			}
			outputs()[0].set(newValue);
		}

	}
  
}
