package week1.day1;

public class TwoWheeler {
	
	public int noOfWheels = 4;
	public short noOfMirrors = 3;
	public long chassisNumber = 5345345357L;
	public boolean isPunctured = true;
	public String bikeName ="YamahaFZ";
	public double runningKM =52.78;
		

	public static void main(String[] args) {
		
		TwoWheeler Spec = new TwoWheeler();
		System.out.println(Spec.noOfWheels);
		System.out.println(Spec.noOfMirrors);
		System.out.println(Spec.chassisNumber);
		System.out.println(Spec.isPunctured);
		System.out.println(Spec.bikeName);
		System.out.println(Spec.runningKM);
	
	}

}
