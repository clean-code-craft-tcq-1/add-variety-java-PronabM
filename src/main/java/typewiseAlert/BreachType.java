package typewiseAlert;

public enum BreachType {
	INVALID_INPUT,
    NORMAL,
    TOO_LOW,
    TOO_HIGH;

    public static BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
    	return isInvalid(value,lowerLimit,upperLimit) ? BreachType.INVALID_INPUT 
    			: isTooLow(value, lowerLimit, upperLimit);
    }

	private static boolean isInvalid(double value, double lowerLimit, double upperLimit) {
		return Double.isNaN(value + upperLimit + lowerLimit);
	}

	private static BreachType isTooLow(double value, double lowerLimit, double upperLimit) {
		return (value < lowerLimit) ? BreachType.TOO_LOW : isTooHigh(value, upperLimit);
	}

	private static BreachType isTooHigh(double value, double upperLimit) {
		return (value > upperLimit) ? BreachType.TOO_HIGH : BreachType.NORMAL;
	}
}