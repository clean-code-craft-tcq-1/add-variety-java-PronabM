package typewiseAlert.cooling;

import typewiseAlert.BreachType;

public class MedActiveCooling implements ICooling {
	private int lowerLimit = 0;
	private int upperLimit = 40;
	
	protected MedActiveCooling(int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}
	
	protected MedActiveCooling() {}

	@Override
	public BreachType classifyTemperatureBreach(double temperatureInC) {
		return BreachType.inferBreach(temperatureInC, lowerLimit, upperLimit);
	}
}
