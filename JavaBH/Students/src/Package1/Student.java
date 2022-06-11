package Package1;

public class Student {
	private String name;
	private String lastName;
	private int age;
	private Address address;
	
	Student(){
		this.name = "Undefind";
		this.lastName = "Undefind";
		this.age = 0;
		this.address = new Address();
	}

	Student(String name, String lastName, int age, Address address){
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	 }

    public void setName(String name) {
    	this.name = name;
	}
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public void setAddress(Address address) {
    	this.address = address;
    }
    
    
    public String getName() {
		return name;
	}
    public String getLastName() {
    	return lastName;
    }
    public int getAge() {
		return age;
	}
    public Address getAddress() {
		return address;
	}
    
    public void PrintMetodST() {
		System.out.println(name + ", " + lastName  + ", " + age + "\n");
		address.PrintMetodAD();
	}
}
