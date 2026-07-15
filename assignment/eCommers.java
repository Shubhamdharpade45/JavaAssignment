package assignment;

public class eCommers {

    public double calculateDiscount( double  price){


        double disscountpercent=15;
        double disscount=(price*disscountpercent/100);
        price=price-disscount;

        System.out.println("Final price after Dissoount: "+price);
        return price;

    }
}
