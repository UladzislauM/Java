package professions;

public class Driver {
	
	private String name;
	private int drivingExperience;
	
	public Driver(String name, int drivingExperience) {
		this.name = name;
		this.drivingExperience = drivingExperience;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDrivingExperience() {
		return drivingExperience;
	}
	public void setDrivingExperience(int drivingExperience) {
		this.drivingExperience = drivingExperience;
	}
	
	public String ToString() {
		return "Name Driver: " + name + "\n" + "Driving Experience: " + drivingExperience;
	}

}
