package number1;

import javax.swing.JOptionPane;

public class homework4 {

	public static void main(String[] args) {
		String [] a = {"箂", "滁", "禠", "把", "竩", "ヮ", "嘲", "琺", "", "╤"};
		String [] b={"じ","珺","ㄕ","","窾","珺","ㄕ","","货","珺","ㄕ","",""};
		String result = "";
		String number = JOptionPane.showInputDialog("叫块璶锣传计");
		for( int i=number.length()-1;i>=0;i--){
			result =result+a[Integer.parseInt(number.substring(i,i+1))]+b[Integer.parseInt(number.substring(i,i+1))]  ;
		
		}
		JOptionPane.showMessageDialog(null,result);
	}


}
