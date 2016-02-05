package sample1;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputer{
	
	private String filePath;

	public void output(String message) throws IOException {
		// TODO Auto-generated method stub
		FileWriter out = new FileWriter(filePath);
		out.write(message);
		out.close();
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
