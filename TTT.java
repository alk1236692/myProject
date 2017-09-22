package test;

public class TTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(1000);
	}

	private static Object test(int i) {
		
		for(int j=0;j<1000;j++){
			System.out.println(j);
			return test(j);
			
		}
		
		
		return -1;
	}
	

}
