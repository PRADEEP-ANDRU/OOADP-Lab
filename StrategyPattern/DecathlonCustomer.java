
public abstract class DecathlonCustomer {

	static String name;
	static String type;

	dDiscountCalc ddc;
	
	public DecathlonCustomer(String n,String t) {name=n;type=t;    }

    public void setDiscount(dDiscountCalc rdc) {
    	ddc=rdc;        
    }

    public void calcDiscount(double mrp) {
        ddc.calcBill(mrp);
    }

    public void display() {
        System.out.println("Name: "+name+"\nType: "+type);
    }

}