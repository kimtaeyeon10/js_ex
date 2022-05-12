package cafe;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cafe.Billkio;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class Jumonkio extends JFrame {

	private JPanel contentPane;
	static JButton Cof1Button;
	static JButton Cof2Button;
	static JButton Cof3Button;
	static JButton Cof4Button;
	static JButton Cofop1;
	static JButton Cofop2;
	 static JButton Sha1Button;
	 static JButton Sha2Button;
	 static JButton Sha3Button;
	 static JButton Sha4Button;
	 static JButton Shaop2Button;
	 static JButton Shaop1Button;
	 static JButton Tea1Button;
	 static JButton Tea2Button;
	 static JButton Tea3Button;
	 static JButton Tea4Button;
	 static JButton Teaop1Button;
	 static JButton Teaop2Button;
	 static Jumonkio frame = new Jumonkio();
	 
	 // 장바구니에 문자 보여주는 변수들
	 	static String msg=""; //전역
		static int sum = 0;
		private JTextArea textArea;
		private JTextField textField;
		private JScrollPane scrollPane;
		private JRadioButton rdbtnNewRadioButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Jumonkio frame = new Jumonkio();
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
	public Jumonkio() {
		setTitle("주문화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(461,627);
        Dimension frameSize = getSize();
        // 모니터 크기
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // (모니터화면 가로 - 프레임화면 가로) / 2, (모니터화면 세로 - 프레임화면 세로) / 2
        setLocation((screenSize.width - frameSize.width) /2, (screenSize.height - frameSize.height) /2);
		
		//setBounds(100, 100, 461, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 22, 421, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Cofmain = new JButton("\uCEE4\uD53C");
		Cofmain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	//커피 상단버튼
				Cof1Button.setVisible(true);
				Cof2Button.setVisible(true);
				Cof3Button.setVisible(true);
				Cof4Button.setVisible(true);
				Cofop1.setVisible(true);
				Cofop2.setVisible(true);
				Sha1Button.setVisible(false);
				Sha2Button.setVisible(false);
				Sha3Button.setVisible(false);
				Sha4Button.setVisible(false);
				Shaop2Button.setVisible(false);
				Shaop1Button.setVisible(false);
				Tea1Button.setVisible(false);
				Tea2Button.setVisible(false);
				Tea3Button.setVisible(false);
				Tea4Button.setVisible(false);
				Teaop1Button.setVisible(false);
				Teaop2Button.setVisible(false);

			}
		});
		Cofmain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Cofmain.setBounds(12, 10, 116, 27);
		panel.add(Cofmain);
		
		JButton Shamain = new JButton("\uC2A4\uBB34\uB514");
		Shamain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cof1Button.setVisible(false);
				Cof2Button.setVisible(false);
				Cof3Button.setVisible(false);
				Cof4Button.setVisible(false);
				Cofop1.setVisible(false);
				Cofop2.setVisible(false);
				Sha1Button.setVisible(true);
				Sha2Button.setVisible(true);
				Sha3Button.setVisible(true);
				Sha4Button.setVisible(true);
				Shaop2Button.setVisible(true);
				Shaop1Button.setVisible(true);
				Tea1Button.setVisible(false);
				Tea2Button.setVisible(false);
				Tea3Button.setVisible(false);
				Tea4Button.setVisible(false);
				Teaop1Button.setVisible(false);
				Teaop2Button.setVisible(false);
				
			}
		});
		Shamain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Shamain.setBounds(152, 12, 116, 25);
		panel.add(Shamain);
		
		JButton Teamain = new JButton("\uD2F0");
		Teamain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cof1Button.setVisible(false);
				Cof2Button.setVisible(false);
				Cof3Button.setVisible(false);
				Cof4Button.setVisible(false);
				Cofop1.setVisible(false);
				Cofop2.setVisible(false);
				Sha1Button.setVisible(false);
				Sha2Button.setVisible(false);
				Sha3Button.setVisible(false);
				Sha4Button.setVisible(false);
				Shaop2Button.setVisible(false);
				Shaop1Button.setVisible(false);
				Tea1Button.setVisible(true);
				Tea2Button.setVisible(true);
				Tea3Button.setVisible(true);
				Tea4Button.setVisible(true);
				Teaop1Button.setVisible(true);
				Teaop2Button.setVisible(true);
			}
		});
		Teamain.setBounds(292, 12, 117, 25);
		panel.add(Teamain);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 81, 421, 319);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Tea1Button = new JButton("\uCE90\uBAA8\uB9C8\uC77C");
		Tea1Button.setForeground(new Color(238, 238, 238));
		Tea1Button.setVerticalAlignment(SwingConstants.TOP);
		Tea1Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Tea1Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Tea1Button.setForeground(Color.BLACK);
		Tea1Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/캐모마일.jpg")));
		Tea1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Tea1Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 캐모마일 
				msg+="캐모마일(4100)"+"\n";
				sum=sum+4100;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		
		Cof1Button = new JButton("\uC544\uBA54\uB9AC\uCE74\uB178");				// 커피 버튼들
		Cof1Button.setForeground(new Color(238, 238, 238));
		Cof1Button.setVerticalAlignment(SwingConstants.TOP);
		Cof1Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Cof1Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Cof1Button.setForeground(Color.BLACK);
		Cof1Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/아메리카노.jpg")));
		Cof1Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 아메리카노
				
				msg+="아메리카노(4100)"+"\n";
				sum=sum+4100;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Cof1Button.setBounds(12, 10, 117, 140);
		panel_1.add(Cof1Button);
		
		Cof2Button = new JButton("\uB77C\uB5BC");
		Cof2Button.setForeground(new Color(238, 238, 238));
		Cof2Button.setVerticalAlignment(SwingConstants.TOP);
		Cof2Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Cof2Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Cof2Button.setForeground(Color.BLACK);
		Cof2Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/라떼.jpg")));
		Cof2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 라떼
				
				msg+="라떼(4600)"+"\n";
				sum=sum+4600;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Cof2Button.setBounds(152, 10, 117, 140);
		panel_1.add(Cof2Button);
		
		Cof3Button = new JButton("\uCE74\uD398\uBAA8\uCE74");
		Cof3Button.setForeground(new Color(238, 238, 238));
		Cof3Button.setVerticalAlignment(SwingConstants.TOP);
		Cof3Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Cof3Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Cof3Button.setForeground(Color.BLACK);
		Cof3Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/카페모카.jpg")));
		Cof3Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 카페모카
				
				msg+="카페모카(5100)"+"\n";
				sum=sum+5100;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Cof3Button.setBounds(292, 10, 117, 140);
		panel_1.add(Cof3Button);
		
		Cof4Button = new JButton("\uBC14\uB2D0\uB77C \uB77C\uB5BC");
		Cof4Button.setForeground(new Color(238, 238, 238));
		Cof4Button.setVerticalAlignment(SwingConstants.TOP);
		Cof4Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Cof4Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Cof4Button.setForeground(Color.BLACK);
		Cof4Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/바닐라라떼.jpg")));
		Cof4Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 바닐라 라떼
				
				msg+="바닐라 라떼(4800)"+"\n";
				sum=sum+4800;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Cof4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Cof4Button.setBounds(12, 162, 117, 140);
		panel_1.add(Cof4Button);
		
		Cofop1 = new JButton("\uC0F7 \uCD94\uAC00");
		Cofop1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 샷 추가
				
				msg+=" ㄴ샷 추가(+500)"+"\n";
				sum=sum+500;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Cofop1.setBounds(152, 162, 117, 140);
		panel_1.add(Cofop1);
		
		Cofop2 = new JButton("\uC2DC\uB7FD \uCD94\uAC00");
		Cofop2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 시럽 추가
				
				msg+=" ㄴ시럽 추가(+500)"+"\n";
				sum=sum+500;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum)); // 
			}
		});
		Cofop2.setBounds(292, 162, 117, 140);
		panel_1.add(Cofop2);
		Tea1Button.setBounds(12, 10, 117, 140);
		panel_1.add(Tea1Button);
		
		Tea2Button = new JButton("\uB8E8\uC774\uBCF4\uC2A4");
		Tea2Button.setForeground(new Color(238, 238, 238));
		Tea2Button.setVerticalAlignment(SwingConstants.TOP);
		Tea2Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Tea2Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Tea2Button.setForeground(Color.BLACK);
		Tea2Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/루이보스.jpg")));
		Tea2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Tea2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { //루이보스
				msg+="루이보스(4500)"+"\n";
				sum=sum+4500;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Tea2Button.setBounds(152, 10, 117, 140);
		panel_1.add(Tea2Button);
		
		Tea3Button = new JButton("\uD788\uBE44\uC2A4\uCEE4\uC2A4");
		Tea3Button.setForeground(new Color(238, 238, 238));
		Tea3Button.setVerticalAlignment(SwingConstants.TOP);
		Tea3Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Tea3Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Tea3Button.setForeground(Color.BLACK);
		Tea3Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/히비스커스.jpg")));
		Tea3Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 히비스커스
				
				msg+="히비스커스(4700)"+"\n";
				sum=sum+4700;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Tea3Button.setBounds(292, 10, 117, 140);
		panel_1.add(Tea3Button);
		
		Tea4Button = new JButton("\uC81C\uC8FC\uC720\uAE30\uB179\uCC28");
		Tea4Button.setForeground(new Color(238, 238, 238));
		Tea4Button.setVerticalAlignment(SwingConstants.TOP);
		Tea4Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Tea4Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Tea4Button.setForeground(Color.BLACK);
		Tea4Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/제주유기녹차.jpg")));
		Tea4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Tea4Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 제주유기녹차
				
				msg+="제주유기녹차(4900)"+"\n";
				sum=sum+4900;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Tea4Button.setBounds(12, 162, 117, 140);
		panel_1.add(Tea4Button);
		
		Teaop1Button = new JButton("앗뜨거");
		Teaop1Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				msg+="ㄴ앗뜨거"+"\n";
				textArea.setText(msg);//장바구니에 표시
			}
		});
		Teaop1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Teaop1Button.setBounds(152, 162, 117, 140);
		panel_1.add(Teaop1Button);
		
		Teaop2Button = new JButton("앗차가");
		Teaop2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				msg+="ㄴ앗차가"+"\n";
				textArea.setText(msg);//장바구니에 표시
			}
		});
		Teaop2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Teaop2Button.setBounds(292, 162, 117, 140);
		panel_1.add(Teaop2Button);
		
		Sha1Button = new JButton("\uB538\uAE30 \uC2A4\uBB34\uB514");			//스무디 버튼들
		Sha1Button.setForeground(new Color(238, 238, 238));
		Sha1Button.setVerticalAlignment(SwingConstants.TOP);
		Sha1Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Sha1Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Sha1Button.setForeground(Color.BLACK);
		Sha1Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/딸기스무디.jpg")));
		Sha1Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 딸기 스무디
				
				msg+="딸기 스무디(3500)"+"\n";
				sum=sum+3500;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Sha1Button.setBounds(12, 10, 117, 140);
		panel_1.add(Sha1Button);
		
		Sha2Button = new JButton("\uB9DD\uACE0 \uC2A4\uBB34\uB514");
		Sha2Button.setForeground(new Color(238, 238, 238));
		Sha2Button.setVerticalAlignment(SwingConstants.TOP);
		Sha2Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Sha2Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Sha2Button.setForeground(Color.BLACK);
		Sha2Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/망고스무디.jpg")));
		Sha2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 망고 스무디
				
				msg+="망고 스무디(3500)"+"\n";
				sum=sum+3500;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Sha2Button.setBounds(152, 10, 117, 140);
		panel_1.add(Sha2Button);
		
		Sha3Button = new JButton("\uBE14\uB8E8\uBCA0\uB9AC \uC2A4\uBB34\uB514");
		Sha3Button.setForeground(new Color(238, 238, 238));
		Sha3Button.setVerticalAlignment(SwingConstants.TOP);
		Sha3Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Sha3Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Sha3Button.setForeground(Color.BLACK);
		Sha3Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/블루베리스무디.jpg")));
		Sha3Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 블루베리 스무디
				
				msg+="블루베리 스무디(3900)"+"\n";
				sum=sum+3900;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Sha3Button.setBounds(292, 10, 117, 140);
		panel_1.add(Sha3Button);
		
		Sha4Button = new JButton("\uD64D\uC2DC \uC2A4\uBB34\uB514");
		Sha4Button.setForeground(new Color(238, 238, 238));
		Sha4Button.setVerticalAlignment(SwingConstants.TOP);
		Sha4Button.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		Sha4Button.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		Sha4Button.setForeground(Color.BLACK);
		Sha4Button.setIcon(new ImageIcon(Jumonkio.class.getResource("/img/홍시스무디.jpg")));
		Sha4Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 홍시 스무디
				
				msg+="홍시 스무디(3900)"+"\n";
				sum=sum+3900;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Sha4Button.setBounds(12, 162, 117, 140);
		panel_1.add(Sha4Button);
		
		Shaop1Button = new JButton("Regular");
		Shaop1Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 스무디 옵션 Regular
				
				msg+="ㄴRegular(+1000)"+"\n";
				sum=sum+1000;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Shaop1Button.setBounds(152, 162, 117, 140);
		panel_1.add(Shaop1Button);
		
		Shaop2Button = new JButton("Large");
		Shaop2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 스무디 옵션 Large
				
				msg+="ㄴLarge(+2000)"+"\n";
				sum=sum+2000;
				textArea.setText(msg);//장바구니에 표시
				textField.setText(String.valueOf(sum));
			}
		});
		Shaop2Button.setBounds(292, 162, 117, 140);
		panel_1.add(Shaop2Button);
		
		JButton btnNewButton = new JButton("\uC804\uCCB4\uC0AD\uC81C");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 전체삭제
				rdbtnNewRadioButton.setSelected(false);
				textArea.setText(null);
				textField.setText(null);
				msg="";
				sum=0;
			}
		});
		btnNewButton.setBounds(294, 475, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uACB0\uC81C\uD558\uAE30");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 결제하기 버튼 클릭시
				//dispose();
				setVisible(false);
				textField.setText(String.valueOf(sum));//총액 표시
				new Billkio().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(294, 510, 97, 23);
		contentPane.add(btnNewButton_1);
		
		rdbtnNewRadioButton = new JRadioButton("\uD14C\uC774\uD06C\uC544\uC6C3(-1000\uC6D0)");
		rdbtnNewRadioButton.setBounds(254, 431, 179, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    if(rdbtnNewRadioButton.isSelected()) {        //테이크 아웃 선택시
                            sum = sum-1000;
                            textField.setText(String.valueOf(sum));
                    }else {        //테이크 아웃 해제시
                            sum = sum+1000;
                            textField.setText(String.valueOf(sum));
                    }
            }
    });
		
		textField = new JTextField();
		textField.setBounds(89, 545, 124, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setHorizontalAlignment(JTextField.RIGHT); //합계 오른쪽정렬
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 412, 233, 121);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel label = new JLabel("합계");
		label.setBounds(58, 548, 45, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("원");
		label_1.setBounds(221, 548, 62, 18);
		contentPane.add(label_1);
	}
}
