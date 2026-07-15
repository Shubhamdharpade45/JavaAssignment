package assignment;

public class bankInterest {

    public double calculateInterest(double principle, double rate, int time){

        double interest=(principle*rate*time)/100;

        System.out.println(interest);

        return interest;
    }
}
