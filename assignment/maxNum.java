package assignment;

public class maxNum {
    public void findMaximum(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3){
            System.out.println("Maximum number is: "+num1);
        } else if (num2 > num1 && num2 >num3) {
            System.out.println("Maximum number is "+num2);
        }
        else {
            System.out.println("Maximum number is "+num3);
        }

    }
}