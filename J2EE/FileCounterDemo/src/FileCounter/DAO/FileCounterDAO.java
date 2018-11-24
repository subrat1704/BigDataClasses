package FileCounter.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileCounterDAO {
	String fileName = "Sample.txt";

	public int ReadCountFromFile() {
		int count=0;
		try {
			FileReader rdr = new FileReader(fileName);
			BufferedReader bufRdr = new BufferedReader(rdr);
			String st=bufRdr.readLine();
			count=Integer.parseInt(st);
			return count;
		} catch (Exception ex) {

		}
		
		return count;
	}
	
	public void SaveToFile(int count)throws Exception
	{
		FileWriter wrtr = new FileWriter(fileName);
		PrintWriter printWrtr = new PrintWriter(wrtr);
		printWrtr.println(count);
		if(printWrtr!=null)
		{
			printWrtr.close();
		}
	}
}
