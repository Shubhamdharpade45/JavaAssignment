package Inheritance;

public class Son extends Father {
	void show() {
		System.out.println("This is the Son class");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
		s.showF();
		s.showGF();
	}

}
