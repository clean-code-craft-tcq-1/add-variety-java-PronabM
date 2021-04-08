package typewiseAlert.alert;

import typewiseAlert.BreachType;

public class ControllerAlert implements IAlert {
	
	protected ControllerAlert() {}

	@Override
	public boolean sendToTarget(BreachType breachType) {
		int header = 0xfeed;
	    System.out.printf("%d : %s\n", header, breachType.name());
	    return true;
	}
}
