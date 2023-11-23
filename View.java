package mvcpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.File;

import javax.swing.*;



public class View extends WindowAdapter implements ActionListener {
	/*
	 * 
	 */
	private JFrame f;
    private JTextArea t;
    private JMenu Archive;
    private JMenuBar mainMenu;
    private JMenuItem clear, shuffle, open, save, exit;
    private Model model;

    public View(Model model) {
        this.model = model;
        // ... (rest of the constructor remains unchanged)
        f=new JFrame("LOTTORAD");
		f.addWindowListener(this);
		t = new JTextArea();
		f.add(t);
		mainMenu=new JMenuBar();
		Archive=new JMenu("Archive");
		clear=new JMenuItem("Clear");
		clear.addActionListener(this);
		shuffle=new JMenuItem("shuffle");
		shuffle.addActionListener(this);
		open=new JMenuItem("Open");
		open.addActionListener(this);
		save=new JMenuItem("Save");
		save.addActionListener(this);
		exit=new JMenuItem("exit");
		exit.addActionListener(this);
		Archive.add(clear);
		Archive.add(shuffle);
		Archive.add(open);
		Archive.add(save);
		Archive.addSeparator();
		Archive.add(exit);
		mainMenu.add(Archive);
		f.setJMenuBar(mainMenu);
		



        
        f.pack();
        f.setVisible(true); 
        f.setSize(350, 350);
    }

    // ... (rest of the class remains unchanged)

    public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();

        if ("Clear".equals(menuItem.getText())) {
            t.setText("");
        } else if ("Shuffle".equals(menuItem.getText())) {
            
        	 t.setText(String.valueOf(null));
             lottorad.shuffleAndPrint(null);
        } else if ("Open".equals(menuItem.getText())) {
            
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(open);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                t.setText(model.openFile(selectedFile.getAbsolutePath()));
            }
        } else if ("Save".equals(menuItem.getText())) {
            
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(save);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
            //    model.saveFile(selectedFile.getAbsolutePath(), t.getText());
                model.saveFile(selectedFile, getTextArea());
            }
        } else if ("Exit".equals(menuItem.getText())) {
            System.out.println("Bye Now! :)");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Model model = new Model();
        SwingUtilities.invokeLater(() -> new View(model));
    }

	public void addMenuListeners(ActionListener menuListener) {
		// TODO Auto-generated method stub
		
		
	}

	public void clearTextArea() {
		// TODO Auto-generated method stub
		
	}

	public void setTextArea(String openFile) {
		// TODO Auto-generated method stub
		
	}

	public String getTextArea() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setController(Controller controller) {
		// TODO Auto-generated method stub
		
	}
}
