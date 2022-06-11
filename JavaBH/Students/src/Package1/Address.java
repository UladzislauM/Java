package Package1;

public class Address {
	 private String city;
	 private String street;
	 private int house;
	 private int flat;
	 
	 public Address() {
		this.city = "Undefind";
		this.street = "Undefind";
		this.house = 0;
		this.flat = 0;
	}
	 
	 Address(String city, String street, int house, int flat) {
		this.city = city;
		this.street = street;
		this.house = house;
		this.flat = flat;
	}
	 
	 public void setCity(String city) {
			 this.city = city;
	 }
	 public void setStreet(String street) {
		 this.street = street;
	 }
	 public void setHouse(int house) {
		 if (house > 0) {
			 this.house = house;
		}
	 }
	 public void setFlat(int flat) {
		 if (flat > 0) {
			 this.flat = flat;
		}
    }

	 public String getCity() {
		return city;
	}
	 public String getStreet() {
		 return street;
	 }
	 public int getHouse() {
		 return house;
	 }
	 public int getFlat() {
		 return flat;
	 }
	 
	 public void PrintMetodAD() {
		System.out.println(city + ", " + street + ", " + house + ", " + flat);
	}
}
