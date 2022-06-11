package Package1;

public class Teacher {
	private String name;
	private String lastName;
	private int age;
	private int salary;
	private Address address;

	Teacher(){
		this.name = "Undefind";
		this.lastName = "Undefind";
		this.age = 0;
		this.salary = 0;
		this.address  = new Address();
	}

	Teacher(String name, String lastName, int age, int salary, Address address){
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
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
    public void setSalary(int salary) {
    	this.salary = salary;
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
    public int gelSalry() {
    	return salary;
    }
    public Address getAddress() {
		return address;
	}

	public int payRollCalculation(int hoursWorked, int costPerHour) {
		salary = hoursWorked * costPerHour;
		return salary;
	}
	
	public void PrintMetodTR() {
		System.out.println(name + ", " + lastName + ", " + age + ", " + salary +"\n");
		address.PrintMetodAD();
	}
}
