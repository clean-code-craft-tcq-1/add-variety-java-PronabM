package typewiseAlert.alert;

import typewiseAlert.BreachType;

public interface IAlert {
	public boolean sendToTarget(BreachType breachType);
}
