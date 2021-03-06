package typewiseAlert.cooling;

import typewiseAlert.BreachType;

public class HiActiveCooling implements ICooling {
	
	private int lowerLimit = 0;
	private int upperLimit = 45;
	
	protected HiActiveCooling(int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}
	
	protected HiActiveCooling(){}

	@Override
	public BreachType classifyTemperatureBreach(double temperatureInC) {
		return BreachType.inferBreach(temperatureInC, lowerLimit, upperLimit);
	}

}
