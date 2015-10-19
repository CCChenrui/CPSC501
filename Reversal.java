// Author : Chenrui Hu

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reversal {
	
	public static void reverseFile(File input, File output) throws IOException{
		ArrayList<String> str=new ArrayList<String>();		
		Scanner reader ;
		reader = new Scanner (input);
		BufferedWriter writer = null;
		FileOutputStream fos = null;		
		fos = new FileOutputStream(output);
		writer = new BufferedWriter(new OutputStreamWriter(fos));
		// Open File and read strings			
			String tempString = null;
			
			while (reader.hasNext()){
				// using ArrayList to save the inputs strings	
				tempString = reader.nextLine();
				str.add(tempString);
				
			}			
			reader.close();						
	
		// Change the input strings
		// I save the file as lines,
		// and go through the line from end to begin from letter to letter (as char size),
		// store every word as reverse and separate words by space.
		for (int i=str.size()-1; i>=0; i--){
			String line=(String)str.get(i);
			char allline[]=line.toCharArray();
			ArrayList<String> wordlist=new ArrayList<String>();
			//if (line != "") {
				
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
				if (eachword!=""){
					wordlist.add(eachword);
					eachword="";
				}
				
			//}
			
			// output the strings
							
				for (int j = 0; j<=wordlist.size()-2 ; j++){
					String wordstr=(String)wordlist.get(j);
					char word[] = wordstr.toCharArray();
					//output every words in reverse to make word order back normal
					for (int l = word.length-1; l>=0; l--){
						writer.write(word[l]);
					}
					writer.write(' ');
				}
				int j = wordlist.size()-1;
				if (j>=0) {
					String wordstr=(String)wordlist.get(j);
					char word[] = wordstr.toCharArray();
					for (int l = word.length-1; l>=0; l--){
						writer.write(word[l]);
					}
				// switch lines after output one line
					writer.newLine();
				}		
			
					
	}
		writer.close();
   }
	
}
