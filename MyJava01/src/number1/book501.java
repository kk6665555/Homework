package number1;

public class book501 {

	public static void main(String[] args) {
		int [][] maze ={
				{2,2,2,2,2,2,2},
				{0,0,0,0,0,0,2},
				{2,0,2,0,2,0,2},
				{2,0,0,2,0,2,2},
				{2,2,0,2,0,2,2},
				{2,0,0,0,0,0,2},
				{2,2,2,2,2,0,2}
		};
		for(int[] a : maze){
			for(int b : a){
				switch(b){		
				case 0:
				System.out.print("B");
				break;
				case 2:
				System.out.print("A");
				break;			
			}
		}
			System.out.println();
		}
	}
	
}
