import java.io.*;
import java.util.ArrayList;


public class Reversal {
	public static void reverseFile(File input, File output) throws FileNotFoundException{
		ArrayList<String> str=new ArrayList<String>();		
		BufferedReader reader = null;
		
		
		try{
			reader = new BufferedReader (new FileReader(input));
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
			char allline[]=line.toCharArray();
			ArrayList<String> wordlist=new ArrayList<String>();
			if (line != "/0") {
				
				String eachword = new String();
				eachword="";
				for (int j=allline.length-1; j>=0; j--){
					if (allline[j] !=' '){
						eachword += allline[j];
					}
					else if (eachword!=""){
						wordlist.add(eachword);
						eachword="";
					}				
				}
			}
			FileOutputStream fos = null;
			BufferedWriter writer = null;
			fos = new FileOutputStream(output);
			writer = new BufferedWriter(new OutputStreamWriter(fos));
			try{				
				for (int j = wordlist.size()-2; j>=0 ; j--){
					String wordstr=(String)wordlist.get(j);
					char word[] = wordstr.toCharArray();
					for (int l = word.length-1; l>=0; l--){
						writer.write(word[l]);
					}
					writer.write(' ');
				}
				int j = wordlist.size()-1;
				String wordstr=(String)wordlist.get(j);
				char word[] = wordstr.toCharArray();
				for (int l = word.length-1; l>=0; l--){
					writer.write(word[l]);
				}
				writer.write("\r\n");
				
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{		
				if (reader != null ) {
					try{
						reader.close();
					}catch (IOException e1){}
				}			
			
			
		}		
	}	
   }
}
