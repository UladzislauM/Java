package details;

public class Engine {


	    private int power;
	    private String manufacturer;
	     
		  public Engine(int power, String manufacturer) {
				this.power = power;
				this.manufacturer = manufacturer;
			}
	    
	    public void setPower(int power) {
			this.power = power;
		}
	    public int getPower() {
			return power;
		}
	    
	    public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
	    public String getManufacturer() {
			return manufacturer;
	    }
	    
	    public String toString() {
			return "Power: " + power + "\n" + "Manufacturer: " + manufacturer;
		}
}
