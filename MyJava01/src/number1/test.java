package number1;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		String [] a = {"�s", "��", "�L", "��", "�v", "��", "��", "�m", "��", "�h"};
		String [] b = {"�B","��","�a"};
		String [] c = {"�U","��","��","��"};
		String result = "";
		String number = JOptionPane.showInputDialog("�п�J�n�ഫ���Ʀr");
		switch(number.length() % 4){
		case 2:
			result+="�B";
		case 3:
			result+="��";
		case 0:
			result+="�a";
		System.out.println(number.length() % 4);
		
		}
	}
}
