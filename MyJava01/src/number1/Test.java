package number1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame{
	private MyPan a;
	Test(){
		setLayout(new BorderLayout());
		
		a=new MyPan();
		
		add(a,BorderLayout.CENTER);
		
		setSize(350,350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Test();
	}
}
class MyPan extends JPanel{
	int x =150,y=150;
	MyPan(){
		setBackground(Color.black);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;	
		for(int i = 0;i<360;i++){
		g2d.setColor(Color.WHITE);
		g2d.drawLine(x,y,(int) (x-100*Math.cos(i*Math.PI/180)),(int)((y+100*Math.sin(i*Math.PI/180))));
		}
	}
}
//	class a1 extends TimerTask{
//		private  int aa=0;
//		a1(int aa){
//			this.aa=aa;
//		}
//		@Override
//		public void run() {
//			for(int i = 0;i<60;i++){
//				aa++;
//		}
//	}
//}
