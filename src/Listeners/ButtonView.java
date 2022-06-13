package Listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import guI.PlayerViewer;
import guI.WindowFrame;

public class ButtonView implements ActionListener {

	WindowFrame frame;
	
	public ButtonView(WindowFrame frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		PlayerViewer viewer = frame.getPlayerviewer();
		frame.setupPanel(viewer);

	}

}
