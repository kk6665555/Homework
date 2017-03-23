package number1;

import javax.swing.JOptionPane;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]pp ={"日","一","二","三","四","五","六"};
		for (int i = 0;i<pp.length;i++){
			System.out.print(pp[i]+"\t");
		}
		
		
		System.out.println();
		String s = new String(); int year; int month=12;int sum=0;int mm;
		String q = new String();String Blank = "";String e = "";
		s=JOptionPane.showInputDialog("請輸入年分");
		q=JOptionPane.showInputDialog("請輸入月分");
		
		year=Integer.parseInt(s);
		mm=Integer.parseInt(q);
		int[][][] aa = new int[year][month][];
		for(int y = 1752 ; y<=aa.length;y++){
		for (int i = 0;i<aa[y-1].length;i++){
			switch(i){
			case 0: case 2: case 4: case 6: case 7: case 9: case 11:
			aa[y-1][i]=new int[31];
			break;
			case 3: case 5: case 8: case 10:
			aa[y-1][i]=new int[30];
			break;
			case 1:
				if (y % 4 == 0){
					if (y % 100 == 0){
						if (y % 400 == 0){
							aa[y-1][1]=new int[29];
							// 29
						}else{
							aa[y-1][1]=new int[28];
							// 28
						}
					}else{
						aa[y-1][1]=new int[28];
						// 28
					}
				}else{
					aa[y-1][1]=new int[28];
					// 28
				}
				break;
		}

		}
								
		
			for(int m = 0 ; m < aa[y-1].length;m++){
				for(int d = 0; d< aa[y-1][m].length;d++){

					sum=sum+1;
					aa[y-1][m][d]=d+1;
				}
		}
		}		
		
	for (int b = 0;b<(((sum-aa[year-1][mm-1].length)%7)-3);b++){
				Blank=Blank + "\t";
	}
		
		
		for (int a = 0;a<aa[year-1][mm-1].length;a++){
			e=e+(aa[year-1][mm-1][a]+"\t");		
	}
		System.out.println(Blank+e);
		System.out.println(sum);
	}

}
