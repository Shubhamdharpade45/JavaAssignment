package assignment;

public class eSalary {
    public double calculateSalary(double basic){
        double hra=7000.0;
        double da=10000;
        basic=basic+hra+da;
        System.out.println("Salary After HRA & DA: "+basic);

        return basic;
    }
}
