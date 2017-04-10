package number1;

import java.util.Scanner;

public class book403 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();int e=0;int a1=0;
		int [] number ={1,10,31,33,37,48,60,70,80};
		for(int i:number){
			if(b==i){
				System.out.println(e);
				a1++;
			}
			e++;
		}
		if(a1!=1){
			System.out.println(-1);
		}
	}

}
