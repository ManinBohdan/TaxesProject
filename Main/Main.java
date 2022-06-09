public class Main {
    public static void main(String[] args) {
        var flat = new Residential(25, 15, 40);
        var company = new Commercial(115, 15, 55000);
        var factory = new Industrial(1273,5);
        System.out.println("Tax for flat is: " + flat.calculateTax());
        System.out.println("Tax for company is: " + company.calculateTax());
        System.out.println("Tax for factory is: " + factory.calculateTax());
    }
}
