package week1.day1;

public class Mobile {
	public void makeCall() {
		//Code to print a text
		System.out.println("TO make a call");
	}
	public void sendMsg() {
		//Code to print a text
		System.out.println("To send a message");

	}
	public static void main(String[] args) {
		String mobileBrandName = "iPhone";
		char mobileLogo ='i';
		short noOfMobilePiece = 50;
		int modelNumber = 2765689;
		long mobilemeiNumber = 7890123452L;
		float mobilePrice = 40000.89f;
		boolean isDamaged = false;
						
		//classname Object name = new classname();
		Mobile myMobile = new Mobile();
		//Call method using object
		myMobile.makeCall();
		myMobile.sendMsg();
		
		System.out.println(mobileBrandName);
		System.out.println(mobileLogo);
		System.out.println(noOfMobilePiece);
		System.out.println(modelNumber);
		System.out.println(mobilemeiNumber);
		System.out.println(mobilePrice);
		System.out.println(isDamaged);
		
	}

}
