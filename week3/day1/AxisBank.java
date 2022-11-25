package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Axisbank deposit: 200000");
	}
	
	public static void main(String[] args)  {
		AxisBank bank = new AxisBank();
		bank.saving();
		bank.deposit();
		bank.fixed();
		BankInfo info = new BankInfo();
		info.deposit();
	}

}
