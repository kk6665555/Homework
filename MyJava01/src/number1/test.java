package number1;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		String [] a = {"�s", "��", "�L", "��", "�v", "��", "��", "�m", "��", "�h"};
		String [] b = {"�B","��","�a"};
		
		int i1=0;
		String result = "";
		String number = JOptionPane.showInputDialog("�п�J�n�ഫ���Ʀr");
		for( int i=number.length();i>0;i-- ,i1++){	
			result =result+a[Integer.parseInt(number.substring(i1,i1+1))] + check1 (i) +check(i) ;
		}	
		result+="��";

		String result1 = check3(check2(result));
		if(result1.substring( result1.length()-2,result1.length()).equals("�s��")){
			result1=result1.substring(0,result1.length()-2) + "��";
		}
		System.out.println(result1);
		
		}
   static String check(int s){
		String ab="";
		   switch(s){
		   case 5:
			   ab="�U";
			   break;
		   case 9:
			   ab="��";	  
			   break;
		   case 13:
			   ab="��";
			   break;

		   }
		   return ab;
	   }
   static String check1(int r){

	   String ab = "";
	   switch(r % 4){
	   case 0:
		   ab="�a";
		   break;
	   case 2:
		   ab="�B";	  
		   break;
	   case 3:
		   ab="��";
		   break;

	   }
	   return ab;
   }
	static String check2(String t){
		String a1 = "";
		for (int i=0;i<t.length();i+=2){
			if(t.substring(i, i+2).equals("�s�a") || t.substring(i, i+2).equals("�s��") || t.substring(i, i+2).equals("�s�B")||t.substring(i, i+2).equals("�s�U")
					||t.substring(i, i+2).equals("�s��")|| t.substring(i, i+2).equals("�s��")){
				a1+="�s";
			}else{
				a1+=t.substring(i, i+2);
			}
			}
		return a1;
	}	
	static String check3(String y){
        if (y == null)
            return y;
        StringBuffer sb = new StringBuffer();
        int i = 0, len = y.length();
        while (i < len) {
//            char c = s.charAt(i);
        	String c = y.substring(i, i+1);
//            sb.append(c);
        	sb.append(c);
//            i++;
        	i++;
//            while (i < len && s.charAt(i) == c) {
        	while (i<len && y.substring(i, i+1).equals(c) ){
//                i++;
        		i++;
        	}
//            }
        }
        return sb.toString();
	}


}

