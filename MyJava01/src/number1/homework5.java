package number1;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.plaf.FileChooserUI;


public class homework5 extends JFrame{
	
	private JButton open,save,exit;
	
		homework5(){
			setLayout(new BorderLayout());
			 open = new JButton("open");
			 save = new JButton("save");
			 exit = new JButton("exit");
			 JPanel TOP= new JPanel(new FlowLayout());
			 JTextArea a = new JTextArea();
			 
			 
			TOP.add(open);		TOP.add(save);		TOP.add(exit);
			add(TOP,BorderLayout.NORTH);//塞到border的北邊
			add(a,BorderLayout.CENTER);
			
			
			setSize(640,480);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			a.setFont(new Font("細明體",Font.PLAIN, 16));
			a.setLineWrap(true);
			
			
			
			
			
			
			open.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JFileChooser fd = new JFileChooser();  
					int b =fd.showOpenDialog(null);
					if(b==JFileChooser.APPROVE_OPTION){		
						File file = new File(fd.getSelectedFile().toString());
						String temp ;
						try{
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						while((temp=br.readLine())!=null){
							a.append(temp + "\n");
							}
						System.out.println(temp);
						br.close();
						}catch(Exception aa){
							System.out.println(aa.toString());
						}
					}
				}
			});
			
		}

	
	public static void main(String[] args) {
		new homework5();
	}
}
