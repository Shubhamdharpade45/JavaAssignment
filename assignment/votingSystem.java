package assignment;

public class votingSystem {
    public void vote(int age){
        if (age>=18){
            System.out.println("Age is "+age+" Applicable for voting");
        }
        else {
            System.out.println("Age is "+age+" Not Applicable for voting");
        }
    }
}
