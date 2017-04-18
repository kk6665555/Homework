package number1;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* @author sidwang
*/
public class Javaclock {

public static void main(String[] args){
		JFrame ClockFrame = new JFrame("Java 指针時鐘");
		final ClockPanel clockPanel = new ClockPanel();

		ClockFrame.add(clockPanel);
		Timer uptime = new Timer(1000, new ActionListener(){
			@Override
		public void actionPerformed(ActionEvent ae) {
				clockPanel.upTimer();
			}
		});

		ClockFrame.setBounds(400,300,400,400);
		ClockFrame.setResizable(false);
		ClockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClockFrame.setVisible(true);
		uptime.start();
}
}

	class ClockPanel extends JPanel{
	Calendar calTime = new GregorianCalendar();
	String number[] = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" };
			int sx,sy,mx,my,sx1,sy1;
			double hx,hy;
			int minute;
			int second;
			int hour;
			int OX = 200;
			int OY = 190;
			int i;

		public ClockPanel(){
					setBackground(Color.BLACK);
					setLayout(null);
					minute = calTime.get(Calendar.MINUTE); 
					second = calTime.get(Calendar.DATE);
					hour = calTime.get(Calendar.HOUR);
		}
		
		public void upTimer(){
						calTime.setTimeInMillis( System.currentTimeMillis() ); 
						repaint(); 
		}
		
		@Override
		public void paintComponent(Graphics grap){
						super.paintComponent(grap);
						minute = calTime.get(Calendar.MINUTE);
						second = calTime.get(Calendar.SECOND);
						hour = calTime.get(Calendar.HOUR);
						grap.setColor(Color.WHITE);
						grap.drawLine(OX, OY, (int)( OX+100*Math.sin(second*Math.PI/30) ), (int)( OY-100*Math.cos(second*Math.PI/30) ) );
						grap.drawLine(OX, OY, (int)(OX+20*Math.sin((second-30)*Math.PI/30)), (int)(OY-20*Math.cos((second-30)*Math.PI/30)));
						grap.setColor(Color.YELLOW);
						grap.drawLine(OX, OY, (int)(OX+80*Math.sin(minute*Math.PI/30)), (int)(OY-80*Math.cos(minute*Math.PI/30)) );
						grap.setColor(Color.RED);
						grap.drawLine(OX, OY, (int)(OX+55*Math.sin( (hour+minute/60.0) * Math.PI/6) ), (int)(OY-55*Math.cos( (hour+minute/60.0) * Math.PI/6) ));
						grap.setColor(Color.BLUE);
						paintNumber(grap);
						//grap.drawString("Name: Clock for Java", 20, 20);
						//grap.drawString("Author: Sid Wang"+"\n", 20, 35);
						//grap.drawString("Time: 2013-10-28", 20, 50);
		}

		public void paintNumber(Graphics gra){
			gra.setColor(Color.BLUE);
	
		for(i=0; i<60; i++){
					gra.drawLine((int)(OX-115*Math.cos(i*Math.PI/30)),
					(int)(OY+115*Math.sin(i*Math.PI/30)),
					(int)(OX-120*Math.cos(i*Math.PI/30)),
					(int)(OY+120*Math.sin(i*Math.PI/30)) );
		}

		for(i=0; i<12; i++){
					gra.setColor(Color.RED);
					gra.drawLine( (int)(OX-110*Math.cos(i*Math.PI/6)),
					(int)(OY+110*Math.sin(i*Math.PI/6)),
					(int)(OX-120*Math.cos(i*Math.PI/6)),
					(int)(OY+120*Math.sin(i*Math.PI/6)));
					gra.setColor(Color.lightGray); 
					gra.drawString(number[i], (int)(OX+135*Math.sin(i*Math.PI/6))-5,(int)(OY-135*Math.cos(i*Math.PI/6))+5 );
		}
		}
}