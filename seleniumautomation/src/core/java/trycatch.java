package core.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class trycatch {
	
	    public void readFile() {
	        String fileName = "file does not exist";
	        File file = new File(fileName);
	        try (FileInputStream stream = new FileInputStream(file)) {
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

