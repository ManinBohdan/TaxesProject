public class Industrial extends realEstate implements toCalculateTax {

    public Industrial (double Square, double TaxForSquareMeter) {
        this.Square = Square;
        this.TaxForSquareMetre = TaxForSquareMeter;
    }

    @Override
    public double calculateTax() {
        this.Tax = this.Square * this.TaxForSquareMetre;
        return this.Tax;
    }
}
