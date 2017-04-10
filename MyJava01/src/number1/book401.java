package number1;

public class book401 {
	public static void main(String arg[]){
		String[] a = {"±ö","¿j","¤ß","®ç"};
		String[] b = {"1","2","3","4","5","6","7","8","9","10"};
		for(int i =0; i<4;i++){
			for(int j=0;j<10;j++){
				System.out.print(a[(int) (Math.random()*4)] + b[(int) (Math.random()*10)] + "\t");
			}
		System.out.println();
		}
	}
}
