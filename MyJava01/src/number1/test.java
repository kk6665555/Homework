package number1;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		String [] a = {"�s", "��", "�L", "��", "�v", "��", "��", "�m", "��", "�h"};
		String [] b = {"�B","��","�a"};
		String [] c = {"�U","��","��","��"};
		String result = "";
		String number = JOptionPane.showInputDialog("�п�J�n�ഫ���Ʀr");
		for( int i=0;i<number.length();i++){
			
			result =result+a[Integer.parseInt(number.substring(i,i+1))] ;
		}
		
		
		System.out.println(result);
		
		}
	}
