package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame f = new JFrame();
	 JPanel p = new JPanel();
	 JButton b1 = new JButton();
	 JButton b2 = new JButton();
	 static ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		new GuestBook().createGUI();
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
	} 
	public void createGUI() {
		 f.setVisible(true);
		 f.add(p);
		 p.add(b1);
		 p.add(b2);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b1.setText("Add names");
		 b2.setText("View names");
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == b1){
			String nEw = JOptionPane.showInputDialog("Add the name of your choice");
			names.add(nEw);
		}
		if(arg0.getSource() == b2){
			for(int i = 0; i < names.size(); i++){
				int position = i + 1;
				JOptionPane.showMessageDialog(null, "Guest #" + position + ": " + names.get(i)); ;
			}
		}
	}
}
