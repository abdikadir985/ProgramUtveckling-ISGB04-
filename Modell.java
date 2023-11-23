package mvcpackage;
import java.io.*;

public class Model {
	
	public Model() {
		/*
		 *  
		 */
	}
    public void saveFile(File selectedFile, String s) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(s))) {
            writer.write(s);
            System.out.println("File Saved!");
        } catch (IOException e) {
            System.out.println("Error! Unable to save file.");
            e.printStackTrace();
        }
    }

    public String openFile(String absoultPath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(toString()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("File Opened!");
        } catch (IOException e) {
            System.out.println("Error! Unable to open file.");
            e.printStackTrace();
        }
        return content.toString();
    }

    public void shuffleText(String string) {
    	//lottorad.main(null);
      
    }
	public String openFile(File selectedFile) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
