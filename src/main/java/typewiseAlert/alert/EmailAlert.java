package typewiseAlert.alert;

import typewiseAlert.BreachType;

public class EmailAlert implements IAlert {

	@Override
	public boolean sendToTarget(BreachType breachType) {
		String recepient = "a.b@c.com";
		if(breachType == BreachType.NORMAL)
			return false;
		System.out.printf("To: %s\n", recepient);
		System.out.printf("Hi, the temperature is %s\n",format(breachType));
		return true;
	}
	
	private String format(BreachType breachType)
	{
		return breachType.name().replace('_', ' ').toLowerCase();
	}

}
