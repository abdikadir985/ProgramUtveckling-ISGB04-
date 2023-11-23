package mvcpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

        // Aaction listeners to the view's menu items
        view.addMenuListeners(new MenuListener());
    }

    // ActionListener for menu items
    private class MenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem menuItem = (JMenuItem) e.getSource();

            if ("Clear".equals(menuItem.getText())) {
                view.clearTextArea();
            } else if ("Shuffle".equals(menuItem.getText())) {
                
                shuffleAndDisplayLottoNumbers();
            } else if ("Open".equals(menuItem.getText())) {
                openFile();
            } else if ("Save".equals(menuItem.getText())) {
                saveFile();
            } else if ("Exit".equals(menuItem.getText())) {
                exitApplication();
            }
        }

        private void openFile() {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(fileChooser);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                view.setTextArea(model.openFile(selectedFile));
            }
        }

        private void saveFile() {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(fileChooser);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                model.saveFile(selectedFile, view.getTextArea());
            }
        }

        private void exitApplication() {
            System.out.println("Bye Now! :)");
            System.exit(0);
        }

        private void shuffleAndDisplayLottoNumbers() {
            StringBuilder lottoNumbers = new StringBuilder();
            lottorad.shuffleAndPrint(lottoNumbers);
            view.setTextArea(lottoNumbers.toString());
        }
        
    }

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(view, model);

        
        view.setController(controller);

        view.setVisible(true);
    }
}
