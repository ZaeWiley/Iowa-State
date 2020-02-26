package hw3;

import api.Endpoint;
import api.IComponent;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/**
 * AndGate  Class
 * 	Implements IComponent
 */
public class AndGate extends AbstractComponent implements IComponent
{
  public AndGate()
  {
	/**
	 * 2 inputs
	 * 1 output
	 */
    super(2, 1);
  }
  
  public void propagate()
  {
	Endpoint[] in = inputs();
    if (inputsValid())
    {
      int newValue = 0;
      if (in[0].getValue() == 1 && in[1].getValue() == 1)
      {
        newValue = 1;
      }
      outputs()[0].set(newValue);
    }

  }

}
