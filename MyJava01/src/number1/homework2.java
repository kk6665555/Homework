package number1;

import javax.swing.JOptionPane;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String(); 
		while (check(s)==false){    
			s = JOptionPane.showInputDialog(null, "請輸入要查詢質數的範圍", "請輸入數字");
		}
		
		}
	
	static boolean check(String s){
		int a = 0 ; int b = 1 ;
		for (int i = 0 ; i < s.length(); i++){
			if ((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=65 && s.charAt(i)<=90) || s.charAt(i)==36 || s.charAt(i)==37
				|| s.charAt(i)==42 || s.charAt(i)==63 ||s.charAt(i)==94 || s.charAt(i)==95 || ((s.charAt(i)>=48 && s.charAt(i)<=57))){
				a++;
			}else{
				b++;
			}
	}
		if (b>1){
			return false;
		}else{
			return true;
		}

	}
}


