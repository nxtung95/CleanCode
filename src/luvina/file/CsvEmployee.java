package luvina.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvEmployee implements IEmployeeFile {

	@Override
	public List<String> readFile(String filePath) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			// Continue first line
			String line = reader.readLine();
			
			List<String> lines = new ArrayList<String>();
			line = reader.readLine();
			while (line != null) {
				lines.add(line);
				System.out.println(line);
				line = reader.readLine();
			}
			return lines;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
