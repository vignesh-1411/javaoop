package hasA;

public class Engine {
	
	private String power;
	private String engineType;
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public Engine(String power, String engineType) {
		super();
		this.power = power;
		this.engineType = engineType;
	}
	
	

}
