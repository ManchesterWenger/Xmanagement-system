package guI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	public WindowFrame() {
	
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		MenuSelection menuselection = new MenuSelection();
		PlayerAdder playeradder = new PlayerAdder();
 		PlayerViewer playerviewer = new PlayerViewer();
		this.add(menuselection);
		
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}


}
