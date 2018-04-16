import java.util.Scanner;

public class Factory {
	Auctioner auctioner = Auctioner.getInstance();
	Scanner sc = new Scanner(System.in);

	public Factory() {

		System.out.println("Enter the number of bidders (at least one bidder)");

		int bidders = sc.nextInt();

		for (int i = 0; i < bidders; i++) {
			auctioner.addBidder(new Bidder(i+1));
		}
		auctioner.setInitialBidPrice();
		startAuction();

	}

	public void startAuction() {
		
		for(; ;) {
			
			System.out.println("Enter bidder id who wants to bid OR 0 to exit the bid auction");
			int id=sc.nextInt();
			if(id > auctioner.bidders.size() || id <0 ) {
				System.out.println("invalid bidder id. Try again");
				continue;
			}
			if(id == 0) {
				System.out.println("auction finished");
				break;
			}
			auctioner.notifyPeopleAboutPriceIncrease(id);
			auctioner.increasePrice();
			
		}

	}
}
