package cafe;

import java.awt.*;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel (Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img,0,0,null);
	}
}

public class Mainkio extends JFrame {

	private JPanel contentPane;
	static Mainkio frame = new Mainkio();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
//		JFrame frame =new JFrame();
//	    frame.setSize(300,300);
//		Dimension frameSize = frame.getSize();
//	    // 모니터 크기
//	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//	    // (모니터화면 가로 - 프레임화면 가로) / 2, (모니터화면 세로 - 프레임화면 세로) / 2
//	    frame.setLocation((screenSize.width - frameSize.width) /2, (screenSize.height - frameSize.height) /2);
//		ImagePanel panel = new  ImagePanel(new ImageIcon("src/img/main.jpg").getImage());
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Mainkio frame = new Mainkio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mainkio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 461, 510);
		
		//JFrame frame =new JFrame();
	    setSize(461,510);
		Dimension frameSize = getSize();
	    // 모니터 크기
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    // (모니터화면 가로 - 프레임화면 가로) / 2, (모니터화면 세로 - 프레임화면 세로) / 2
	    setLocation((screenSize.width - frameSize.width) /2, (screenSize.height - frameSize.height) /2);
		
		ImagePanel panel = new  ImagePanel(new ImageIcon("src/img/main.jpg").getImage());
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("메인이미지");
		btnNewButton.setIcon(new ImageIcon(Mainkio.class.getResource("/img/main.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {//JumonKio 로 이동
				
				setVisible(false);				// 현재창을 안보이게
				new Jumonkio().setVisible(true);		//Jumonkio()를 새창으로 열기
				Jumonkio.Cof1Button.setVisible(true);
				Jumonkio.Cof2Button.setVisible(true);
				Jumonkio.Cof3Button.setVisible(true);
				Jumonkio.Cof4Button.setVisible(true);
				Jumonkio.Cofop1.setVisible(true);
				Jumonkio.Cofop2.setVisible(true);
				Jumonkio.Sha1Button.setVisible(false);
				Jumonkio.Sha2Button.setVisible(false);
				Jumonkio.Sha3Button.setVisible(false);
				Jumonkio.Sha4Button.setVisible(false);
				Jumonkio.Shaop1Button.setVisible(false);
				Jumonkio.Shaop2Button.setVisible(false);
				Jumonkio.Tea1Button.setVisible(false);
				Jumonkio.Tea2Button.setVisible(false);
				Jumonkio.Tea3Button.setVisible(false);
				Jumonkio.Tea4Button.setVisible(false);
				Jumonkio.Teaop1Button.setVisible(false);
				Jumonkio.Teaop2Button.setVisible(false);
				
				
			}
		});
		btnNewButton.setBounds(0, 0, 460, 484);
		contentPane.add(btnNewButton);
	}

}
