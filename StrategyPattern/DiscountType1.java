public class DiscountType1 implements dDiscountCalc {

    public void calcBill(double mrp) {
       double amt,disc;
       disc=0.25;
       amt=mrp-(disc*mrp);
       System.out.println("MRP :"+mrp);
       System.out.println("After Discount, Bill Amount : "+amt);
    }

}