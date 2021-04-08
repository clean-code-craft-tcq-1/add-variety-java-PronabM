package typewiseAlert.cooling;

public enum CoolingType {
	PASSIVE_COOLING(new PassiveCooling()),
    HI_ACTIVE_COOLING(new HiActiveCooling()),
    MED_ACTIVE_COOLING(new MedActiveCooling());
	
	private ICooling instance;
	
	private CoolingType(ICooling instance) {
        this.instance = instance;
    }
	
	public ICooling getInstance() {
		return this.instance;
	}
}
