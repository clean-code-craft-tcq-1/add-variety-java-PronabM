package typewiseAlert.cooling;

import typewiseAlert.BreachType;

public class PassiveCooling implements ICooling {
	
	private int lowerLimit = 0;
	private int upperLimit = 35;
	
	public PassiveCooling(int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}
	
	public PassiveCooling() {}

	@Override
	public BreachType classifyTemperatureBreach(double temperatureInC) {
		return BreachType.inferBreach(temperatureInC, lowerLimit, upperLimit);
	}
}