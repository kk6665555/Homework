package number1;

import javax.swing.JOptionPane;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		String q = new String();
		boolean sum = false;
		int i = 0;
		s = JOptionPane.showInputDialog("請輸入密碼");
		while(sum!=true){
		for (int a = 0 ; a < s.length();a++){
			if ((s.charAt(a)>=48 && s.charAt(a)<=57) || s.charAt(a)==36 || s.charAt(a)==37 || s.charAt(a)==42 || s.charAt(a)==63
		|| s.charAt(a)==95 || s.charAt(a)==94 || (s.charAt(a)>=65 && s.charAt(a)<=90) || (s.charAt(a)>=97&&s.charAt(a)<=122)){
				i=i+1;
			}	
			}
		if(i == s.length()){
			JOptionPane.showMessageDialog(null,"密碼設置成功") ;
			sum=true;
			break;
		}else{
			q=JOptionPane.showInputDialog(null,"請重新輸入密碼","密碼範圍A-Z:a-z:0-9:$?_^% ");
			s=q;
			}
		}
		}
			
	}
		
		
	


	
	



