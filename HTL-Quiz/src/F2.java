import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class F2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F2 frame = new F2();
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
	public F2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wie zufrieden bist du mit der HTL?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(79, 11, 276, 14);
		contentPane.add(lblNewLabel);
		
		JButton a2 = new JButton("A: So wie es ist, ist es perfekt");
		a2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a2.setBounds(10, 65, 414, 14);
		contentPane.add(a2);
		
		JButton b2 = new JButton("B: Naja, manchmal bin ich zufrieden, manchmal nicht");
		b2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b2.setBounds(10, 91, 414, 14);
		contentPane.add(b2);
		
		JButton c2 = new JButton("C: Ich bin absolut unzufrieden");
		c2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c2.setBounds(10, 116, 414, 14);
		contentPane.add(c2);
	}

}
