package example.angularspring.dto;

public class Speed {
	private String maxSpeed;
	private String day;
	
	public Speed() {
		super();
	}

	public Speed(String maxSpeed, String day) {
		super();
		this.maxSpeed = maxSpeed;
		this.day = day;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Speed [maxSpeed=" + maxSpeed + ", day=" + day + "]";
	}
}
