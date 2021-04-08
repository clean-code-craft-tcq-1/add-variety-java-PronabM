package typewiseAlert;

import typewiseAlert.alert.AlertTarget;
import typewiseAlert.cooling.CoolingType;

public class TypewiseAlert 
{
	private TypewiseAlert() {}
	
    public static BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
      return BreachType.inferBreach(value, lowerLimit, upperLimit);
    }
    
    public static BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC) {
      return coolingType.getInstance().classifyTemperatureBreach(temperatureInC);
    }
    
    public static boolean checkAndAlert(
    		AlertTarget alertTarget, BatteryCharacter batteryChar, double temperatureInC) {
    	
    	CoolingType coolingType = batteryChar.getCoolingType();
		BreachType breachType = coolingType.getInstance().classifyTemperatureBreach(temperatureInC);
        return alertTarget.getInstance().sendToTarget(breachType);
      
    }
}
