package Package1;

public class Group {
	private String groupName;
	private int kurs;
	private Student student;
	private Teacher teacher;

	Group(){
		this.groupName = "Undefind";
		this.kurs = 0;
		this.student = new Student();
		this.teacher = new Teacher();
	}
	Group(String groupName, int kurs){
		this.groupName = groupName;
		this.kurs = kurs;
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public void setKurs(int kurs) {
		if(kurs > 0){
			this.kurs = kurs;
	    }
	}

	public String getGroupName() {
		return groupName;
	}
	public int getKurs() {
		return kurs;
	}
	
	public void ChangeStudent(Student student){
		this.student = student;
	}
	public void ChangeTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Teacher geTeacher() {
		return teacher;
	}
	public Student getStudent() {
		return student;
	}
	
	public void PrintMetodGr() {
		System.out.println(groupName + ", " + kurs + "\n");
		student.PrintMetodST();
		teacher.PrintMetodTR();
	}
	
}
