package typewiseAlert.alert;

import typewiseAlert.BreachType;

public class ControllerAlert implements IAlert {

	@Override
	public void sendToTarget(BreachType breachType) {
		int header = 0xfeed;
	    System.out.printf("%i : %i\n", header, breachType);
	}
}
