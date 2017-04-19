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
	  private Time b;
	  private Time1 c;
	  int x=150,y=150;
	 
	  MyPool(){
		  setBackground(Color.BLACK);
		  a=new Timer();
		  b=new Time(0,0,0);
		  c=new Time1();
		  a.schedule(b, 0,1000);
		  a.schedule(c, 0, 100);
	  }
	  
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;	
			g2d.setColor(Color.WHITE);
			g2d.drawLine(x,y,(int) (x-100*Math.cos(-c.ss1*Math.PI/300)),(int)((y+100*Math.sin(-c.ss1*Math.PI/300))));
			g2d.setColor(Color.BLUE);
			g2d.drawLine(x, y,(int)(x+80*Math.sin(b.mm*Math.PI/30)), (int)(y-80*Math.cos(b.mm*Math.PI/30)) );
			g2d.setColor(Color.CYAN);
			g2d.drawLine(x,y,(int)(x+55*Math.sin( (b.yy+b.mm/60.0) * Math.PI/6) ), (int)(x-55*Math.cos( (b.yy+b.mm/60.0) * Math.PI/6) ));

		}
		// 畫1-12 和 每秒的刻度
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

//現在的時間
  class Time extends TimerTask{
	  private  int yy,mm,ss;
	  Time(int yy,int mm, int ss){
		  this.yy=yy;this.mm=mm;this.ss=ss;
	  }
	@Override
	public void run() {
		Calendar now = Calendar.getInstance();
		yy=now.get(Calendar.HOUR_OF_DAY);
		mm=now.get(Calendar.MINUTE);
		ss=now.get(Calendar.SECOND);
		repaint();
	}
 }
  
  //讓秒針的個區隔變大
  class Time1 extends TimerTask{
	  private Time aa;
	  private int ss1;
	  Time1(){
		 aa= new Time(0,0,0);
		 ss1=(aa.ss-1)*10;
		  this.ss1=ss1;
	  }
	@Override
	public void run() {		
		ss1++;	
		repaint();
	}
	  
  }

}
 
 

 
