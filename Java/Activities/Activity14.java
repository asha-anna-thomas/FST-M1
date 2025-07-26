package activities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Activity14 {
	
	public static void main(String[] args) throws IOException {
		//Use the createNewFile() method to create a file.
		File file = new File("src/main/resources/newtest.txt");
		boolean status = file.createNewFile();
		//Write some text into the text file.
		FileUtils.writeStringToFile(file, "Sample text", "UTF8");
		//To read the file the method is readFileToString().
		System.out.println(FileUtils.readFileToString(file, "UTF8"));
		//Next, we create a new directory named "destDir"
		File destinationDirec = new File("src/main/resources/destDir");
		//Copy the text file into this directory using the copyFileToDirectory() method.
		FileUtils.copyFileToDirectory(file, destinationDirec);
		//To read data from this new file using FileUtils class use the getFile() method to get the file. 
		//Then use readFileToString() to read file.
		File newfile = FileUtils.getFile(destinationDirec, "newtest.txt");
		System.out.println(FileUtils.readFileToString(newfile, "UTF8"));
	}

}
