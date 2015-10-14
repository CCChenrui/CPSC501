import java.io.*;
import java.util.ArrayList;


public class Reversal {
	public static void reverseFile(File input, File ouput) throws FileNotFoundException{
		ArrayList<String> str=new ArrayList<String>();		
		File file = new File ("input");
		BufferedReader reader = null;
		
		
		try{
			reader = new BufferedReader (new FileReader(file));
			String tempString = null;
			
			while ((tempString = reader.readLine()) != null ){
				str.add(tempString);
			}
			
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			if (reader != null ) {
				try{
					reader.close();
				}catch (IOException e1){}
			}
			
		}
		
		
	}	
}
