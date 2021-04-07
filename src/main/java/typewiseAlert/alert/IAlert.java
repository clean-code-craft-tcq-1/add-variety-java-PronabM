package typewiseAlert.alert;

import typewiseAlert.BreachType;

public interface IAlert {
	public void sendToTarget(BreachType breachType);
}
