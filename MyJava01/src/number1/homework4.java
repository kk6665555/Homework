package number1;

import javax.swing.JOptionPane;

public class homework4 {

	public static void main(String[] args) {
		String [] a = {"�s", "��", "�L", "��", "�v", "��", "��", "�m", "��", "�h"};
		String [] b={"��","�B","��","�a","�U","�B�U","�ոU","�a�U","��","�B��","�ջ�","�a��","��"};
		String result = "";
		String number = JOptionPane.showInputDialog("�п�J�n�ഫ���Ʀr");
		String result1="";
		int b1=number.length();
		for( int i=0;i<number.length();i++){
			result =result+a[Integer.parseInt(number.substring(i,i+1))] ;
		}
		String number1 = check(result);
		System.out.println(number1);
		for (int j = 0; j<number.length();j++, b1--){
			if(result.substring(j,j+1).equals("&")){
				result1+= " ";
			}else{
				result1+=a[Integer.parseInt(number.substring(j,j+1))] + b[(b1-1)];
			}
		}
		JOptionPane.showMessageDialog(null,result1);
		//System.out.println(number1);
	}

	 static String check(String s){
        if (s == null)
            return s;
        StringBuffer sb = new StringBuffer();
        int i = 0, len = s.length();
        while (i < len) {
            char c = s.charAt(i);
            sb.append(c);
            i++;
            while (i < len && s.charAt(i) == c) {
                i++;
                sb.append("&");
            }
        }
        return sb.toString();
	}
}
