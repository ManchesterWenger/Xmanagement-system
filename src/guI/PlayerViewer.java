package guI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Player.PlayerInput;
import manager.PlayerManger;
public class PlayerViewer extends JPanel {
	
	WindowFrame frame;
	PlayerManger playerManger;

	public PlayerViewer(WindowFrame frame, PlayerManger  playerManger) {
		this.frame= frame;
		this.playerManger=playerManger;
		
		System.out.println("***"+playerManger.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("League");
		model.addColumn("Name");
		model.addColumn("Number");
		model.addColumn("Age");
		model.addColumn("Wage");
		
	
		
		for(int i =0; i< playerManger.size(); i++) {
			Vector row = new Vector();
			PlayerInput pi = playerManger.get(i);
			row.add(pi.getleague());
			row.add(pi.getName());
			row.add(pi.getNumber());
			row.add(pi.getAge());
			row.add(pi. getWage());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); 
		
		this.add(sp);
//		this.setSize(300,300);
//		this.setDebugGraphicsOptions(JFrame.EXIT_ON_CLOSE);
//		this.setVisible(true);
//		
		 
	}
}
