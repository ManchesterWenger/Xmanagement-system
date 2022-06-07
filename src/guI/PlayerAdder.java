package guI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PlayerAdder extends JFrame {
	
	public PlayerAdder() {
		JPanel panel = new JPanel();
		panel.setLayout (new SpringLayout());
		
		JLabel labelName = new JLabel ("Name:", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		panel.add(labelName);
		panel.add(fieldName);
		
		SpringUtilities.makeCompactGrid(panel, 1, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
