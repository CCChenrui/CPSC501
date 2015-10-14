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
		
		for (int i=str.size()-1; i>=0 ; i--){
			String line=(String)str.get(i);
			if (line != "/0") {
				ArrayList<String> wordlist=new ArrayList<String>();
				String eachword = new String();
				eachword="";
				for (int j=line.length()-1; j>=0; j--){
					if (line[j] !='a'){
						
					}
					
				}
			}
		}
		
	}	
}
