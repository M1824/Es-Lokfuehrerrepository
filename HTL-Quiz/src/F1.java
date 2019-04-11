import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class F1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1 frame = new F1();
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
	public F1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Warum besuchtst du die HTL?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(71, 11, 271, 14);
		contentPane.add(lblNewLabel);
		
		JButton a1 = new JButton("A: Weil es mich interessiert");
		a1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a1.setBounds(71, 65, 338, 14);
		contentPane.add(a1);
		
		JButton b1 = new JButton("B: Weil ich nicht studieren gehen m\u00F6chte");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b1.setBounds(71, 98, 342, 14);
		contentPane.add(b1);
		
		JButton c1 = new JButton("C: Wegen meinen Freunden");
		c1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c1.setBounds(70, 129, 343, 14);
		contentPane.add(c1);
	}
}
