import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(44, 25, 0, 0);
		contentPane.add(label_2);
		
		JLabel lblHtlquiz = new JLabel("HTL-Quiz");
		lblHtlquiz.setBounds(163, 25, 82, 20);
		lblHtlquiz.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblHtlquiz);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(333, 25, 0, 0);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("");
		label.setBounds(163, 203, 0, 0);
		contentPane.add(label);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(333, 219, 89, 23);
		contentPane.add(btnStart);
	}

}
