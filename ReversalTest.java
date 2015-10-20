//Author : Chenrui Hu

import static org.junit.Assert.*;
import java.io.*;
import java.util.Scanner;
import org.junit.Test;

// there will be 5 different kinds of cases in ReversalTest
// normal lines
// short lines, empty lines and long lines
// long lines, empty lines and short lines
// empty lines, normal lines, empty lines, normal lines and empty lines
// empty lines


public class ReversalTest {
	@Test // example, normal lines
	public void testexample() throws IOException {
		
			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("Lorem ipsum dolor sit amet,");
			writer.println("consectetur adipiscing elit.");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected="elit. adipiscing consectetur";
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected="amet, sit dolor ipsum Lorem";
		    Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		   
		    scan.close();
	}
	
	
	@Test //normal lines case
	public void test1() throws IOException {
		
			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("My name is Chenrui.");
			writer.println("This is my testcase.");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected= "testcase. my is This";			
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected= "Chenrui. is name My";			
		    Actual = scan.nextLine();	    		    
		    assertEquals("",Expected,Actual);
		    
		    scan.close();
	}
	
	@Test  // empty lines, normal lines, empty lines, normal lines and empty lines
	public void test2() throws IOException {

			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("");
			writer.println("This will be a long line, and my name is Chenrui Hu.");
			writer.println("");
			writer.println("This is a short line.");
			writer.println("");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected="line. short a is This";
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected="Hu. Chenrui is name my and line, long a be will This";
		    Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		   
		    scan.close();

	}

	@SuppressWarnings("resource")
	@Test  //short lines, empty lines and long lines
	public void test3() throws IOException {
		

			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("My name is Chenrui.");
			writer.println("");
			writer.println("This is my another testcase, I want to make it becomes long.");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected= "long. becomes it make to want I testcase, another my is This";			
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    
		    
		    Expected= "Chenrui. is name My";			
		    Actual = scan.nextLine();	    		    
		    assertEquals("",Expected,Actual);
		    

	}
	
	
	@Test // long lines, empty lines and short lines
	public void test4() throws IOException {
		

			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("This will be a long line, and my name is Chenrui Hu.");
			writer.println("");
			writer.println("This is a short line.");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected="line. short a is This";
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected="Hu. Chenrui is name my and line, long a be will This";
		    Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		   
		    scan.close();

	}
	
	@Test // long lines, empty lines and short lines
	public void test5() throws IOException {
		

			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("");
			writer.println("");
			writer.println("");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected=null;
		    String Actual = null;
		    if (scan.hasNextLine()){
		    	Actual = scan.nextLine();	
		    }
		    assertEquals("",Expected,Actual);
		   
		    scan.close();

	}	
}
