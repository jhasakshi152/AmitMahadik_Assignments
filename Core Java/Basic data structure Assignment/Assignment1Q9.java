import java.util.*;
class Student {
    private int subjectA,subjectB,subjectC;

    public int studentsTotalMarksInAllSubjects(Student[] students) {
    	
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
    	
    }
    
    public int[] subjectWiseMarks(Student[] students,String subjectName) {
    	
    }
    
    public int subjectATotalByStudents(int[] marks) {
    	
    }
    
    public int subjectBTotalByStudents(int[] marks) {
    	
    }
    
    public int subjectCTotalByStudents(int[] marks) {
    	
    }

    public int subjectTotalByStudents(int[] marks) {
    	
    }

    public double subjectAAverageByStudents(int[] marks) {
    	
    } 
    
    public double subjectBAverageByStudents(int[] marks) {
    	
    }
    
    public double subjectCAverageByStudents(int[] marks) {
    	
    }

}
public class Assignment1Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int []m1 = new int[3];
		int []m2 = new int[3];
		int []m3 = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter marks for subjects A, B, C : ");
            m1[i] = sc.nextInt();
            m2[i] = sc.nextInt();
            m3[i] = sc.nextInt();
		}
		Student s = new Student();
		System.out.print("Students total marks in all subjects: ");
		s.studentsTotalMarksInAllSubjects();
		
		

	}

}