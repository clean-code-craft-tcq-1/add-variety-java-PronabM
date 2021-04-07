package typewiseAlert;

import typewiseAlert.cooling.CoolingType;

public class BatteryCharacter {
	private CoolingType coolingType;
    private String brand;
    
    public BatteryCharacter(CoolingType coolingType, String brand) {
		this.coolingType = coolingType;
		this.brand = brand;
	}
    
    public CoolingType getCoolingType() {
		return this.coolingType;
	}
    
    public String getBrand() {
		return this.brand;
	}

}
