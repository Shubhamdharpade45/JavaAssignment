package assignment;

public class isPrime {
    public void checkPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime Number");
                return;
            }
        }

        System.out.println("Prime Number");
    }

}
