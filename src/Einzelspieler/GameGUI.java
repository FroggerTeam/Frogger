package Einzelspieler;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class GameGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameGUI frame = new GameGUI();
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
	public GameGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.setBounds(10, 11, 83, 23);
		contentPane.add(btnZurck);
		
		JLabel FrogUI = new JLabel("");
		FrogUI.setBounds(445, 551, 46, 14);
		contentPane.add(FrogUI);
		
		JLabel SeeroseUI = new JLabel("");
		SeeroseUI.setIcon(new ImageIcon("D:\\JavaFrogger\\GitHub\\Frogger\\Seerose READY.png"));
		SeeroseUI.setBounds(117, 82, 104, 86);
		contentPane.add(SeeroseUI);
		
		JLabel AutoUI = new JLabel("");
		AutoUI.setIcon(new ImageIcon("D:\\JavaFrogger\\GitHub\\Frogger\\Auto READY.png"));
		AutoUI.setBounds(129, 330, 208, 110);
		contentPane.add(AutoUI);
		
		JLabel HolzStammUI = new JLabel("");
		HolzStammUI.setIcon(new ImageIcon("D:\\JavaFrogger\\GitHub\\Frogger\\Baumstamm READY.png"));
		HolzStammUI.setBounds(141, 186, 208, 58);
		contentPane.add(HolzStammUI);
	}
}
