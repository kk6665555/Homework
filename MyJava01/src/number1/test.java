package number1;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		String [] a = {"箂", "滁", "禠", "把", "竩", "ヮ", "嘲", "琺", "", "╤"};
		String [] b = {"珺","ㄕ",""};
		String [] c = {"窾","货","","ㄊ"};
		String result = "";
		String number = JOptionPane.showInputDialog("叫块璶锣传计");
		switch(number.length() % 4){
		case 2:
			result+="珺";
		case 3:
			result+="ㄕ";
		case 0:
			result+="";
		System.out.println(number.length() % 4);
		
		}
	}
}
