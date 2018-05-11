
public class DiscountType2 implements dDiscountCalc {

    public void calcBill(double mrp) {
        double amt,disc;
        disc=0.4;
        amt=mrp-(disc*mrp);
        System.out.println("MRP: "+mrp);
        System.out.println("After Discount, Bill Amount: "+amt);
    }

}