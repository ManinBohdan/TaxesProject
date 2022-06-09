public class Commercial extends realEstate implements toCalculateTax {

   public double Income;

    public Commercial(double Square, double TaxForSquareMeter, double Income) {
      this.Square = Square;
      this.TaxForSquareMetre = TaxForSquareMeter;
      this.Income = Income;
    }

    @Override
    public double calculateTax() {
        if (this.Income < 100){
            this.Tax = 0;
        }
        else {
            this.Tax = this.Square * this.TaxForSquareMetre;
        }
        return this.Tax;
    }
}
