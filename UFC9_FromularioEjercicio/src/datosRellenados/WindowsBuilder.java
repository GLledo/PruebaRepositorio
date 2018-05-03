package datosRellenados;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class WindowsBuilder extends JFrame{
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	public WindowsBuilder() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		getContentPane().add(panel);
		
		btnNewButton = new JButton("ACEPTAR");
		btnNewButton.setBounds(0, 440, 138, 43);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("LIMPIAR");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(140, 440, 138, 43);
		getContentPane().add(btnNewButton_1);
	}
}
