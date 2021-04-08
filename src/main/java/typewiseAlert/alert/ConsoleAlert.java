package typewiseAlert.alert;

import typewiseAlert.BreachType;

public class ConsoleAlert implements IAlert {
	
	protected ConsoleAlert() {}

	@Override
	public boolean sendToTarget(BreachType breachType) {
		System.out.println(breachType.name());
		return true;
	}
	
	

}
