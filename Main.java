public class Main {

	public static void main(String[] args) {
		Auction a = new Auction("Computer", 200);
		a.Show();		
		a.MakeBid("Jay", 201);
		a.Show();	
		a.MakeBid("Sneaky Guy", 199);
		a.Show();
		a.MakeBid("Rich Guy", 100);
		a.Show();	
		int curr = a.GetCurrentBid();
		
		Auction b = new Auction("Table", 50);
		b.Show();		
		a.MakeBid("Rich", 150);
		b.MakeBid("Rich", 150);
		a.Show();
		b.Show();

		String s = "Hello";
		String[] sr = {"Hi", "there", "Whats", "up"};
		System.out.println(s.toUpperCase());
		System.out.println(String.join(" ", sr));

	}
	


}
