package number1;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		String [] a = {"箂", "滁", "禠", "把", "竩", "ヮ", "嘲", "琺", "", "╤"};
		String [] b = {"珺","ㄕ",""};
		
		int i1=0;
		String result = "";
		String number = JOptionPane.showInputDialog("叫块璶锣传计");
		for( int i=number.length();i>0;i-- ,i1++){	
			result =result+a[Integer.parseInt(number.substring(i1,i1+1))] + check1 (i) +check(i) ;
		}	
		result+="じ";

		String result1 = check3(check2(result));
		if(result1.substring( result1.length()-2,result1.length()).equals("箂じ")){
			result1=result1.substring(0,result1.length()-2) + "じ";
		}
		System.out.println(result1);
		
		}
   static String check(int s){
		String ab="";
		   switch(s){
		   case 5:
			   ab="窾";
			   break;
		   case 9:
			   ab="货";	  
			   break;
		   case 13:
			   ab="";
			   break;

		   }
		   return ab;
	   }
   static String check1(int r){

	   String ab = "";
	   switch(r % 4){
	   case 0:
		   ab="";
		   break;
	   case 2:
		   ab="珺";	  
		   break;
	   case 3:
		   ab="ㄕ";
		   break;

	   }
	   return ab;
   }
	static String check2(String t){
		String a1 = "";
		for (int i=0;i<t.length();i+=2){
			if(t.substring(i, i+2).equals("箂") || t.substring(i, i+2).equals("箂ㄕ") || t.substring(i, i+2).equals("箂珺")||t.substring(i, i+2).equals("箂窾")
					||t.substring(i, i+2).equals("箂货")|| t.substring(i, i+2).equals("箂")){
				a1+="箂";
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

