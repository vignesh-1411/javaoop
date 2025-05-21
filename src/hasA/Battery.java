package hasA;

public class Battery {
	private String type;
	private int batteryCapacity;
	public Battery(String type, int batteryCapacity) {
		super();
		this.type = type;
		this.batteryCapacity = batteryCapacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
}
