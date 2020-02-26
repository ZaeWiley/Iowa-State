package lab5;

import static org.junit.Assert.*;
import org.junit.Test;
import balloon1.Balloon;

public class BalloonTest {

	@Test
	public void testBlowingPopped() 
	{
		Balloon b = new Balloon(10);
		b.pop();
		b.blow(1);
		assertEquals(0, b.getRadius());
	}

	@Test
	public void doubleBlow() 
	{
		Balloon b = new Balloon(20);
		b.blow(5);
		b.blow(5);
		assertEquals(10, b.getRadius());
	}

	@Test
	public void deflatePopped() 
	{
		Balloon b = new Balloon(5);
		b.deflate();
		assertEquals(false, b.isPopped());
	}
	
}