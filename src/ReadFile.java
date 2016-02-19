import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadFile {
	
	public ReadFile(){
		System.out.println("ReadFile");
	}
	
	public static List<String[]> readData() throws IOException{
		CSVReader reader = new CSVReader(new FileReader("data.txt"));
	    List<String[]> myEntries = reader.readAll();
	    reader.close();
	    return myEntries;
	}
	
	
	public static List<String[]> readStructure() throws IOException{
		CSVReader reader = new CSVReader(new FileReader("structure.txt"));
	    List<String[]> structureEntries = reader.readAll();
	    reader.close();
	    return structureEntries;
	}
}
