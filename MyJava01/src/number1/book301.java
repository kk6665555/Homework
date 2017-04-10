package number1;

public class book301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int a = 0;int b = 0; int c = 0;
		for (int a1 = 100 ;a1<999 ;a1++){
		     	a = a1 / 100; 
		        b = (a1 % 100) / 10; 
		        c = a1 % 10; 
		        if(a*a*a + b*b*b + c*c*c == a1) 
		        	System.out.print(a1 + "\t");
		}
		
	}
}
