package typewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TypewiseAlertTest 
{
    @Test
    public void infersBreachAsPerLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(12, 20, 30) ==
        typewiseAlert.BreachType.TOO_LOW);
      assertTrue(TypewiseAlert.inferBreach(22, 20, 30) ==
    	        typewiseAlert.BreachType.NORMAL);
      assertTrue(TypewiseAlert.inferBreach(32, 20, 30) ==
    	        typewiseAlert.BreachType.TOO_HIGH);
    }
}
