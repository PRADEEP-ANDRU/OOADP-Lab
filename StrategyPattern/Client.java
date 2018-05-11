
public class Client {

    public static void main(String[] args) {
    	double mrp=9000;
    	DecathlonCustomer dc=new RegCustomer("Pradeep","Regular");
    	dc.setDiscount(new DiscountType1());
    	dc.display();
    	dc.calcDiscount(mrp);
    	dc.setDiscount(new DiscountType2());
    	dc.calcDiscount(mrp);
    }

}