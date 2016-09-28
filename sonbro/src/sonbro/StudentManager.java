//Main ( 학생 관리 프로그램 )
package sonbro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	static StudentManager manager = new StudentManager();
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		init();
		
	}
	
	public static void init() throws IOException, InterruptedException{
		InputStreamReader 	ir = new InputStreamReader(System.in);
		BufferedReader	 	br = new BufferedReader(ir);
	
		originalStu(manager);
		
		System.out.print("이름은 무엇입니까? : ");
		
		String name = br.readLine();
		
		boolean flag = true;
		
		for(int i=0; i < manager.students.size(); i++)
		{
			if(name.equals(manager.students.get(i).getName()))
			{
				System.out.println(manager.students.get(i).getMajor() + "학과에 다니는 " + manager.students.get(i).getStudentNo() + "학번 " + manager.students.get(i).getName() + "의 나이는 " + manager.students.get(i).getAge() + "입니다.");
				flag = false;
				
				init();
			}
		}
		
		if(flag)
		{
			System.out.println("등록된 학생이 아닙니다.");
			System.out.println("등록합니다.");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			
			updateStu(manager, name);
			
		}
		
		
		
	}
	
	public static void updateStu(StudentManager manager, String name) throws IOException, InterruptedException{
		// 학생 나이의 정보를 업데이트 해보자, 나이를 업데이트하는 넘버는 2번
		manager.addStudent(name, 1, 20, "신인생");
		
		System.out.println("");
		System.out.println(name+" 학생이 등록되었습니다.");
		
		init();
	}
	
	public static void originalStu(StudentManager manager) throws IOException{
		manager.addStudent("손상균", 29, 1, "컴퓨터공학과");
		manager.addStudent("손의균", 31, 2, "사회건축학과");
		manager.addStudent("홍인표", 29, 3, "게임학과");
		manager.addStudent("박대선", 28, 4, "로봇공학과");
	}
	
	public void addStudent(String name, int age, int studentNo, String major ) {
		students.add( new Student(name, age, studentNo, major) );
	}
}
