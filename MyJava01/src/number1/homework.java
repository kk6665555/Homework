package number1;

import javax.swing.JOptionPane;

public class homework {

	public static void main(String[] args) {
		String s = new String(); 
		while (!s.matches("\\d+")) {    
			s = JOptionPane.showInputDialog(null, "請輸入要查詢質數的範圍", "請輸入數字"); 
}
		int b = Integer.parseInt(s);
		String Prime = new String();
		for (int a = 1 ; a <= b ; a++){
			int number = 0 ;
			//System.out.print(a + "\t");
			for (int c = 1 ; c <= b ; c++){
				if (a % c == 0){
					number++;
				}
		}
		if(number<=2){
		Prime = Prime + " " + a;
			}
		}
		JOptionPane.showMessageDialog(null,"質數為:" + Prime);

}
}