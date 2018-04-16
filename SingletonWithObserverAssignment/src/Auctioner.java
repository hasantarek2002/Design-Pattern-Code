import java.util.ArrayList;

public class Auctioner {
	private static Auctioner instance = null;
	public int price;

	private Auctioner() {
	}

	public static Auctioner getInstance() {
		if(instance == null) {
			instance = new Auctioner();
		}
		return instance;
	}

	public ArrayList<Observer> bidders = new ArrayList();

	public void addBidder(Observer o) {
		bidders.add(o);
	}

	public void notifyPeopleAboutPriceIncrease(int id) {
		System.out.println("bidder id "+id + " bidded");
		for (int i = 0; i < bidders.size(); i++) {
			bidders.get(i).getNotifiedAboutPriceIncrease( price);
		}
	}
	public void setInitialBidPrice() {
		this.price=500;
	}
	public void increasePrice() {
		this.price=this.price+100;
	}

}
