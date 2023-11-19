package hw6.if_else;

public class FindLetterGrade {

	/* 
	2. Manna has inconsistent grades throughout his classes. 
	Make a program that helps him keep track of his grades to know if he will pass or not. 
	Grades available: 90-100% = A, 80-89% = B, 70-79% C, 60-69% D, or Fail.
	 */
	
	public static void main(String[] args) {
		int grade = -2134;
		
		if (grade >=90 ) {
			System.out.println("A");
		} else if (grade >=80 && grade <=89) {
			System.out.println("B");
		} else if (grade >=70 && grade <=79) {
			System.out.println("C");
		} else if (grade >=60 && grade <=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	
}
