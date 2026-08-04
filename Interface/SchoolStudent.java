package com.Interface;

public class SchoolStudent  implements Student{

	@Override
	public void calculateresult() {
		int marks=89;
		if(marks>=Student.passingMarks) {
			System.out.println("School Student is Pasa "+marks);
		}else {
			System.err.println("Fail");
		}
		
		
	}

}
