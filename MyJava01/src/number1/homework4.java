package number1;

import javax.swing.JOptionPane;

public class homework4 {

	public static void main(String[] args) {
		String [] a = {"�s", "��", "�L", "��", "�v", "��", "��", "�m", "��", "�h"};
		String [] b={"��","�B","��","�a","�U","�B","��","�a","��","�B","��","�a","��"};
		String result = "";
		String number = JOptionPane.showInputDialog("�п�J�n�ഫ���Ʀr");
		for( int i=number.length()-1;i>=0;i--){
			result =result+a[Integer.parseInt(number.substring(i,i+1))]+b[Integer.parseInt(number.substring(i,i+1))]  ;
		
		}
		JOptionPane.showMessageDialog(null,result);
	}


}
