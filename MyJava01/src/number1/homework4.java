package number1;

import javax.swing.JOptionPane;

public class homework4 {

	public static void main(String[] args) {
		String [] a = {"箂", "滁", "禠", "把", "竩", "ヮ", "嘲", "琺", "", "╤"};
		String [] b={"じ","珺","ㄕ","","窾","珺","ㄕ","","货","珺","ㄕ","",""};
		String result = "";
		String number = JOptionPane.showInputDialog("叫块璶锣传计");
		String result1="";
		int b1=number.length();
		for( int i=0;i<number.length();i++){
			result =result+a[Integer.parseInt(number.substring(i,i+1))] ;
		}
		String number1 = check(result);
		System.out.println(result);
		for (int j = 0; j<number1.length();j++, b1--){
			if(number1.substring(j,j+1).equals("&")){
				//result1+= a[Integer.parseInt(number.substring(j,j+1))];
			}else if(number1.substring(j,j+1).equals("箂")){
				//result1+=a[Integer.parseInt(number.substring(j,j+1))] + b[(b1-1)];
			result1+="箂";
			}else{
			result1+=a[Integer.parseInt(number.substring(j,j+1))] + b[(b1-1)];
			}
		}
		if(result1.substring(result1.length()-2, result1.length()).equals("箂じ")){result1=result1.substring(0, result1.length()-2)+result1.substring(result1.length()-1, result1.length());}
		JOptionPane.showMessageDialog(null,result1);
	}

	 static String check(String s){
        if (s == null)
            return s;
        StringBuffer sb = new StringBuffer();
        int i = 0, len = s.length();
        while (i < len) {
//            char c = s.charAt(i);
        	String c = s.substring(i, i+1);
//            sb.append(c);
        	sb.append(c);
//            i++;
        	i++;
//            while (i < len && s.charAt(i) == c) {
        	while (i<len && s.substring(i, i+1).equals(c) && s.substring(i, i+1).equals("箂")){
//                i++;
        		i++;
        		sb.append("&");
        	}
//            }
        }
        return sb.toString();
	}
}
