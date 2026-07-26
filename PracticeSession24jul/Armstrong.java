package PraciceSession24jul;

public class Armstrong {

	boolean isarmstrong(int num) {
		int sum = 0;
		int tNum = num;
		while (tNum != 0) {
			int lastDigit = tNum % 10;
			int cube = lastDigit * lastDigit*lastDigit;
			sum = sum + cube;
			tNum= tNum/10;
			
		}

		if (num == sum) {
			return true;
		} else {
			return false;
		}

	}
}
