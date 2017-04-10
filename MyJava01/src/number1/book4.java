package number1;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.CORBA.LongLongSeqHelper;

public class book4 {
	public static void main(String arg[]){
		Scanner console = new Scanner(System.in);
		int number = Integer.parseInt(console.nextLine());
		switch(number){
		case 0:
			break;
		case 1:
			System.out.print("0");
			break;
		case 2:
			System.out.print("0"+" "+"1");
			break;
		case 3:
			System.out.print("0"+" "+"1"+" "+"1");
			break;
		default:
			System.out.print("0"+" "+"1"+" "+"1"+" "+check(number));

		}	
	
	}
	static String  check(int j){
		int sum=0,a=1,b=1;String aa = "";
		for(int i=3;i<j;i++){
			sum = a + b;
			a = b;
			b = sum;
			aa+=sum+" ";
		}			
		return aa;
	}
}
	