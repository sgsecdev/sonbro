//재적학생 객체
package sonbro;

import java.util.ArrayList;

public class StudentExpel {
	
	ArrayList<Student> expelStudent;
	
	public StudentExpel() {
		expelStudent = new ArrayList<Student>();
	}
	
	public void addExpelStudent( String name, int age, int studentNo, String major ) {
		expelStudent.add( new Student( name, age, studentNo, major ));
	}
}
