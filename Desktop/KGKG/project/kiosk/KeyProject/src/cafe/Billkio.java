package cafe;

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Billkio extends JFrame{
	
	private JPanel contentPane;
	static Billkio frame = new Billkio();	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Billkio frame = new Billkio();
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
	public Billkio() {
		setTitle("결제화면");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(437,536);
        Dimension frameSize = getSize();
        // 모니터 크기
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // (모니터화면 가로 - 프레임화면 가로) / 2, (모니터화면 세로 - 프레임화면 세로) / 2
        setLocation((screenSize.width - frameSize.width) /2, (screenSize.height - frameSize.height) /2);
		
		
		//setBounds(100, 100, 437, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton cardBtn = new JButton("\uCE74\uB4DC");
		cardBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(Jumonkio.frame,"감사합니다");	//창 가운데에 메시지출력
				Jumonkio.msg="";			//장바구니 초기화
				Jumonkio.sum=0;
				Jumonkio.frame.setVisible(false);	//주문창 안보이게
				dispose();	
				//Billkio.frame.setVisible(false);				// 현재창을 안보이게
				Mainkio.frame.setVisible(true);		//mainkio()를 다시보이게
			}
		});
		
		JButton moneyBtn = new JButton("\uD604\uAE08");
		moneyBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(Jumonkio.frame,"감사합니다");
				Jumonkio.msg="";			//장바구니 초기화
				Jumonkio.sum=0;
				Jumonkio.frame.setVisible(false);	//주문창 안보이게
				dispose();	
				//Mainkio.frame.setVisible(false);
				//Billkio.frame.setVisible(false);			// 현재창을 안보이게
				//new Mainkio().setVisible(true);		//mainkio()를 새창으로 열기
				Mainkio.frame.setVisible(true);	
			}
		});
		
		JButton backBtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");//뒤로가기
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Jumonkio.frame.setVisible(true);
				new Jumonkio().setVisible(true);
				//Jumonkio.frame.textArea.setText(Jumonkio.msg);//장바구니에 표시
				//Jumonkio.textField.setText(String.valueOf(sum));
				//Jumonkio.frame.repaint();
				dispose();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(backBtn, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(cardBtn, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
							.addComponent(moneyBtn, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cardBtn, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addComponent(moneyBtn, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		
		JTextArea textArea = new JTextArea();
		textArea.setText(Jumonkio.msg + "합계 " + Jumonkio.sum + "원" );
		//textArea.setText(Jumonkio.sum + "원");
		scrollPane.setViewportView(textArea);
		contentPane.setLayout(gl_contentPane);
	}
}
