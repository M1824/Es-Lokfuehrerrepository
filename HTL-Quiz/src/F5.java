import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class F5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F5 frame = new F5();
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
	public F5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWrdestDuWenn = new JLabel("W\u00FCrdest du, wenn du die Wahl h\u00E4ttest, noch einmal die HTL besuchen?");
		lblWrdestDuWenn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWrdestDuWenn.setBounds(10, 11, 414, 14);
		contentPane.add(lblWrdestDuWenn);
		
		JButton a5 = new JButton("A: Auf jeden Fall");
		a5.setBounds(66, 64, 181, 23);
		contentPane.add(a5);
		
		JButton b5 = new JButton("B: Ich m\u00FCsste \u00FCberlegen");
		b5.setBounds(66, 98, 181, 23);
		contentPane.add(b5);
		
		JButton c5 = new JButton("C: Niemals!");
		c5.setBounds(66, 132, 181, 23);
		contentPane.add(c5);
	}

}
