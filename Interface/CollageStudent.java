package com.Interface;

public class CollageStudent implements Student {

	@Override
	public void calculateresult() {
		int marks=78;
		
		if(marks>Student.passingMarks) {
			System.out.println("Collage Student is pass "+marks);
		}else {
			System.err.println("Fail");
		}
		
	}

}
