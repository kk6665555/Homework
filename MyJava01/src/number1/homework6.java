package number1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class homework6 extends JFrame{
	
	private JButton relay ;
		homework6(){
			setLayout(new BorderLayout());
			relay=new JButton("relay");
			
			JPanel South = new JPanel(new FlowLayout());
			JTextArea a = new JTextArea();
			JTextField b = new JTextField(10);
			
			
			South.add(b);
			South.add(relay);
			
			
			
			add(South,BorderLayout.SOUTH);
			add(a,BorderLayout.CENTER);
			
			setSize(640,480);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			
			a.setFont(new Font("²Ó©úÅé",Font.PLAIN, 16));
			a.setLineWrap(true);
			
			
			
			relay.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					a.append(b.getText()+"\n");
					b.setText(null);
					
				}
			});
		
			
			
		}
	

	public static void main(String[] args) {
		new homework6();
	}

	
}
