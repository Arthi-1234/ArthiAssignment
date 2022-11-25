package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsapp() {
		System.out.println("To connect WhatsApp using smartphone");
	}
	public void takeVideo() {
		System.out.println("To take Video");
	}

	public static void main(String[] args) {
		SmartPhone Phone = new SmartPhone();
		Phone.sendMsg();
		Phone.makeCall();
		Phone.saveContact();
		Phone.connectWhatsapp();
		Phone.takeVideo();
	}

}
