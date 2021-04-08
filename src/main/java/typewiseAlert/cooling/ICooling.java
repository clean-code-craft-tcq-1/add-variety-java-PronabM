package typewiseAlert.cooling;

import typewiseAlert.BreachType;

public interface ICooling {
	public BreachType classifyTemperatureBreach(double temperatureInC);
}
