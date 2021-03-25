//Encapsulation
public class Auction {
	private String Item;
	private int Bid; //fields - variables of class
	private String Buyer; //state of the class
	public Auction(String item, int minBid){
		Item = item;
		Bid = minBid;
		Buyer = "No Buyers atm ;(";
	}
	public void Show(){
		System.out.println("We want to sell " 
				+ Item);
		System.out.println("Current bid is " 
				+ Bid);
		System.out.println("Current Buyer is " 
				+ Buyer);
	}
	public void MakeBid(String newBuyer,
			int newBid){
		if(newBid <= Bid){
			System.out.println("Sir, " + 
					newBuyer + ", You have to bid more than " +
					Bid);
			return;
		}			
		Buyer = newBuyer;
		Bid = newBid;
	}
	public int GetCurrentBid(){
		return Bid;
	}
}
