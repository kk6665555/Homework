package number1;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		String [] a = {"箂", "滁", "禠", "把", "竩", "ヮ", "嘲", "琺", "", "╤"};
		String [] b = {"珺","ㄕ",""};
		String [] c = {"窾","货","","ㄊ"};
		String result = "";
		String number = JOptionPane.showInputDialog("叫块璶锣传计");
		for( int i=0;i<number.length();i++){
			
			result =result+a[Integer.parseInt(number.substring(i,i+1))] ;
		}
		
		
		System.out.println(result);
		
		}
	}
