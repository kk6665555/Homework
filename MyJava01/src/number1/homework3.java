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
		String s = new String(); int year; int month=12;
		s=JOptionPane.showInputDialog("請輸入年分");
		year=Integer.parseInt(s);
		int[][][] aa = new int[year][month][];
		
		for (int i = 0;i<=11;i++){
			switch(i){
			case 0: case 2: case 4: case 6: case 7: case 9: case 11:
			aa[year-1][i]=new int[31];
			break;
			case 3: case 5: case 8: case 10:
			aa[year-1][i]=new int[30];
			break;
			case 1:
				if (year % 4 == 0){
					if (year % 100 == 0){
						if (year % 400 == 0){
							aa[year-1][1]=new int[29];
							// 29
						}else{
							aa[year-1][1]=new int[28];
							// 28
						}
					}else{
						aa[year-1][1]=new int[29];
						// 29
					}
				}else{
					aa[year-1][1]=new int[28];
					// 28
				}
				break;
		}
		}
		
			
		for(int y = 1752 ; y<aa.length;y++){
			for(int m = 0 ; m < aa[y].length;m++){
				for(int d = 0; d< aa[y][m].length;d++){
					aa[y][m][d]=d+1;
					System.out.print(aa[y][m][d]);
				}
			
		}
		}
	
		
		
		//for (int a = 1;a<31;a++){
			//System.out.print(a + "\t");
			//if (a % 7 == 0){
				//System.out.println();
			//}
		//}
	}

}
