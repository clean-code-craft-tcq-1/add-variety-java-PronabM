package typewiseAlert.alert;

public enum AlertTarget {
	TO_CONTROLLER(new ControllerAlert()),
    TO_EMAIL(new EmailAlert());
    
    private IAlert instance;
	
	private AlertTarget(IAlert instance) {
        this.instance = instance;
    }
	
	public IAlert getInstance() {
		return this.instance;
	}
}
