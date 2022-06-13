package guI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PlayerViewer extends JPanel {

	public PlayerViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Number");
		model.addColumn("Age");
		model.addColumn("Wage");
		model.addColumn("League");
		
//		String column[] = {"Name","Number","Age","Wage","League"};
		
		JTable table = new JTable(new DefaultTableModel());
		JScrollPane sp = new JScrollPane(table); 
		
		this.add(sp);
		this.setSize(300,300);
		this.setDebugGraphicsOptions(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
