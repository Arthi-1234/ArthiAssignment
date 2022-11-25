package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Screen resolution - 1280 x 1024");
	}

	public static void main(String[] args) {
		Desktop sys = new Desktop();
		sys.computerModel();
		sys.desktopSize();

	}

}
