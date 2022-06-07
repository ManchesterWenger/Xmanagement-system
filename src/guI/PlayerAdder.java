package guI;

import javax.swing.JButton;
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
		
		JLabel labelNumber = new JLabel ("Number:", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelLeague = new JLabel ("League:", JLabel.TRAILING);
		JTextField fieldLeague = new JTextField(10);
		panel.add(labelLeague);
		panel.add(fieldLeague);
		
		JLabel labelAge = new JLabel ("Age:", JLabel.TRAILING);
		JTextField fieldAge = new JTextField(10);
		panel.add(labelAge);
		panel.add(fieldAge);
		
		JLabel labelWage = new JLabel ("Wage:", JLabel.TRAILING);
		JTextField fieldWage = new JTextField(10);
		panel.add(labelWage);
		panel.add(fieldWage);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
