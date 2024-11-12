package gr.perisnik.cj.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;

public class JavaSwingFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwingFrame frame = new JavaSwingFrame();
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
	public JavaSwingFrame() {
		setTitle("Java Swing Demo App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 232, 232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblJavaSwing = new JLabel("Java Swing Demo");
		lblJavaSwing.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJavaSwing.setForeground(new Color(0, 128, 255));
		lblJavaSwing.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblJavaSwing, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea.setLineWrap(true);
		textArea.setText("Για να τοποθετήσεις ένα παράθυρο (π.χ., JFrame) στο κέντρο της οθόνης, αντί να χρησιμοποιείς το setBounds, μπορείς να χρησιμοποιήσεις τη μέθοδο setLocationRelativeTo(null)");
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
