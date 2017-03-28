package number1;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class homework5 extends JFrame{
	
	private JButton open,save,exit;
	
		homework5(){
			setLayout(new BorderLayout());
			 open = new JButton("open");
			 save = new JButton("save");
			 exit = new JButton("exit");
			 JPanel TOP= new JPanel(new FlowLayout());
			JFileChooser fd = new JFileChooser();  
			 JTextArea a = new JTextArea();
			 
			 
			TOP.add(open);		TOP.add(save);		TOP.add(exit);
			add(TOP,BorderLayout.NORTH);//塞到border的北邊
			add(a,BorderLayout.CENTER);
			setSize(640,480);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
		}

	
	public static void main(String[] args) {
		new homework5();
	}
}
