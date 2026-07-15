package assignment;

public class rideMain {
    public static void main(String args[]){
        rideBooking r = new rideBooking();
        double totalFare=r.calculateFare(34);
        System.out.println("Fare ror this ride is: "+totalFare);
    }
}
