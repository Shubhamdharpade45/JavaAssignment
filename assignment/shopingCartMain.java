package assignment;

public class shopingCartMain {
    public static void main(String args[]){
        shoppingCart s= new shoppingCart();
        double cartTotal=s.calculateTotal(143.0,42.5,341.24);
        System.out.println("price of total items: "+cartTotal);
    }
}
