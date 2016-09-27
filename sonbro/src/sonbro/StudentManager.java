//Main ( 학생 관리 프로그램 )
package sonbro;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		
		manager.addStudent("손상균", 29, 1, "컴퓨터공학과");
		manager.addStudent("손의균", 31, 2, "사회건축학과");
		manager.addStudent("홍인표", 29, 3, "게임학과");
		manager.addStudent("박대선", 28, 4, "로봇공학과");
		
		System.out.println(manager.students.get(0).getMajor() + "학과에 다니는 " + manager.students.get(0).getStudentNo() + "학번 " + manager.students.get(0).getName() + "의 나이는 " + manager.students.get(0).getAge() + "입니다.");
		// 학생 나이의 정보를 업데이트 해보자, 나이를 업데이트하는 넘버는 2번
		manager.students.get(0).updateInfo(2, "30");
		System.out.println(manager.students.get(0).getMajor() + "학과에 다니는 " + manager.students.get(0).getStudentNo() + "학번 " + manager.students.get(0).getName() + "의 나이는 " + manager.students.get(0).getAge() + "입니다.");
	}
	
	public void addStudent(String name, int age, int studentNo, String major ) {
		students.add( new Student(name, age, studentNo, major) );
		System.out.println( name + "학생 정보 입력 성공" );
	}
}
