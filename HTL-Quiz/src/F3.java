import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class F3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F3 frame = new F3();
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
	public F3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWreEineLehre = new JLabel("W\u00E4re eine Lehre f\u00FCr dich eine Option gewesen?");
		lblWreEineLehre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWreEineLehre.setBounds(28, 11, 378, 14);
		contentPane.add(lblWreEineLehre);
		
		JButton a3 = new JButton("A: N\u00F6, Lehre ist was f\u00FCr Leute, die zu bl\u00F6d zum Lernen sind");
		a3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a3.setBounds(10, 65, 414, 14);
		contentPane.add(a3);
		
		JButton b3 = new JButton("B: Kommt drauf an, was ich danach machen will");
		b3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b3.setBounds(10, 90, 414, 14);
		contentPane.add(b3);
		
		JButton c3 = new JButton("C: Hmmm. Jetzt wo ich so dar\u00FCber nachdenke, w\u00E4re das keine schlechte Idee gewesen");
		c3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		c3.setBounds(10, 114, 424, 14);
		contentPane.add(c3);
	}

}
