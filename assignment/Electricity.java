package assignment;

public class Electricity {
    public int calculateBill(int units){

        int price=8;
        int bill=price*units;
        System.out.println("Total Electricity bill: "+bill+" Rs.");

        return bill;


    }
}
