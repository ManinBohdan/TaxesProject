public class Residential extends realEstate implements toCalculateTax {


    public double Subsidy;

    public Residential (double Square, double TaxForSquareMetre, double Subsidy) {
        this.Square = Square;
        this.TaxForSquareMetre =TaxForSquareMetre;
        this.Subsidy = Subsidy;
    }



    @Override
    public double calculateTax() {
        System.out.println(this.Square * this.TaxForSquareMetre);
        System.out.println((this.Square * this.TaxForSquareMetre) * this.Subsidy / 100);
        this.Tax = this.Square * this.TaxForSquareMetre * (1 - Subsidy / 100);
        return this.Tax;
    }
}
