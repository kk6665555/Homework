package number1;

public class book3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 1000; int n = 495;int a1=0;
		for (int a = 1; a < n;a++){
			if (m % a == 0 && n % a == 0 ){
				a1 =a;
			}
		}
		System.out.println(a1);
	}

}
