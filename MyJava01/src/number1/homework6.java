package number1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class homework6 extends JFrame{
	
	private JButton relay,send;
		homework6(){
			setLayout(new BorderLayout());
			relay=new JButton("relay");
			send=new JButton("send");
			
			
			JPanel South = new JPanel(new FlowLayout());
			JTextArea a = new JTextArea();
			JTextField b = new JTextField(10);
			
			
			South.add(b);
			South.add(send);
			South.add(relay);
			
			
			
			add(South,BorderLayout.SOUTH);
			add(a,BorderLayout.CENTER);
			
			setSize(640,480);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			
			a.setFont(new Font("²Ó©úÅé",Font.PLAIN, 16));
			a.setLineWrap(true);
			
			send.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String send =b.getText();
					byte[] a1 =send.getBytes();
					try {
						DatagramSocket socket =new DatagramSocket();
						DatagramPacket packet =new DatagramPacket(a1, a1.length,InetAddress.getByName("127.0.0.1"),8888);
						socket.send(packet);
						socket.close();
						a.append("§Ú:"+b.getText()+"\n");
						b.setText(null);
						
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
	
				}
			});
			
			relay.addActionListener(new ActionListener() {
				byte[] buf = new byte[1024];
				@Override
				public void actionPerformed(ActionEvent e) {
					try{
					DatagramSocket socket1 = new DatagramSocket(8888);
					DatagramPacket packet1 = new DatagramPacket(buf, buf.length);
					socket1.receive(packet1);
//					socket1.close();
					int len = packet1.getLength();
					byte[] r = packet1.getData();
					String a2 = packet1.getAddress().getHostAddress();
					a.append(a2 +":" + new String(r,0,len));
					}catch(Exception e1){
						
					}
				}
			});
		
			
			
		}
	

	public static void main(String[] args) {
		new homework6();
	}

	
}
