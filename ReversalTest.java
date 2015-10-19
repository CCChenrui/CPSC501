//Author : Chenrui Hu

import static org.junit.Assert.*;
import java.io.*;
import java.util.Scanner;
import org.junit.Test;

// there will be 4 different cases in ReversalTest
public class ReversalTest {

	@Test
	public void test() {
		
		try{
			File Inputfile  = new File("TestCase1Input.txt");
			File Outputfile = new File("TestCase1Output.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);
			
			writer.println("My name is CHenrui.");

			writer.close();
			
			
			Reversal.reverseFile(Inputfile, Outputfile);
			
			Scanner scan = new Scanner(Outputfile);

		    String Expected= "CHenrui. is name My";
			
		    String Actual = scan.nextLine();
		    
		    scan.close();
		    
		    assertEquals("",Expected,Actual);
			
		} catch (IOException e){
			fail("No exception should be thrown");
		}


	}
	
	@Test
	public void test1() {
		
		try{
			File Inputfile  = new File("TestCase1Input.txt");
			File Outputfile = new File("TestCase1Output.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);
			
			writer.println("My name is CHenrui.");
			writer.println("");
			writer.println("This is my testcase.");
			writer.close();
			
			
			Reversal.reverseFile(Inputfile, Outputfile);
			
			
			
			Scanner scan = new Scanner(Outputfile);

		    String Expected= "testcase. my is This";
			
		    String Actual = scan.nextLine();
		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected= "CHenrui. is name My";
			
		    Actual = scan.nextLine();
		    		    
		    assertEquals("",Expected,Actual);
		    
		    scan.close();
		} catch (IOException e){
			fail("No exception should be thrown");
		}


	}

	
}
