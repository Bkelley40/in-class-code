
public class BankAccount {
	int memberID;
	String type;
	Amount balance;
	
	BankAccount (int memberID, String type, String amount)
	{
		this.memberID = memberID;
		this.type = type;
		this.balance = new Amount(amount);
	}
	
	public String getBalance ()
	{
		return balance.getBalance();
	}
	
	private class Amount
	{
		private int dollars;
		private int cents;
		
		Amount (String amount)
		{
			String[] parts = amount.split("\\.");
			this.dollars = Integer.parseInt(parts[0]);
			this.cents = Integer.parseInt(parts[1]);
		}
		
		private String getBalance ()
		{
			return "$" + this.dollars + "." + String.format("%02d", this.cents);
		}
	}
}
