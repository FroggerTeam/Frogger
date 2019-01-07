package Einzelspieler;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Hauptmenü extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptmenü frame = new Hauptmenü();
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
	public Hauptmenü() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStarten = new JButton("Spiel starten");
		btnStarten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hallo;
			}
		});
		btnStarten.setBounds(184, 115, 152, 23);
		contentPane.add(btnStarten);
		
		JButton btnOptions = new JButton("Options");
		btnOptions.setBounds(184, 167, 152, 23);
		contentPane.add(btnOptions);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCredits.setBounds(184, 226, 152, 23);
		contentPane.add(btnCredits);
		
		JButton btnSpielVerlassen = new JButton("Spiel verlassen");
		btnSpielVerlassen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSpielVerlassen.setBounds(184, 283, 152, 23);
		contentPane.add(btnSpielVerlassen);
		
		JLabel lblFrogger = new JLabel("FROGGER\r\n");
		lblFrogger.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		lblFrogger.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrogger.setBounds(143, 31, 235, 47);
		contentPane.add(lblFrogger);
		
		JLabel lbldasSpiel = new JLabel("-DAS SPIEL-");
		lbldasSpiel.setHorizontalAlignment(SwingConstants.CENTER);
		lbldasSpiel.setBounds(184, 57, 152, 47);
		contentPane.add(lbldasSpiel);
	}

}