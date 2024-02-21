
public class Student {
	private String studentID; //학번
	private String name;  //이름
	private String major;  //전공
	private String telNumber;  //전화번호
	private boolean sex;  //성별 True = 남, False = 여
	private int grade;  //학년
	
	// public Student(String name, String major, String telNumber, String studentID, boolean sex, int grade) {
	// 	this.name = name;
	// 	this.major = major;
	// 	this.telNumber = telNumber;
	// 	this.studentID = studentID;
	// 	this.sex = sex;
	// 	this.grade = grade;
	// }
	
	public String getStudentID() {
		return studentID;
	}
	
	public boolean isSex() {
		return sex;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getTelNumber() {
		return telNumber;
	}
	
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	
}
