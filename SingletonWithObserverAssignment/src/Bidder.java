
public class Bidder implements Observer{

	private int id;
	public Bidder(int id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getNotifiedAboutPriceIncrease(int price) {
		// TODO Auto-generated method stub
		System.out.println(id + " is notified. New price is : " + price);
		
	}
	
}
