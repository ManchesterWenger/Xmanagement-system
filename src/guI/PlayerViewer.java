package guI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import manager.PlayerManger;
public class PlayerViewer extends JPanel {
	
	WindowFrame frame;
	PlayerManger playerManger;

	public PlayerViewer(WindowFrame frame, PlayerManger  playerManger) {
		this.frame= frame;
		this.playerManger=playerManger;
		
		System.out.println("***"+playerManger.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Number");
		model.addColumn("Age");
		model.addColumn("Wage");
		model.addColumn("League");
		
//		String column[] = {"Name","Number","Age","Wage","League"};
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); 
		
		this.add(sp);
//		this.setSize(300,300);
//		this.setDebugGraphicsOptions(JFrame.EXIT_ON_CLOSE);
//		this.setVisible(true);
//		
		 
	}
}
