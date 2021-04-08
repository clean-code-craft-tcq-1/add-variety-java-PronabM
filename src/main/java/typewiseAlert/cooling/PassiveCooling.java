package typewiseAlert.cooling;

import typewiseAlert.BreachType;

public class PassiveCooling implements ICooling {
	
	private int lowerLimit = 0;
	private int upperLimit = 35;
	
	protected PassiveCooling(int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}
	
	protected PassiveCooling() {}

	@Override
	public BreachType classifyTemperatureBreach(double temperatureInC) {
		return BreachType.inferBreach(temperatureInC, lowerLimit, upperLimit);
	}
}