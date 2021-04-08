package typewiseAlert;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import typewiseAlert.alert.AlertTarget;
import typewiseAlert.cooling.CoolingType;

public class TypewiseAlertTest 
{
    @Test
    public void infersBreachAsPerLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(Double.NaN, 20, 30) ==
    	        typewiseAlert.BreachType.INVALID_INPUT);	
      assertTrue(TypewiseAlert.inferBreach(12, 20, 30) ==
        typewiseAlert.BreachType.TOO_LOW);
      assertTrue(TypewiseAlert.inferBreach(22, 20, 30) ==
    	        typewiseAlert.BreachType.NORMAL);
      assertTrue(TypewiseAlert.inferBreach(32, 20, 30) ==
    	        typewiseAlert.BreachType.TOO_HIGH);
    }
    
    @Test
    public void classifiesTemperatureBreachPassiveCooling()
    {
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, Double.NaN) ==
    	        typewiseAlert.BreachType.INVALID_INPUT);
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, -1) ==
    	        typewiseAlert.BreachType.TOO_LOW);
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, 20) ==
    	        typewiseAlert.BreachType.NORMAL);
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, 50) ==
    	        typewiseAlert.BreachType.TOO_HIGH);
    }
    
    @Test
    public void classifiesTemperatureBreachHiActiveCooling()
    {
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, Double.NaN) ==
    	        typewiseAlert.BreachType.INVALID_INPUT);
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, -1) ==
    	        typewiseAlert.BreachType.TOO_LOW);
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, 20) ==
    	        typewiseAlert.BreachType.NORMAL);
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, 50) ==
    	        typewiseAlert.BreachType.TOO_HIGH);
    }
    
    @Test
    public void classifiesTemperatureBreachMedActiveCooling()
    {
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, Double.NaN) ==
    	        typewiseAlert.BreachType.INVALID_INPUT);
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, -1) ==
    	        typewiseAlert.BreachType.TOO_LOW);
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, 20) ==
    	        typewiseAlert.BreachType.NORMAL);
    	assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, 50) ==
    	        typewiseAlert.BreachType.TOO_HIGH);
    }
    
    @Test
    public void checksAndAlertsController()
    {
    	BatteryCharacter battery = new BatteryCharacter(CoolingType.HI_ACTIVE_COOLING, "Exide");
    	assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, battery, Double.NaN));
    	assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, battery, -1));
    	assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, battery, 20));
    	assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, battery, 50));
    }
    
    @Test
    public void checksAndAlertsByEmail()
    {
    	BatteryCharacter battery = new BatteryCharacter(CoolingType.HI_ACTIVE_COOLING, "Exide");
    	assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, battery, Double.NaN));
    	assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, battery, -1));
    	assertFalse(TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, battery, 20));
    	assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, battery, 50));
    }
}
