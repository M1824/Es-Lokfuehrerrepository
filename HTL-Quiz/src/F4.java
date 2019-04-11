import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class F4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F4 frame = new F4();
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
	public F4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWieGutFindest = new JLabel("Wie gut findest du deine Lehrer?");
		lblWieGutFindest.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWieGutFindest.setBounds(74, 11, 275, 14);
		contentPane.add(lblWieGutFindest);
		
		JButton a4 = new JButton("A: Sind alle in Ordnung");
		a4.setBounds(10, 50, 366, 23);
		contentPane.add(a4);
		
		JButton b4 = new JButton("B: Die meisten sind ok, ein paar mag ich nicht (und sie mich auch nicht)");
		b4.setBounds(10, 84, 366, 23);
		contentPane.add(b4);
		
		JButton c4 = new JButton("C: Passend zur Schule (schlecht)");
		c4.setBounds(10, 118, 366, 23);
		contentPane.add(c4);
	}

}
