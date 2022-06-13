package guI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.PlayerManger;
import manager.MenuManager;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection ;
	PlayerAdder playeradder;
	PlayerViewer playerviewer; 
	PlayerManger  playerManger; 
	
	public WindowFrame(PlayerManger playerManger) {
		this.playerManger=playerManger;
		this.menuselection = new MenuSelection(this);
		this.playeradder = new PlayerAdder(this);
		this. playerviewer = new PlayerViewer(this,this.playerManger);
		
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public PlayerAdder getPlayeradder() {
		return playeradder;
	}
	public void setPlayeradder(PlayerAdder playeradder) {
		this.playeradder = playeradder;
	}
	public PlayerViewer getPlayerviewer() {
		return playerviewer;
	}
	public void setPlayerviewer(PlayerViewer playerviewer) {
		this.playerviewer = playerviewer;
	}


}
