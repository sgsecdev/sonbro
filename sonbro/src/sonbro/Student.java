//학생 객체
package sonbro;

public class Student {
	private String name;
	private int age;
	private int studentNo;
	private String major;
	
	public Student(String name, int age, int studentNo, String major) {
		this.name = name;
		this.age = age;
		this.studentNo = studentNo;
		this.major = major;		
	}
	
	public void updateInfo(int i, String info) {
		switch(i) {
		case 1:
			setName(info);
			break;
		case 2:
			setAge(Integer.parseInt(info));
			break;
		case 3:
			setStudentNo(Integer.parseInt(info));
			break;
		case 4:
			setMajor(info);
			break;
		default:
			System.out.println("error update info");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
