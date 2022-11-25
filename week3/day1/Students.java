package week3.day1;

public class Students {
	
	
	public void getStudentInfo(int stuid) {
		System.out.println("Student id is " +stuid);
	}

	public void getStudentInfo(int stuid, String Stuname) {
		System.out.println(stuid + Stuname);
	}
	
	public void getStudentInfo(String stuemailid,long stumobnum) {
		System.out.println(stuemailid + stumobnum);
	}

	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(6058);
		info.getStudentInfo(6058, "Arthi");
		info.getStudentInfo("arthi.san87@gmail.com", 9768054321l);

	}

}
