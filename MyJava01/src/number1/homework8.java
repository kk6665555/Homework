package number1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;




public class homework8  extends JFrame{
	private MyPool mypool; 
	homework8(){
		setLayout(new BorderLayout());
		mypool=new MyPool();

		add(mypool,BorderLayout.CENTER);
		
		setSize(350,350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new homework8();
	}
}



  class MyPool extends JPanel {
	  private Timer a;
	  private Time  b;
	  private  int yy,mm,ss,sss;
	  int x=150,y=150;
	 
	  MyPool(){
		  setBackground(Color.BLACK);
		  a=new Timer();
		  b=new Time();
		  a.schedule(b, 0,100);

	  }
	  
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);			
			g.setColor(Color.WHITE);
			g.drawLine(x,y,(int) (x+100*Math.sin((ss+sss/1000.0)*Math.PI/300)),(int)((y-100*Math.cos((ss+sss/1000)*Math.PI/300))));
			g.setColor(Color.BLUE);
			g.drawLine(x, y,(int)(x+80*Math.sin((mm+ss/60.0)*Math.PI/300)), (int)(y-80*Math.cos((mm+ss/60.0)*Math.PI/300)));
			g.setColor(Color.CYAN);
			g.drawLine(x,y,(int)(x+55*Math.sin( ((yy+mm/600.0)+(mm/60.0)) * Math.PI/60) ), (int)(x-55*Math.cos( ((yy+mm/600.0)+mm/60.0) * Math.PI/60) ));

		}
		// �e1-12 �M �C�����
		@Override
		public void paint(Graphics g) {
			String number[] = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" };
			super.paint(g);
			g.setColor(Color.BLUE);
			for(int i=0; i<60; i++){
						g.drawLine((int)(x-115*Math.cos(i*Math.PI/30)),
						(int)(y+115*Math.sin(i*Math.PI/30)),
						(int)(x-120*Math.cos(i*Math.PI/30)),
						(int)(y+120*Math.sin(i*Math.PI/30)) );
			}

			for(int i=0; i<12; i++){
						g.setColor(Color.RED);
						g.drawLine( (int)(x-110*Math.cos(i*Math.PI/6)),
						(int)(x+110*Math.sin(i*Math.PI/6)),
						(int)(x-120*Math.cos(i*Math.PI/6)),
						(int)(y+120*Math.sin(i*Math.PI/6)));
						g.setColor(Color.white); 
						g.drawString(number[i], (int)(x+135*Math.sin(i*Math.PI/6))-5,(int)(x-135*Math.cos(i*Math.PI/6))+5 );
			}
		}

//�{�b���ɶ�
  class Time extends TimerTask{
	  
	  
	 Time(){
		
	 }
	@Override
	public void run() {
		Calendar now = Calendar.getInstance();
		yy=now.get(Calendar.HOUR_OF_DAY)*10;
		mm=now.get(Calendar.MINUTE)*10;
		ss=now.get(Calendar.SECOND)*10;
		sss=now.get(Calendar.MILLISECOND)*10;
		System.out.println(yy+":"+mm+":"+ss+":"+sss);
		repaint();
	}
 }	  
 }


 
 

 
